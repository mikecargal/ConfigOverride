// Regenerate parser by running 'python setup.py antlr' at project root.
grammar ConfigOverride;

//fragment VALUE_CHAR : [a-zA-Z0-9!@#$%^&*(){}|;:/\\\-_.];
fragment WS_CHAR: [ \t];
//fragment QUOTED_CHAR : VALUE_CHAR|WS_CHAR|COMMA|LOPEN|LCLOSE|EQ|PLUS|TILDE;
LOPEN: '[';
LCLOSE: ']';
COMMA: ',';
EQ: '=';
PLUS: '+';
TILDE: '~';
QUOTED_VALUE : '\'' ([^'])* '\'' | '"' ([^"])* '"';
INT: [+-]?('0' | [1-9][0-9_]*);
// does not currently support scientific notation. can be added later
FLOAT: ([+-]?([0-9_]+ '.' [0-9_]+ | 'inf')|'nan');

BOOL: 'true'|'false';
NULL: 'null';
ID: [a-zA-Z!@%^&*_][0-9a-zA-Z!@%^&*_];  // other characters could be added with caution.

value : NULL | INT | FLOAT | BOOL | QUOTED_VALUE | ID | list_value;

list_value: LOPEN (value(COMMA value)*)? LCLOSE;

choice_sweep: value (COMMA value)*;

//value: (single_value | choice_sweep);

override_key: ID | QUOTED_VALUE;
override: (
      override_key EQ choice_sweep
    | (PLUS override_key EQ choice_sweep)
    | TILDE override_key (EQ choice_sweep)?
) EOF;