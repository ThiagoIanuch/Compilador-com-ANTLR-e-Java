package org.example;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.example.generated.GramaticaBaseListener;
import org.example.generated.GramaticaParser;

import java.util.*;

public class Semantico extends GramaticaBaseListener {
    private Variaveis variaveis = new Variaveis();
    private Expressoes expressoes = new Expressoes(variaveis);
    private List<String> erros = new ArrayList<>();
    private List<Comando> comandos = new ArrayList<>();
    private Stack<Boolean> deveExecutarSe = new Stack<>();
    private Stack<Boolean> deveExecutarSenao = new Stack<>();
    private boolean ativarDepurar = false;

    public List<String> getErros() {
        return erros;
    }

    public List<Comando> getComandos() {
        return comandos;
    }

    public Semantico() {
        deveExecutarSe.push(true);
    }

    // Em alguns casos se passar o ParserRuleContext ele vai obter a coluna incorreta
    // Por isso em alguns casos é necessário o TerminalNode
    // Precisa ser revisado
    public void adicionarErro(ParserRuleContext ctx, String mensagem) {
        int linha = ctx.start.getLine();
        int coluna = ctx.start.getCharPositionInLine();
        erros.add("Erro na linha " + linha + ", coluna " + coluna + ": " + mensagem);
    }
    public void adicionarErro(TerminalNode token, String mensagem) {
        int linha = token.getSymbol().getLine();
        int coluna = token.getSymbol().getCharPositionInLine();
        erros.add("Erro na linha " + linha + ", coluna " + coluna + ": " + mensagem);
    }

    @Override
    public void enterDepurar(GramaticaParser.DepurarContext ctx) {
        ativarDepurar = true;
    }

    @Override
    public void enterDeclaracao(GramaticaParser.DeclaracaoContext ctx) {
        Tipo tipo = Tipo.valueOf(ctx.tipo_variavel().getText().toUpperCase());

        for (var variavel : ctx.variavel()) {
            String nome = variavel.NOME().getText();
            String valor = null;

            if(variaveis.variavelDeclaradaNoEscopoAtual(nome)) {
                adicionarErro(variavel, "a variável '" + nome + "' já foi declarada neste escopo!");
            }

            if (variavel.valor() != null) {
                if (variavel.valor().NOME() != null) {
                    if (!variaveis.variavelDeclarada(variavel.valor().NOME().getText())) {
                        adicionarErro(variavel, "a variável '" + variavel.valor().NOME().getText() + "' não foi declarada!");
                        continue;
                    }

                    valor = variaveis.obterVariavel(variavel.valor().NOME().getText()).getValor().toString();
                }

                if (variavel.valor().expressao_aritmetica() != null) {
                    List<GramaticaParser.FatorContext> invalidas = expressoes.verificarVariaveisEmExpressao(variavel.valor().expressao_aritmetica(), nome);

                    for (var fator : invalidas) {
                        adicionarErro(fator, "a variável '" + fator.NOME().getText() + "' não foi declarada!");
                    }

                    float resultado = expressoes.avaliarExpressaoAritmetica(variavel.valor().expressao_aritmetica(), tipo);

                    if (Float.isNaN(resultado)) {
                        adicionarErro(variavel, "a variável '" + nome + "' foi atribuida com uma expressão inválida");
                        continue;
                    }

                    String valorOriginal = variavel.valor().expressao_aritmetica().getText();
                    if (tipo == Tipo.INT && valorOriginal.contains(".")) {
                        adicionarErro(variavel, "a variável '" + nome  + "' foi declarada com o valor incorreto!");
                        continue;
                    }

                    if (tipo == Tipo.INT) {
                        valor = Integer.toString((int) resultado);
                    }
                    else {
                        valor = Float.toString(resultado);
                    }
                }

                if (variavel.valor().BOOLEANO() != null) {
                    valor = variavel.valor().BOOLEANO().getText();
                }

                if (variavel.valor().TEXTO() != null) {
                    valor = variavel.valor().getText();
                }
            }

            if (valor == null) {
                Random random = new Random();

                switch (tipo) {
                    case INT -> valor = Integer.toString(random.nextInt(30000));
                    case FLOAT -> valor = Float.toString(random.nextFloat() * 30000);
                    case BOOL -> valor = "false";
                    case STRING -> valor = "\"\"";
                }
            }

            if(!variaveis.valorValido(tipo, valor)) {
                variaveis.adicionarVariavel(nome, new Variavel(tipo, nome, null));
                adicionarErro(variavel, "a variável '" + nome  + "' foi declarada com o valor incorreto!");
                continue;
            }

            Object valorConvertido = variaveis.converterValor(tipo, valor);
            variaveis.adicionarVariavel(nome, new Variavel(tipo, nome, valorConvertido));

            if (expressoes.podeExecutar(ctx, deveExecutarSe, deveExecutarSenao)) {
                comandos.add(new Comando("Declarar", variavel));;
            }
        }
    }

