package ru.vsu.cs;

import java.util.HashMap;
import java.util.Map;

public class SymbolTable {
    private final Map<String, Symbol> symbols = new HashMap<>();
    private final SymbolTable parent;

    public SymbolTable() {
        this(null);
    }

    public SymbolTable(SymbolTable parent) {
        this.parent = parent;
    }

    public void addSymbol(Symbol symbol) {
        symbols.put(symbol.getName(), symbol);
    }

    public Symbol lookup(String name) {
        Symbol symbol = symbols.get(name);
        if (symbol == null && parent != null) {
            return parent.lookup(name);
        }
        return symbol;
    }

    public boolean contains(String name) {
        return lookup(name) != null;
    }
}