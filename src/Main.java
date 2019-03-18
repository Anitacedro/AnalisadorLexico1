import javax.swing.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        Path caminho = Paths.get("C:/Users/anita/Desktop/compiladores.txt");
        try {
            byte[] texto = Files.readAllBytes(caminho);
            String leitura = new String(texto);
            System.out.println(leitura);

           String textoCompleto[] = leitura.split("\\r\\n");
           int index = 0;
            for (String a: textoCompleto) {
                String palavra[] = a.split(" ");
                for(String b : palavra){
                    if(!Token.buscaPalavra(b)){
                        System.out.println("Erro na linha: "+ (++index) + " - Palavra: "+b);
                        return;
                    }
                }
            }
            System.out.println("Sucesso");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