    @Override
    public void enterAtribuicao(GramaticaParser.AtribuicaoContext ctx) {
        for (var simplesCtx : ctx.atribuicao_simples()) {
            String nome = simplesCtx.NOME().getText();

            if (!variaveis.variavelDeclarada(nome)) {
                adicionarErro(simplesCtx, "a variável '" + nome + "' não foi declarada!");
                continue;
            }

            Variavel variavelExistente = variaveis.obterVariavel(nome);
            Tipo tipo = variavelExistente.getTipo();

            GramaticaParser.ValorContext valorCtx = simplesCtx.valor();
            String valor = null;

            if (valorCtx.NOME() != null) {
                if (!variaveis.variavelDeclarada(valorCtx.NOME().getText())) {
                    adicionarErro(valorCtx, "a variável '" + valorCtx.NOME().getText() + "' não foi declarada!");
                    continue;
                }

                valor = variaveis.obterVariavel(valorCtx.NOME().getText()).getValor().toString();
            }

            if (valorCtx.expressao_aritmetica() != null) {
                var invalidas = expressoes.verificarVariaveisEmExpressao(valorCtx.expressao_aritmetica(), nome);

                for (var fator : invalidas) {
                    adicionarErro(fator, "a variável '" + fator.NOME().getText() + "' não foi declarada!");
                }

                float resultado = expressoes.avaliarExpressaoAritmetica(valorCtx.expressao_aritmetica(), tipo);

                if (Float.isNaN(resultado)) {
                    adicionarErro(simplesCtx, "a variável '" + nome + "' recebeu uma expressão inválida");
                    continue;
                }

                String valorOriginal = simplesCtx.valor().expressao_aritmetica().getText();
                if (tipo == Tipo.INT && valorOriginal.contains(".")) {
                    adicionarErro(simplesCtx, "a variável '" + nome  + "' foi declarada com o valor incorreto!");
                    continue;
                }

                if (tipo == Tipo.INT) {
                    valor = Integer.toString((int) resultado);
                }
                else {
                    valor = Float.toString(resultado);
                }
            }
            if (valorCtx.BOOLEANO() != null) {
                valor = valorCtx.BOOLEANO().getText();
            }
            if (valorCtx.TEXTO() != null) {
                valor = valorCtx.TEXTO().getText();
            }

            if (!variaveis.valorValido(tipo, valor)) {
                adicionarErro(simplesCtx, "a variável '" + nome + "' foi atribuída com um valor incompatível!");
                continue;
            }

            Object valorConvertido = variaveis.converterValor(tipo, valor);
            variavelExistente.setValor(valorConvertido);

            if (expressoes.podeExecutar(ctx, deveExecutarSe, deveExecutarSenao)) {
                comandos.add(new Comando("Atribuir", simplesCtx));
            }
        }
    }

