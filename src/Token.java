public class Token {

    public static String PALAVRA_RESERVADA = "Program";

    public static String[] vetor = {"Program","Var", ";", "Const", "Begin","Read", "End.", ",", ":", "(", ")", "=", "+", "Write", "A","x" ,"b", "B","real", "y","*","2", "3",":=", "b;"};

    public static String palavraAntiga = null;

    public static boolean buscaPalavra(String[] texto,String palavra){
        for (String a: vetor) {
            if(a.equalsIgnoreCase(palavra)){
                palavraAntiga = palavra;
                return true;
            } else if (palavraAntiga.equals(PALAVRA_RESERVADA)){
                palavraAntiga = palavra;
                return true;
                }
            }

        return false;
    }
}
