package org.example;

import org.example.generated.GramaticaParser;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Expressoes {
    private Variaveis variaveis;

    public Expressoes(Variaveis variaveis) {
        this.variaveis = variaveis;
    }

    // Funções para realizar as avaliações das expressões aritméticas
    public double avaliarExpressaoAritmetica(GramaticaParser.Expressao_aritmeticaContext ctx, Tipo tipoVariavel) {
        double resultado = avaliarTermo(ctx.termo(0), tipoVariavel);

        int operadorIndex = 1;

        for (int i = 1; i < ctx.termo().size(); i++) {
            String operador = ctx.getChild(operadorIndex).getText();
            double valor = avaliarTermo(ctx.termo(i), tipoVariavel);

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

    public double avaliarTermo(GramaticaParser.TermoContext ctx, Tipo tipoVariavel) {
        double resultado = avaliarFator(ctx.fator(0), tipoVariavel);

        int operadorIndex = 1;
        for (int i = 1; i < ctx.fator().size(); i++) {
            String operador = ctx.getChild(operadorIndex).getText();
            double valor = avaliarFator(ctx.fator(i), tipoVariavel);

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

    public double avaliarFator(GramaticaParser.FatorContext ctx, Tipo tipoVariavel) {
        if (ctx.NOME() != null) {
            if(!variaveis.variavelDeclarada(ctx.NOME().getText()) ){
                Random random = new Random();
                return random.nextDouble(30000);
            }

            if (variaveis.obterVariavel(ctx.NOME().getText()).getTipo() == Tipo.BOOL ||
                    variaveis.obterVariavel(ctx.NOME().getText()).getTipo() == Tipo.STRING) {
                return Double.NaN;
            }

            Variavel variavel = variaveis.obterVariavel(ctx.NOME().getText());
            return ((Number) variavel.getValor()).doubleValue();
        }

        if (ctx.INTEIRO() != null) {
            return Integer.parseInt(ctx.INTEIRO().getText());
        }

        if (ctx.DECIMAL() != null) {
            return Double.parseDouble(ctx.DECIMAL().getText());
        }

        if (ctx.expressao_aritmetica() != null) {
            return avaliarExpressaoAritmetica(ctx.expressao_aritmetica(), tipoVariavel);
        }

        return Double.NaN;
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

    // Funções para as expressões booleanas do IF e ELSE
    public boolean compararValores(Object valorEsquerda, String operador, Object valorDireita) {
        switch (operador) {
            case "==":
                return valorEsquerda.equals(valorDireita);
            case "!=":
                return !valorEsquerda.equals(valorDireita);
            case ">=":
                return ((Number) valorEsquerda).doubleValue() >= ((Number) valorDireita).doubleValue();
            case "<=":
                return ((Number) valorEsquerda).doubleValue() <= ((Number) valorDireita).doubleValue();
            case ">":
                return ((Number) valorEsquerda).doubleValue() > ((Number) valorDireita).doubleValue();
            case "<":
                return ((Number) valorEsquerda).doubleValue() < ((Number) valorDireita).doubleValue();
            default:
                return false;
        }
    }

    public Object converterValor(String valor) {
        if (valor.matches("-?[0-9]+")) {
            return Integer.parseInt(valor);
        }
        if (valor.matches("-?[0-9]+(\\.[0-9]+)?")) {
            return Double.parseDouble(valor);
        }
        if (valor.equals("true") || valor.equals("false")) {
            return Boolean.parseBoolean(valor);
        }
        if (valor.matches("\".*\"")) {
            return valor;
        }

        return null;
    }
}