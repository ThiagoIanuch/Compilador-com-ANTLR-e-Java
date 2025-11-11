package org.example;

import java.util.LinkedHashMap;

public class Variaveis {
    private LinkedHashMap<String, Variavel> variaveis = new LinkedHashMap<>();

    public void adicionarVariavel(String nome, Variavel variavel) {
        variaveis.put(nome, variavel);
    }

    public void listarVariaveis() {
        System.out.println("Variáveis declaradas: ");
        for (var entry : variaveis.entrySet()) {
            System.out.println(entry.getValue());
        }
    }

    public boolean variavelExistente(String nome) {
        return variaveis.containsKey(nome);
    }
}
