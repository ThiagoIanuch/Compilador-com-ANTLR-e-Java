package org.example;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.example.generated.GramaticaLexer;
import org.example.generated.GramaticaParser;

public class Main {
    public static void main(String[] args) {
        String input = "int X;";
        CharStream charStream = CharStreams.fromString(input);

        GramaticaLexer lexer = new GramaticaLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GramaticaParser parser = new GramaticaParser(tokens);

        ParseTree tree = parser.decl();

        System.out.println(tree.toStringTree(parser));
    }
}