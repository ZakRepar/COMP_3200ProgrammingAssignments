public class Token {
    
    int tokenType;
    String tokenValue;

    public Token(int inputType, String inputText) {
        this.tokenType = inputType;
        this.tokenValue = inputText;
    }

    public static final int LEFT_PAREN = 1;
    public static final int RT_PAREN = 2;
    public static final int LEFT_BRKT = 3;
    public static final int RT_BRKT = 4;
    public static final int PLUS = 5;
    public static final int MINUS = 6;
    public static final int TIMES = 7;
    public static final int DIVIDE = 8;
    public static final int SEMI = 9;
    public static final int LESS = 10;
    public static final int LESS_EQ = 11;
    public static final int GTR = 12;
    public static final int GTR_EQ = 13;
    public static final int NOT_EQ = 14;
    public static final int ASSMNT = 15;
    public static final int RETURN = 16;
    public static final int CONCAT = 17;
    public static final int EQ = 18;
    public static final int COLON = 19;
    public static final int COMMA = 20;
    public static final int DO = 21;
    public static final int IF = 22;
    public static final int OR = 23;
    public static final int AND = 24;
    public static final int NOT = 25;
    public static final int VAR = 26;
    public static final int XOR = 27;
    public static final int ELSE = 28;
    public static final int THEN = 29;
    public static final int WHILE = 30;
    public static final int IMPLIES = 31;
    public static final int FUNCTION = 32;
    public static final int PROCEDURE = 33;
    public static final int IDENTIFIER = 34;
    public static final int INT = 35;
    public static final int STRING = 36;



    public String toString() {
        String s = "";
        switch (tokenType) {
           case LEFT_PAREN: s += "LEFT_PAREN"; 
               break;
           case RT_PAREN: s += "RT_PAREN"; 
               break;
           case LEFT_BRKT: s += "LEFT_BRKT"; 
               break;
           case RT_BRKT: s += "RT_BRKT"; 
               break;
           case PLUS: s += "PLUS"; 
               break;
           case MINUS: s += "MINUS"; 
               break;
           case TIMES: s += "TIMES"; 
               break;
           case DIVIDE: s += "DIVIDE"; 
              break;
           case SEMI: s += "SEMI"; 
              break;
           case LESS: s += "LESS"; 
              break;
           case LESS_EQ: s += "LESS_EQ"; 
              break;
           case GTR: s += "GTR"; 
              break;
           case GTR_EQ: s += "GTR_EQ"; 
              break;
           case NOT_EQ: s += "NOT_EQ"; 
              break;
           case ASSMNT: s += "ASSMNT"; 
              break;
           case RETURN: s += "RETURN"; 
              break;
           case CONCAT:s += "STRING_CONCAT";
              break;
           case EQ: s += "EQ"; 
              break;
           case COMMA: s += "COMMA"; 
              break;
           case COLON: s += "COLON"; 
              break;
           case DO: s += "DO"; 
              break;
           case IF: s += "IF"; 
              break;
           case OR: s += "OR"; 
              break;
           case AND: s += "AND"; 
              break;
           case NOT: s += "NOT"; 
              break;
           case VAR: s += "VAR"; 
              break;
           case XOR: s += "XOR"; 
              break;
           case ELSE: s += "ELSE"; 
              break;
           case THEN: s += "THEN"; 
              break;
           case WHILE: s += "WHILE"; 
              break;
           case IMPLIES: s += "IMPLIES"; 
              break;
           case FUNCTION: s += "FUNCTION"; 
              break;
           case PROCEDURE: s += "PROCEDURE"; 
              break;
           case IDENTIFIER: s += "IDENTIFIER (" + tokenValue + ")";
              break;
           case INT: s += "INT (" + tokenValue + ")";
              break;
            case STRING: {
               tokenValue = tokenValue.substring(1, tokenValue.length()-1);
               tokenValue = tokenValue.replace("\"\"", "\"");
               s += "STRING (" + tokenValue + ")";
            }
              break;
           default: s += "EOF"; 
              break;
        }
        return s;
     }
}