    @Override
    public void enterCondicao(GramaticaParser.CondicaoContext ctx) {
        GramaticaParser.ValorContext esquerda = ctx.expressao_booleana().valor(0);
        String operador = ctx.expressao_booleana().operador().getText();
        GramaticaParser.ValorContext direita = ctx.expressao_booleana().valor(1);
        Object valorEsquerda = null;
        Object valorDireita = null;

        boolean resultado = true;

        if (esquerda.NOME() != null) {
            if (!variaveis.variavelDeclarada(esquerda.NOME().toString())) {
                adicionarErro(ctx, "a variável '" + esquerda.getText() + "' não foi declarada!");
                resultado = false;
            }
            else {
                valorEsquerda = variaveis.obterVariavel(esquerda.NOME().toString()).getValor();
            }
        }
        else if (esquerda.expressao_aritmetica() != null) {
            var invalidas = expressoes.verificarVariaveisEmExpressao(esquerda.expressao_aritmetica(), null);

            for (var fator : invalidas) {
                adicionarErro(fator, "a variável '" + fator.NOME().getText() + "' não foi declarada!");
            }

            float valor = expressoes.avaliarExpressaoAritmetica(esquerda.expressao_aritmetica(), null);

            if (Float.isNaN(valor)) {
                adicionarErro(ctx, "a expressão informada é inválida!");
            }
            else {
                valorEsquerda = expressoes.converterFloatOuInt(valor);
            }
        }
        else if (esquerda.BOOLEANO() != null) {
            valorEsquerda = esquerda.BOOLEANO().getText();
        }
        else if (esquerda.TEXTO() != null) {
            valorEsquerda = esquerda.TEXTO().getText();
        }
        else {
            resultado = false;
        }

        if (direita.NOME() != null) {
            if (!variaveis.variavelDeclarada(direita.NOME().toString())) {
                adicionarErro(ctx, "a variável '" + direita.getText() + "' não foi declarada!");
                resultado = false;
            }
            else {
                valorDireita = variaveis.obterVariavel(direita.NOME().toString()).getValor();
            }
        }
        else if (direita.expressao_aritmetica() != null) {
            var invalidas = expressoes.verificarVariaveisEmExpressao(direita.expressao_aritmetica(), null);

            for (var fator : invalidas) {
                adicionarErro(fator, "a variável '" + fator.NOME().getText() + "' não foi declarada!");
            }

            float valor = expressoes.avaliarExpressaoAritmetica(direita.expressao_aritmetica(), null);

            if (Float.isNaN(valor)) {
                adicionarErro(ctx, "a expressão informada é inválida!");
            }
            else {
                valorDireita = expressoes.converterFloatOuInt(valor);
            }
        }
        else if (direita.BOOLEANO() != null) {
            valorDireita = direita.BOOLEANO().getText();
        }
        else if (direita.TEXTO() != null) {
            valorDireita = direita.TEXTO().getText();
        }
        else {
            resultado = false;
        }

        if(resultado) {
            valorEsquerda = expressoes.converterValor(valorEsquerda.toString());
            valorDireita = expressoes.converterValor(valorDireita.toString());

            if(!expressoes.comparacaoValida(valorEsquerda, operador, valorDireita)) {
                adicionarErro(ctx, "a condição está com uma comparação inválida");
            }
            else {
                resultado = expressoes.compararValores(valorEsquerda, operador, valorDireita);
            }
        }

        if(!expressoes.podeExecutar(ctx, deveExecutarSe, deveExecutarSenao)) {
            deveExecutarSe.push(false);
            deveExecutarSenao.push(false);
            return;
        }

        deveExecutarSe.push(resultado);
        deveExecutarSenao.push(!resultado);
    }

    @Override
    public void exitCondicao(GramaticaParser.CondicaoContext ctx) {
        deveExecutarSe.pop();
        deveExecutarSenao.pop();
    }

    @Override
    public void enterRepeticao_enquanto(GramaticaParser.Repeticao_enquantoContext ctx) {
        GramaticaParser.ValorContext esquerda = ctx.expressao_booleana().valor(0);
        String operador = ctx.expressao_booleana().operador().getText();
        GramaticaParser.ValorContext direita = ctx.expressao_booleana().valor(1);
        Object valorEsquerda = null;
        Object valorDireita = null;

        boolean resultado = true;

        if (esquerda.NOME() != null) {
            if (!variaveis.variavelDeclarada(esquerda.NOME().toString())) {
                adicionarErro(ctx, "a variável '" + esquerda.getText() + "' não foi declarada!");
                resultado = false;
            }
            else {
                valorEsquerda = variaveis.obterVariavel(esquerda.NOME().toString()).getValor();
            }
        }
        else if (esquerda.expressao_aritmetica() != null) {
            var invalidas = expressoes.verificarVariaveisEmExpressao(esquerda.expressao_aritmetica(), null);

            for (var fator : invalidas) {
                adicionarErro(fator, "a variável '" + fator.NOME().getText() + "' não foi declarada!");
            }

            float valor = expressoes.avaliarExpressaoAritmetica(esquerda.expressao_aritmetica(), null);

            if (Float.isNaN(valor)) {
                adicionarErro(ctx, "a expressão informada é inválida!");
            }
            else {
                valorEsquerda = expressoes.converterFloatOuInt(valor);
            }
        }
        else if (esquerda.BOOLEANO() != null) {
            valorEsquerda = esquerda.BOOLEANO().getText();
        }
        else if (esquerda.TEXTO() != null) {
            valorEsquerda = esquerda.TEXTO().getText();
        }
        else {
            resultado = false;
        }

        if (direita.NOME() != null) {
            if (!variaveis.variavelDeclarada(direita.NOME().toString())) {
                adicionarErro(ctx, "a variável '" + direita.getText() + "' não foi declarada!");
                resultado = false;
            }
            else {
                valorDireita = variaveis.obterVariavel(direita.NOME().toString()).getValor();
            }
        }
        else if (direita.expressao_aritmetica() != null) {
            var invalidas = expressoes.verificarVariaveisEmExpressao(direita.expressao_aritmetica(), null);

            for (var fator : invalidas) {
                adicionarErro(fator, "a variável '" + fator.NOME().getText() + "' não foi declarada!");
            }

            float valor = expressoes.avaliarExpressaoAritmetica(direita.expressao_aritmetica(), null);

            if (Float.isNaN(valor)) {
                adicionarErro(ctx, "a expressão informada é inválida!");
            }
            else {
                valorDireita = expressoes.converterFloatOuInt(valor);
            }
        }
        else if (direita.BOOLEANO() != null) {
            valorDireita = direita.BOOLEANO().getText();
        }
        else if (direita.TEXTO() != null) {
            valorDireita = direita.TEXTO().getText();
        }
        else {
            resultado = false;
        }

        if(resultado) {
            valorEsquerda = expressoes.converterValor(valorEsquerda.toString());
            valorDireita = expressoes.converterValor(valorDireita.toString());

            if(!expressoes.comparacaoValida(valorEsquerda, operador, valorDireita)) {
                adicionarErro(ctx, "a condição está com uma comparação inválida");
            }
            else {
                resultado = expressoes.compararValores(valorEsquerda, operador, valorDireita);
            }
        }

        if(!expressoes.podeExecutar(ctx, deveExecutarSe, deveExecutarSenao)) {
            deveExecutarSe.push(false);
            deveExecutarSenao.push(false);
            return;
        }
    }

