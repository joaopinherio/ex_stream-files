package exercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        LeituraArquivoTextoEstruturado ex2 = new LeituraArquivoTextoEstruturado();
        
        ex2.leArquivoTextoEstruturado("CADASTRO.TXT");

        ex2.escreveArquivoTexto("CADASTRO.TXT", scanner);
    }
}