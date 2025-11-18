package org.example;

import org.antlr.v4.runtime.tree.ParseTree;
import org.example.generated.GramaticaParser;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Stack;

public class Expressoes {
    private Variaveis variaveis;

    public Expressoes(Variaveis variaveis) {
        this.variaveis = variaveis;
    }

    // Funções para realizar as avaliações das expressões aritméticas
    public float avaliarExpressaoAritmetica(GramaticaParser.Expressao_aritmeticaContext ctx, Tipo tipoVariavel) {
        float resultado = avaliarTermo(ctx.termo(0), tipoVariavel);

        int operadorIndex = 1;

        for (int i = 1; i < ctx.termo().size(); i++) {
            String operador = ctx.getChild(operadorIndex).getText();
            float valor = avaliarTermo(ctx.termo(i), tipoVariavel);

            if (operador.equals("+")) {
                resultado += valor;
            }
            else {
                resultado -= valor;
            }

            operadorIndex += 2;
        }

        return resultado;
    }

    public float avaliarTermo(GramaticaParser.TermoContext ctx, Tipo tipoVariavel) {
        float resultado = avaliarFator(ctx.fator(0), tipoVariavel);

        int operadorIndex = 1;
        for (int i = 1; i < ctx.fator().size(); i++) {
            String operador = ctx.getChild(operadorIndex).getText();
            float valor = avaliarFator(ctx.fator(i), tipoVariavel);

            if (operador.equals("*")) {
                resultado *= valor;
            }
            else {
                resultado = tipoVariavel == Tipo.INT ? (int)(resultado / valor) : resultado / valor;
            }

            operadorIndex += 2;
        }

        return resultado;
    }

    public float avaliarFator(GramaticaParser.FatorContext ctx, Tipo tipoVariavel) {
        if (ctx.NOME() != null) {
            if(!variaveis.variavelDeclarada(ctx.NOME().getText()) ){
                Random random = new Random();
                return random.nextFloat(30000);
            }

            if (variaveis.obterVariavel(ctx.NOME().getText()).getTipo() == Tipo.BOOL ||
                    variaveis.obterVariavel(ctx.NOME().getText()).getTipo() == Tipo.STRING) {
                return Float.NaN;
            }

            Variavel variavel = variaveis.obterVariavel(ctx.NOME().getText());
            return ((Number) variavel.getValor()).floatValue();
        }

        if (ctx.INTEIRO() != null) {
            return Integer.parseInt(ctx.INTEIRO().getText());
        }

        if (ctx.DECIMAL() != null) {
            return Float.parseFloat(ctx.DECIMAL().getText());
        }

        if (ctx.expressao_aritmetica() != null) {
            return avaliarExpressaoAritmetica(ctx.expressao_aritmetica(), tipoVariavel);
        }

        return Float.NaN;
    }

    // Função para verificar quais variáveis existem na expressão para saber se elas já foram declaradas ou não
    // O nome da variával atual é ignorada, pois por exemplo: int x = x + 10; deve ser válido
    public List<GramaticaParser.FatorContext> verificarVariaveisEmExpressao(GramaticaParser.Expressao_aritmeticaContext ctx, String nomeIgnorar) {
        List<GramaticaParser.FatorContext> invalidas = new ArrayList<>();

        for (GramaticaParser.TermoContext termo : ctx.termo()) {
            for (GramaticaParser.FatorContext fator : termo.fator()) {

                if (fator.NOME() != null && !fator.NOME().getText().equals(nomeIgnorar) && !variaveis.variavelDeclarada(fator.NOME().getText())) {
                    invalidas.add(fator);
                }

                if (fator.expressao_aritmetica() != null) {
                    invalidas.addAll(verificarVariaveisEmExpressao(fator.expressao_aritmetica(), nomeIgnorar));
                }
            }
        }

        return invalidas;
    }

    public boolean expressaoFloat(GramaticaParser.Expressao_aritmeticaContext ctx) {
        for (var ctxExpressao : ctx.children) {
            String valor = ctxExpressao.getText();

            if (valor.matches("-?\\d+\\.\\d+")) {
                return true;
            }

            if (variaveis.variavelDeclarada(valor) && variaveis.obterVariavel(valor).getTipo() == Tipo.FLOAT) {
                return true;
            }
        }

        return false;
    }

    // Isso aqui serve para a conversão para INT ou FLOAT ter um comportamento parecido com C++, então
    // se o FLOAT for igual a sua versão INT significa que o decimal é 0, com isso
    // ele não irá mostrar as casas decimais pois irá converter para inteiro
    public String converterFloatOuInt(float valor) {
        if (valor == (int) valor) {
            return Integer.toString((int) valor);
        }
        return Float.toString(valor);
    }

    // Funções para as expressões booleanas do IF e ELSE
    public boolean compararValores(Object valorEsquerda, String operador, Object valorDireita) {
        switch (operador) {
            case "==":
                return valorEsquerda.equals(valorDireita);
            case "!=":
                return !valorEsquerda.equals(valorDireita);
            case ">=":
                return ((Number) valorEsquerda).floatValue() >= ((Number) valorDireita).floatValue();
            case "<=":
                return ((Number) valorEsquerda).floatValue() <= ((Number) valorDireita).floatValue();
            case ">":
                return ((Number) valorEsquerda).floatValue() > ((Number) valorDireita).floatValue();
            case "<":
                return ((Number) valorEsquerda).floatValue() < ((Number) valorDireita).floatValue();
            default:
                return false;
        }
    }

    public Object converterValor(String valor) {
        if (valor.matches("-?[0-9]+")) {
            return Integer.parseInt(valor);
        }
        if (valor.matches("-?[0-9]+(\\.[0-9]+)?")) {
            return Float.parseFloat(valor);
        }
        if (valor.equals("true") || valor.equals("false")) {
            return Boolean.parseBoolean(valor);
        }
        if (valor.matches("\".*\"")) {
            return valor;
        }

        return null;
    }

    // Essa parte é necessária para verificar se está dentro do IF ou do ELSE e assim decidir se o que está lá dentro
    // deve ser executado ou não
    public boolean podeExecutar(ParseTree ctx, Stack<Boolean> condicaoVerdadeira, Stack<Boolean> deveExecutarSenao) {
        ParseTree atual = ctx;
        GramaticaParser.BlocoContext blocoAtual = null;
        GramaticaParser.CondicaoContext condicaoPai = null;

        while (atual != null) {
            if (atual instanceof GramaticaParser.BlocoContext bloco) {
                ParseTree pai = bloco.getParent();
                if (pai instanceof GramaticaParser.CondicaoContext cond) {
                    blocoAtual = bloco;
                    condicaoPai = cond;
                    break;
                }
            }
            atual = atual.getParent();
        }

        if (condicaoPai == null || blocoAtual == null) {
            return true;
        }

        if (condicaoPai.bloco(0) == blocoAtual) {
            return !condicaoVerdadeira.isEmpty() && condicaoVerdadeira.peek();
        }
        else if (condicaoPai.bloco().size() > 1 && condicaoPai.bloco(1) == blocoAtual) {
            return !deveExecutarSenao.isEmpty() && deveExecutarSenao.peek();
        }

        return false;
    }
}