    @Override
    public void enterImprimir(GramaticaParser.ImprimirContext ctx) {
        for (var valorCtx : ctx.valor()) {
            if (valorCtx.NOME() != null) {
                if (!variaveis.variavelDeclarada(valorCtx.NOME().getText())) {
                    adicionarErro(valorCtx, "a variável '" + valorCtx.NOME().getText() + "' não foi declarada!");
                    continue;
                }
            }

            if (valorCtx.expressao_aritmetica() != null) {
                var invalidas = expressoes.verificarVariaveisEmExpressao(valorCtx.expressao_aritmetica(), null);

                for (var fator : invalidas) {
                    adicionarErro(fator, "a variável '" + fator.NOME().getText() + "' não foi declarada!");
                }

                float resultado = expressoes.avaliarExpressaoAritmetica(valorCtx.expressao_aritmetica(), null);

                if (Float.isNaN(resultado)) {
                    adicionarErro(valorCtx, "a expressão informada é inválida!");
                    continue;
                }
            }
        }

        if (expressoes.podeExecutar(ctx, deveExecutarSe, deveExecutarSenao)) {
            comandos.add(new Comando("Imprimir", ctx.valor()));
        }
    }

    @Override
    public void enterLer(GramaticaParser.LerContext ctx) {
        List<String> variaveisParaLer = new ArrayList<>();

        for (TerminalNode token : ctx.NOME()) {
            String nome = token.getText();

            if (!variaveis.variavelDeclarada(nome)) {
                adicionarErro(token, "a variável '" + nome + "' não foi declarada!");
                continue;
            }

            variaveisParaLer.add(nome);
        }

        if (!variaveisParaLer.isEmpty() && expressoes.podeExecutar(ctx, deveExecutarSe, deveExecutarSenao)) {
            comandos.add(new Comando("Ler", variaveisParaLer));
        }
    }

    @Override
    public void enterBloco(GramaticaParser.BlocoContext ctx) {
        variaveis.abrirEscopo();

        if (expressoes.podeExecutar(ctx, deveExecutarSe, deveExecutarSenao)) {
            comandos.add(new Comando("AbrirEscopo", null));
        }
    }

    @Override
    public void exitBloco(GramaticaParser.BlocoContext ctx) {
        variaveis.fecharEscopo();

        if (expressoes.podeExecutar(ctx, deveExecutarSe, deveExecutarSenao)) {
            comandos.add(new Comando("FecharEscopo", null));
        }
    }

    // Usado apenas quando o depurar é ativado com --debug no início do código
    @Override
    public void exitPrograma(GramaticaParser.ProgramaContext ctx) {
        if(ativarDepurar) {
            variaveis.listarVariaveis();

            System.out.println("\nLista de comandos:");
            for (int i = 0; i < comandos.size(); i++) {
                System.out.println("Tipo: " + comandos.get(i).tipo + ", Valor: " + comandos.get(i).valor);
            }
        }
    }
}
