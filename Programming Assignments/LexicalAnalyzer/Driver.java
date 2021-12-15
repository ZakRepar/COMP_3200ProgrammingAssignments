import java.io.*;

public class Driver {

    public static void main(String[] args) {
        Token tok;
        try {
            NotJavaLexer lexer = new NotJavaLexer(new FileReader(args[0]));
            Token t = lexer.getNextToken();
            while(t != null){
               System.out.println(t);
               t = lexer.getNextToken();
            }
         }
         catch(FileNotFoundException fnfe) {
            System.err.println("File not found " + fnfe.getMessage());
         }
         catch(IOException ioe){
            System.out.println("Error reading file " + ioe.getMessage());
         }
    }
}