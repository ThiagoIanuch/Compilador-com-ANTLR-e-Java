package org.example;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.example.generated.GramaticaLexer;
import org.example.generated.GramaticaParser;

public class Main {
    public static final String VERMELHO = "\u001B[31m";
    public static final String VERDE = "\u001B[32m";
    public static final String REINICIAR = "\u001B[0m";

    public static void main(String[] args) {
        try {
            CharStream entrada = CharStreams.fromFileName("Entrada.txt");

            GramaticaLexer lexico = new GramaticaLexer(entrada);
            lexico.removeErrorListeners();
            Lexico analisadorLexico = new Lexico();
            lexico.addErrorListener(analisadorLexico);

            CommonTokenStream tokens = new CommonTokenStream(lexico);

            GramaticaParser sintatico = new GramaticaParser(tokens);
            sintatico.removeErrorListeners();
            Sintatico analisadorSintatico = new Sintatico();
            sintatico.addErrorListener(analisadorSintatico);

            ParseTreeWalker percorrerArvore  = new ParseTreeWalker();
            ParseTree arvore = sintatico.programa();
            Semantico analisadorSemantico = new Semantico();
            percorrerArvore.walk(analisadorSemantico, arvore);

            if (!analisadorLexico.getErros().isEmpty()) {
                System.out.println("\n" + VERMELHO  + "Foram encontrados erros léxicos na execução do programa: " + REINICIAR);

                for (String erro : analisadorLexico.getErros()) {
                    System.out.println(VERMELHO + erro + REINICIAR);
                }
            }

            if (!analisadorSintatico.getErros().isEmpty()) {
                System.out.println("\n" + VERMELHO  + "Foram encontrados erros sintáticos na execução do programa: " + REINICIAR);

                for (String erro : analisadorSintatico.getErros()) {
                    System.out.println(VERMELHO + erro + REINICIAR);
                }
            }

            if (!analisadorSemantico.getErros().isEmpty()) {
                System.out.println("\n" + VERMELHO  + "Foram encontrados erros semânticos na execução do programa: " + REINICIAR);
                for (String erro : analisadorSemantico.getErros()) {
                    System.out.println(VERMELHO + erro + REINICIAR);
                }
            }

            if(!analisadorLexico.getErros().isEmpty() || !analisadorSintatico.getErros().isEmpty() || !analisadorSemantico.getErros().isEmpty()) {
                return;
            }

            System.out.println("\n" + VERDE + "Nenhum erro léxico encontrado!" + REINICIAR);
            System.out.println(VERDE + "Nenhum erro sintático encontrado!" + REINICIAR);
            System.out.println(VERDE + "Nenhum erro semântico encontrado!\n" + REINICIAR);
            Interpretador interpretador = new Interpretador();
            interpretador.executar(analisadorSemantico.getComandos());

            System.out.println(arvore.toStringTree(sintatico));
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}