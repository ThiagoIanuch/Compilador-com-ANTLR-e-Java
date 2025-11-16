package org.example;

import java.util.LinkedHashMap;

public class Variaveis {
    private LinkedHashMap<String, Variavel> variaveis = new LinkedHashMap<>();

    public void adicionarVariavel(String nome, Variavel variavel) {
        variaveis.put(nome, variavel);
    }

    public Variavel obterVariavel(String nome) {
        return variaveis.get(nome);
    }

    public boolean variavelDeclarada(String nome) {
        return variaveis.containsKey(nome);
    }

    public boolean valorValido(Tipo tipo, String valor) {
        if(valor == null) {
            return true;
        }

        switch(tipo) {
            case INT:
                if (valor.matches("\".*\"") || !valor.matches("-?[0-9]+")) {
                    return false;
                }
                return true;

            case FLOAT:
                if (valor.matches("\".*\"") || !valor.matches("-?[0-9]+(\\.[0-9]+)?")) {
                    return false;
                }
                return true;

            case BOOL:
                if(!valor.equals("true") && !valor.equals("false")) {
                    return false;
                }
                return true;

            case STRING:
                if (!valor.matches("\".*\"")) {
                    return false;
                }
                return true;

            default:
                return false;
        }
    }

    public Object converterValor(Tipo tipo, String valor) {
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
                return null;
        }
    }

    // Usado apenas para debugar, será removido
    public void listarVariaveis() {
        System.out.println("\nVariáveis declaradas: ");
        for (var entry : variaveis.entrySet()) {
            System.out.println(entry.getValue());
        }
    }

}
