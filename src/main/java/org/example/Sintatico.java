package org.example;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import java.util.ArrayList;
import java.util.List;

public class Sintatico extends BaseErrorListener
{
    private List<String> erros = new ArrayList<>();

    public List<String> getErros() {
        return erros;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        erros.add("Erro na linha " + line + ", coluna " + charPositionInLine + ": " + msg);
    }
}
