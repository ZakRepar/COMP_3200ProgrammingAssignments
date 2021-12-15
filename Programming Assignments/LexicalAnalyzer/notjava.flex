%%
/*-*
 * LEXICAL FUNCTIONS:
 */

%class NotJavaLexer
%public
%type Token
%function getNextToken

/*-*
 * PATTERN DEFINITIONS:
 */
letter          = [A-Za-z]
digit           = [0-9]
alphanumeric    = {letter}|{digit}
other_id_char   = [_]
identifier      = {letter}({alphanumeric}|{other_id_char}{alphanumeric})*
integer         = [-]?{digit}+
non_quote        = [^\"]
string          = \"({non_quote}*|\"\"{non_quote}*\"\")*\"
nonNewLine      = [^\n]
comment_body    = {nonNewLine}*
comment         = [#]{comment_body}[\n]
whitespace      = [ \r\n\t]


%%
/**
 * LEXICAL RULES:
 */
and             { return new Token(Token.AND, "AND"); }
do              { return new Token(Token.DO, "DO"); }
else            { return new Token(Token.ELSE, "ELSE"); }
function        { return new Token(Token.FUNCTION, "FUNCTION"); }
if              { return new Token(Token.IF, "IF"); }
implies         { return new Token(Token.IMPLIES, "IMPLIES"); }
not             { return new Token(Token.NOT, "NOT"); }
or              { return new Token(Token.OR, "OR"); }
procedure       { return new Token(Token.PROCEDURE, "PROCEDURE"); }
then            { return new Token(Token.THEN, "THEN"); }
var             { return new Token(Token.VAR, "VAR"); }
while           { return new Token(Token.WHILE, "WHILE"); }
xor             { return new Token(Token.XOR, "XOR"); }
"*"             { return new Token(Token.TIMES, "TIMES"); }
"+"             { return new Token(Token.PLUS, "PLUS"); }
"-"             { return new Token(Token.MINUS, "MINUS"); }
"/"             { return new Token(Token.DIVIDE, "DIVIDE"); }
";"             { return new Token(Token.SEMI, "SEMI"); }
","             { return new Token(Token.COMMA, "COMMA"); }
"("             { return new Token(Token.LEFT_PAREN, "LEFT_PAREN"); }
")"             { return new Token(Token.RT_PAREN, "RT_PAREN"); }
"["             { return new Token(Token.LEFT_BRKT, "LEFT_BRKT"); }
"]"             { return new Token(Token.RT_BRKT, "RT_BRKT"); }
"=="            { return new Token(Token.EQ, "EQ"); }
"<"             { return new Token(Token.GTR, "GTR"); }
">"             { return new Token(Token.LESS, "LESS"); }
"<="            { return new Token(Token.LESS_EQ, "LESS_EQ"); }
">="            { return new Token(Token.GTR_EQ, "GTR_EQ"); }
"/="            { return new Token(Token.NOT_EQ, "NOT_EQ"); }
":"             { return new Token(Token.COLON, "COLON"); }
"->"            { return new Token(Token.RETURN, "RETURN"); }
"<-"            { return new Token(Token.ASSMNT, "ASSIGNMENT"); }
"&"             { return new Token(Token.CONCAT, "CONCATENATION"); }
{identifier}    { return new Token(Token.IDENTIFIER, yytext()); }
{integer}       { return new Token(Token.INT, yytext());}
{string}        { return new Token(Token.STRING, yytext()); }

{comment}     { /* Ignore comments. */ }
{whitespace}    { /* Ignore whitespace. */ }    