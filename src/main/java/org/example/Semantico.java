package org.example;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.example.generated.GramaticaBaseListener;
import org.example.generated.GramaticaParser;

import java.util.*;

public class Semantico extends GramaticaBaseListener {
    private Variaveis variaveis = new Variaveis();
    private Expressoes expressoes = new Expressoes(variaveis);
    private List<String> erros = new ArrayList<>();
    private List<Comandos> comandos = new ArrayList<>();
    private Stack<Boolean> condicaoVerdadeira = new Stack<>();
    private Stack<Boolean> deveExecutarSenao = new Stack<>();
    private boolean ativarDepurar = false;

    public List<String> getErros() {
        return erros;
    }

    public List<Comandos> getComandos() {
        return comandos;
    }

    public Semantico() {
        condicaoVerdadeira.push(true);
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

                    if (tipo == Tipo.INT && resultado % 1 != 0) {
                        adicionarErro(variavel, "a variável '" + nome  + "' foi declarada com o valor incorreto!");
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
                    case FLOAT -> Float.toString(random.nextFloat() * 30000);
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

            if (expressoes.podeExecutar(ctx, condicaoVerdadeira, deveExecutarSenao)) {
                comandos.add(new Comandos("Declarar", variavel));;
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

                if (tipo == Tipo.INT && resultado % 1 != 0) {
                    adicionarErro(simplesCtx, "a variável '" + nome  + "' foi declarada com o valor incorreto!");
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

            if (expressoes.podeExecutar(ctx, condicaoVerdadeira, deveExecutarSenao)) {
                comandos.add(new Comandos("Atribuir", simplesCtx));
            }
        }
    }

    @Override
    public void enterCondicao(GramaticaParser.CondicaoContext ctx) {
        ParseTree esquerda = ctx.expressao_booleana().children.get(0);
        String operador = ctx.expressao_booleana().operador().getText();
        ParseTree direita = ctx.expressao_booleana().children.get(2);
        Object valorEsquerda = null;
        Object valorDireita = null;

        // Primeiro verifica se o valor da esquerda e direita veio de 'NOME' ou de 'valor', se veio de 'NOME' quer dizer que é uma variável, se não é um valor.
        // Se for uma variável então verifica se a variável existe ou não e obtem o seu valor, se não for apenas passa o valor digitado.
        if (esquerda instanceof TerminalNode && ((TerminalNode) esquerda).getSymbol().getType() == GramaticaParser.NOME) {
            if(!variaveis.variavelDeclarada(esquerda.getText())) {
                throw new RuntimeException("Erro: a variavel " + esquerda.getText() + " não foi declarada anteriormente!");
            }
            valorEsquerda = variaveis.obterVariavel(esquerda.getText()).getValor();
        }
        else {
            valorEsquerda = expressoes.converterValor(esquerda.getText());
        }

        if (direita instanceof TerminalNode && ((TerminalNode) direita).getSymbol().getType() == GramaticaParser.NOME) {
            if(!variaveis.variavelDeclarada(direita.getText())) {
                throw new RuntimeException("Erro: a variavel " + direita.getText() + " não foi declarada anteriormente!");
            }
            valorDireita = variaveis.obterVariavel(direita.getText()).getValor();
        }
        else {
            valorDireita = expressoes.converterValor(direita.getText());
        }

        boolean resultado = expressoes.compararValores(valorEsquerda, operador, valorDireita);

        if(!expressoes.podeExecutar(ctx, condicaoVerdadeira, deveExecutarSenao)) {
            condicaoVerdadeira.push(false);
            deveExecutarSenao.push(false);
            return;
        }

        condicaoVerdadeira.push(resultado);
        deveExecutarSenao.push(!resultado);
    }

    @Override
    public void exitCondicao(GramaticaParser.CondicaoContext ctx) {
        condicaoVerdadeira.pop();
        deveExecutarSenao.pop();
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

        if (expressoes.podeExecutar(ctx, condicaoVerdadeira, deveExecutarSenao)) {
            comandos.add(new Comandos("Imprimir", ctx.valor()));
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

        if (!variaveisParaLer.isEmpty() && expressoes.podeExecutar(ctx, condicaoVerdadeira, deveExecutarSenao)) {
            comandos.add(new Comandos("Ler", variaveisParaLer));
        }
    }


    @Override
    public void enterBloco(GramaticaParser.BlocoContext ctx) {
        variaveis.abrirEscopo();

        if (expressoes.podeExecutar(ctx, condicaoVerdadeira, deveExecutarSenao)) {
            comandos.add(new Comandos("AbrirEscopo", null));
        }
    }

    @Override
    public void exitBloco(GramaticaParser.BlocoContext ctx) {
        variaveis.fecharEscopo();

        if (expressoes.podeExecutar(ctx, condicaoVerdadeira, deveExecutarSenao)) {
            comandos.add(new Comandos("FecharEscopo", null));
        }
    }

    // Usado apenas quando o depurar é ativado com --debug no início do código
    @Override
    public void exitPrograma(GramaticaParser.ProgramaContext ctx) {
        if(ativarDepurar) {
            variaveis.listarVariaveis();
        }
    }
}
