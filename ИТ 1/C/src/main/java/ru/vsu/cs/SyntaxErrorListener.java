package ru.vsu.cs;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.Interval;
import java.util.ArrayList;
import java.util.List;

public class SyntaxErrorListener extends BaseErrorListener {
    private static final String RED = "\u001B[31m";
    private static final String YELLOW = "\u001B[33m";
    private static final String BLUE = "\u001B[34m";
    private static final String RESET = "\u001B[0m";
    private static final String BOLD = "\u001B[1m";

    private final List<String> errors = new ArrayList<>();

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line,
                            int charPositionInLine,
                            String msg,
                            RecognitionException e) {

        String formattedMsg = formatMessage(msg);
        String errorContext = getErrorContext(recognizer, line, charPositionInLine);
        String suggestion = getSuggestion(e, recognizer);

        StringBuilder sb = new StringBuilder();
        sb.append("\n").append(BOLD).append(RED).append("=== ОШИБКА КОМПИЛЯЦИИ ===").append(RESET).append("\n");
        sb.append("Строка: ").append(line).append(":").append(charPositionInLine).append("\n");
        sb.append("Тип: ").append(BOLD).append("Синтаксическая ошибка").append(RESET).append("\n");
        sb.append("Сообщение: ").append(formattedMsg).append("\n");

        if (!errorContext.isEmpty()) {
            sb.append("Контекст:\n").append(errorContext).append("\n");
            sb.append(YELLOW).append(" ".repeat(charPositionInLine)).append("^").append(RESET).append("\n");
        }

        if (!suggestion.isEmpty()) {
            sb.append(BLUE).append("Подсказка: ").append(suggestion).append(RESET).append("\n");
        }

        String error = sb.toString();
        errors.add(error);
        System.err.println(error);
    }

    public boolean hasErrors() {
        return !errors.isEmpty();
    }

    public List<String> getErrors() {
        return errors;
    }

    private String formatMessage(String original) {
        return original.replace("extraneous input", "неожиданный токен")
                .replace("expecting", "ожидается")
                .replace("'", "")
                .replace("missing", "отсутствует");
    }

    private String getErrorContext(Recognizer<?, ?> recognizer, int line, int pos) {
        try {
            CharStream input = (CharStream) recognizer.getInputStream();
            String[] lines = input.getText(Interval.of(0, input.size())).split("\n");
            if (line <= lines.length) {
                String lineText = lines[line-1];
                int start = Math.max(0, pos - 20);
                int end = Math.min(lineText.length(), pos + 20);
                return lineText.substring(start, end).replace("\t", " ");
            }
        } catch (Exception ignored) {}
        return "";
    }

    private String getSuggestion(RecognitionException e, Recognizer<?, ?> recognizer) {
        if (e != null && e.getExpectedTokens() != null) {
            String expected = e.getExpectedTokens().toString(recognizer.getVocabulary());
            return expected.replace("{", "")
                    .replace("}", "")
                    .replace(",", " или ")
                    .replace("'", "")
                    .replace("Inc", "Inc()")
                    .replace("Dec", "Dec()")
                    .replace("Abs", "Abs()");
        }
        return "";
    }
}