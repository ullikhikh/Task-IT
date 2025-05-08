package ru.vsu.cs;

import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.*;

public class ASTPrinter {
    private static final String RESET = "\u001B[0m";
    private static final String RED = "\u001B[31m";
    private static final String GREEN = "\u001B[32m";
    private static final String YELLOW = "\u001B[33m";
    private static final String BLUE = "\u001B[34m";
    private static final String PURPLE = "\u001B[35m";
    private static final String CYAN = "\u001B[36m";

    private final StringBuilder output = new StringBuilder();
    private int indentLevel = 0;

    public void visit(ParseTree node) {
        if (node instanceof TerminalNodeImpl) {
            printTerminal((TerminalNodeImpl) node);
        } else if (node instanceof RuleContext) {
            printRuleContext((RuleContext) node);
        }
    }

    private void printTerminal(TerminalNodeImpl node) {
        printIndent();
        output.append(YELLOW)
                .append("Token: ")
                .append(RED)
                .append(node.getText())
                .append(RESET)
                .append("\n");
    }

    private void printRuleContext(RuleContext ctx) {
        printIndent();
        String ruleName = ru.vsu.cs.CSubsetParser.ruleNames[ctx.getRuleIndex()];
        output.append(PURPLE)
                .append(ctx.getClass().getSimpleName())
                .append(RESET)
                .append(": ")
                .append(CYAN)
                .append(ruleName)
                .append(RESET)
                .append("\n");

        indentLevel++;
        for (int i = 0; i < ctx.getChildCount(); i++) {
            visit(ctx.getChild(i));
        }
        indentLevel--;
    }

    private void printIndent() {
        output.append("  ".repeat(Math.max(0, indentLevel)));
    }

    public String getOutput() {
        return output.toString();
    }

    public void printToConsole() {
        String border = "=".repeat(50);
        System.out.println("\n" + GREEN + border + " AST Tree " + border + RESET);
        System.out.println(output);
        System.out.println(GREEN + "=".repeat(100) + RESET + "\n");
    }
}