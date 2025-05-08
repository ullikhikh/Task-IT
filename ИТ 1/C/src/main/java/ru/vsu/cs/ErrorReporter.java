package ru.vsu.cs;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;

public class ErrorReporter {
    private boolean hasErrors = false;

    public void reportError(ParserRuleContext ctx, String message) {
        reportError(ctx.getStart(), message);
    }

    public void reportError(Token token, String message) {
        hasErrors = true;
        System.err.printf("Semantic error at line %d:%d - %s%n",
                token.getLine(),
                token.getCharPositionInLine(),
                message);
    }

    public boolean hasErrors() {
        return hasErrors;
    }
}