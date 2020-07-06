// Regenerate parser by running 'python setup.py antlr' at project root.
grammar ConfigOverride;

//fragment VALUE_CHAR : [a-zA-Z0-9!@#$%^&*(){}|;:/\\\-_.];
fragment WS_CHAR: [ \t];
QUOTED_VALUE : '\'' (~['])* '\'' | '"' (~["])* '"';
//fragment QUOTED_CHAR : VALUE_CHAR|WS_CHAR|COMMA|LOPEN|LCLOSE|EQ|PLUS|TILDE;
LOPEN: '[';
LCLOSE: ']';
COMMA: ',';
EQ: '=';
PLUS: '+';
TILDE: '~';
INTERPOLATION_START: '${';
INTERPOLATION_END: '}';
INT: [+-]?('0' | [1-9][0-9_]*);
// does not currently support scientific notation. can be added later
FLOAT: ([+-]?([0-9_]+ '.' [0-9_]+ | 'inf')|'nan');

BOOL: 'true'|'false';
NULL: 'null';
fragment ID_FRAG: [a-zA-Z!@%^&*_][0-9a-zA-Z!@%^&*_]*;  // other characters could be added with caution.
ID: ID_FRAG ('.' ID_FRAG)*;

interpolation: INTERPOLATION_START (ID|QUOTED_VALUE) INTERPOLATION_END;
value : NULL | INT | FLOAT | BOOL | QUOTED_VALUE | ID | interpolation | list_value;

list_value: LOPEN (value(COMMA value)*)? LCLOSE;

choice_sweep: value (COMMA value)*;

//value: (single_value | choice_sweep);

override_key: ID | QUOTED_VALUE;
override: (
      override_key EQ choice_sweep
    | (PLUS override_key EQ choice_sweep)
    | TILDE override_key (EQ choice_sweep)?
) EOF;