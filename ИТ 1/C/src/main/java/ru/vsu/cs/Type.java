package ru.vsu.cs;

public enum Type {
    INT("int"),
    CHAR("char"),
    BOOL("bool"),
    VOID("void"),
    UNKNOWN("unknown");

    private final String name;

    Type(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static Type fromString(String typeName) {
        for (Type type : Type.values()) {
            if (type.name.equalsIgnoreCase(typeName)) {
                return type;
            }
        }
        return UNKNOWN;
    }
}