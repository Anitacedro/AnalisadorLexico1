public class Token {

    public static String[] vetor = {"Program","Var", ";", "Const", "Begin","Read", "End", ",", ":", "(", ")", "=", "+", "Write"};

    public static boolean buscaPalavra(String palavra){
        for (String a: vetor) {
            if(a.contains(palavra))
                return true;
        }
        return false;
    }
}
