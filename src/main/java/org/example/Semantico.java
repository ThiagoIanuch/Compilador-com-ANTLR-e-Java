package org.example;

import org.example.generated.GramaticaBaseListener;
import org.example.generated.GramaticaParser;

public class Semantico extends GramaticaBaseListener {
    private Variaveis variaveis = new Variaveis();

    @Override
    public void enterDeclaracao(GramaticaParser.DeclaracaoContext ctx) {
        Tipo tipo = Tipo.valueOf(ctx.tipo_variavel().getText().toUpperCase());

        for (var v : ctx.variavel()) {
            String nome = v.NOME().getText();
            String valor = v.valor() != null ? v.valor().getText() : null;

            if(!variavelJaDeclarada(nome) && valorValido(tipo, nome, valor)) {
                Object valorConvertido = converterValor(tipo, nome, valor);;
                variaveis.adicionarVariavel(nome, new Variavel(tipo, nome, valorConvertido));
            }
        }
    }

    @Override
    public void exitPrograma(GramaticaParser.ProgramaContext ctx) {
        variaveis.listarVariaveis();
    }

    public boolean variavelJaDeclarada(String nome) {
        if(variaveis.variavelExistente(nome)) {
            throw new RuntimeException("Erro: a variável " + nome + " já foi declarada anteriormente!");
        }

        return false;
    }

    public boolean valorValido(Tipo tipo, String nome, String valor) {
        if(valor == null) {
            return true;
        }

        switch(tipo) {
            case INT:
                if (valor.matches("\".*\"") || !valor.matches("-?[0-9]+")) {
                    throw new RuntimeException("Erro: a variável " + nome + " do tipo " + tipo + " foi declarada com um valor incorreto!");
                }
                return true;

            case FLOAT:
                if (valor.matches("\".*\"") || !valor.matches("-?[0-9]+(\\.[0-9]+)?")) {
                    throw new RuntimeException("Erro: a variável " + nome + " do tipo " + tipo + " foi declarada com um valor incorreto!");
                }
                return true;

            case BOOL:
                if(!valor.equals("true") && !valor.equals("false")) {
                    throw new RuntimeException("Erro: a variável " + nome + " do tipo " + tipo + " foi declarada com um valor incorreto!");
                }
                return true;

            case STRING:
                if (!valor.matches("\".*\"")) {
                    throw new RuntimeException("Erro: a variável " + nome + " do tipo " + tipo + " foi declarada com um valor incorreto!");
                }
                return true;

            default:
                throw new RuntimeException("Erro: a variável " + nome + " do tipo " + tipo + " foi declarada com um valor incorreto!");
        }
    }

    public Object converterValor(Tipo tipo, String nome, String valor) {
        if(valor == null) {
            return null;
        }

        switch (tipo) {
            case INT:
                return Integer.parseInt(valor);
            case FLOAT:
                return Float.parseFloat(valor);
            case BOOL:
                return Boolean.parseBoolean(valor);
            case STRING:
                return valor;
            default:
                throw new RuntimeException("Erro: a variável " + nome + " do tipo " + tipo + " foi declarada com um valor incorreto!");
        }
    }
}
