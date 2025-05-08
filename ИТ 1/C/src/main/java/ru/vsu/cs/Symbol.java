package ru.vsu.cs;

public class Symbol {
    private final String name;
    private final Type type;
    private final boolean isArray;

    public Symbol(String name, Type type, boolean isArray) {
        this.name = name;
        this.type = type;
        this.isArray = isArray;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public boolean isArray() {
        return isArray;
    }
}