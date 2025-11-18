package org.example;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.example.generated.GramaticaLexer;
import org.example.generated.GramaticaParser;

public class Main {
    public static final String RED = "\u001B[31m";
    public static final String RESET = "\u001B[0m";

    public static void main(String[] args) {
        try {
            Semantico semantico = new Semantico();

            CharStream charStream = CharStreams.fromFileName("Entrada.txt");

            GramaticaLexer lexer = new GramaticaLexer(charStream);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            GramaticaParser parser = new GramaticaParser(tokens);
            ParseTreeWalker walker = new ParseTreeWalker();

            ParseTree tree = parser.programa();
            walker.walk(semantico, tree);

            if (!semantico.getErros().isEmpty()) {
                for (String erro : semantico.getErros()) {
                    System.out.println(RED + erro + RESET);
                }
                return;
            }
            else {
                System.out.println("\nNenhum erro semântico encontrado.\n");
                Interpretador interpretador = new Interpretador();
                interpretador.executar(semantico.getComandos());
            }

            System.out.println(tree.toStringTree(parser));
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}