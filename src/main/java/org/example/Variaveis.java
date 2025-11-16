package org.example;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Stack;

public class Variaveis {
    private Stack<LinkedHashMap<String, Variavel>> escopos = new Stack<>();

    private List<LinkedHashMap<String, Variavel>> escoposFechados = new ArrayList<>(); // USADO APENAS PARA DEBUGAR

    public Variaveis() {
        escopos.push(new LinkedHashMap<>());
    }

    public void abrirEscopo() {
        escopos.push(new LinkedHashMap<>());
    }

    public void fecharEscopo() {

        if (escopos.size() > 1) {
            //escopos.pop();
            LinkedHashMap<String, Variavel> escopoFechado = escopos.pop();
            escoposFechados.add(escopoFechado);
        }
    }

    public void adicionarVariavel(String nome, Variavel variavel) {
        escopos.peek().put(nome, variavel);
    }

    public Variavel obterVariavel(String nome) {
        for (int i = escopos.size() - 1; i >= 0; i--) {
            if (escopos.get(i).containsKey(nome)) {
                return escopos.get(i).get(nome);
            }
        }
        return null;
    }

    public boolean variavelDeclarada(String nome) {
        for (int i = escopos.size() - 1; i >= 0; i--) {
            if (escopos.get(i).containsKey(nome)) {
                return true;
            }
        }
        return false;
    }

    public boolean variavelDeclaradaNoEscopoAtual(String nome) {
        return escopos.peek().containsKey(nome);
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
        System.out.println("\nVariáveis declaradas por escopo:");

        int nivel = 0;

        // Lista escopos já fechados
        for (int i = escoposFechados.size() - 1; i >= 0; i--) {
            LinkedHashMap<String, Variavel> escopo = escoposFechados.get(i);
            System.out.println("Escopo nível " + nivel + " (fechado):");
            for (var entry : escopo.entrySet()) {
                System.out.println("  " + entry.getValue());
            }
            nivel++;
        }
    }


}
