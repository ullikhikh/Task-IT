grammar CSubset;

@parser::members {
    public static class CompileError extends RuntimeException {
        public CompileError(String message) {
            super(message);
        }
    }

    public void notifyErrorListeners(Token offendingToken, String msg, RecognitionException e) {
        throw new CompileError("Syntax error at line " + offendingToken.getLine() +
                             ":" + offendingToken.getCharPositionInLine() + " - " + msg);
    }
}

program
    : (functionDecl | varDecl)+ EOF
    ;

varDecl
    : type initDecl (',' initDecl)* ';'              # variableDeclaration
    | type ID '[' INT ']' '=' arrayInitializer ';'   # arrayDeclaration
    ;

initDecl
    : ID ('[' INT ']')? ('=' expr)?                 # singleDeclaration
    ;

type
    : 'int'
    | 'char'
    | 'bool'
    ;

functionDecl
    : type ID '(' params? ')' block   # functionDefinition
    | 'void' ID '(' params? ')' block # procedureDefinition
    ;

params
    : param (',' param)*
    ;

param
    : type ID
    ;

block
    : '{' statement* '}'
    ;

statement
    : varDecl                          # declarationStatement
    | assignment ';'                   # assignmentStatement
    | expr ';'                         # expressionStatement
    | ifStmt                           # ifStatement
    | forStmt                          # forStatement
    | whileStmt                        # whileStatement
    | doWhileStmt                      # doWhileStatement
    | returnStmt                       # returnStatement
    | writeStmt                        # writeStatement
    | readStmt                         # readStatement
    | block                            # blockStatement
    | ';'                              # emptyStatement
    ;

assignment
    : ID '=' expr                      # simpleAssignment
    | ID '[' expr ']' '=' expr         # arrayAssignment
    ;

ifStmt
    : 'if' '(' expr ')' statement ('else' statement)?
    ;

forStmt
    : 'for' '(' (varDecl | (assignment | expr)? ';') expr? ';' expr? ')' statement
    ;

whileStmt
    : 'while' '(' expr ')' statement
    ;

doWhileStmt
    : 'do' statement 'while' '(' expr ')' ';'
    ;

returnStmt
    : 'return' expr? ';'
    ;

writeStmt
    : ('Write'|'WriteLn') '(' ((expr | STRING) (',' (expr | STRING))*)? ')' ';'
    ;

readStmt
    : ('Read'|'ReadLn') '(' ID (',' ID)* ')' ';'
    ;

arrayInitializer
    : '{' expr (',' expr)* '}'
    ;

expr
    : expr '[' expr ']'                            # arrayAccess
    | expr '(' (expr (',' expr)*)? ')'             # functionCall
    | 'Inc' '(' expr ')'                           # incFunction
    | 'Dec' '(' expr (',' expr)? ')'               # decFunction
    | 'Abs' '(' expr ')'                           # absFunction
    | expr '++'                                   # postIncrement
    | expr '--'                                   # postDecrement
    | '-' expr                                     # unaryMinus
    | '!' expr                                     # logicalNot
    | expr ('*'|'/'|'%') expr                      # multiplicative
    | expr ('+'|'-') expr                          # additive
    | expr ('<'|'>'|'<='|'>=') expr               # relational
    | expr ('=='|'!=') expr                        # equality
    | expr '&&' expr                               # logicalAnd
    | expr '||' expr                               # logicalOr
    | ID                                           # identifier
    | INT                                          # integerLiteral
    | CHAR                                         # charLiteral
    | BOOL                                         # booleanLiteral
    | '(' expr ')'                                 # parenthesized
    ;
ID          : [a-zA-Z_][a-zA-Z0-9_]*;
INT         : [0-9]+;
CHAR        : '\'' . '\'';
BOOL        : 'true' | 'false';
STRING      : '"' .*? '"';

WS          : [ \t\r\n]+ -> skip;
COMMENT     : '//' ~[\r\n]* -> skip;
BLOCK_COMMENT: '/*' .*? '*/' -> skip;