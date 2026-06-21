package exercicio2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class LeituraArquivoTextoEstruturado {
    public LeituraArquivoTextoEstruturado() {
    }

    public void leArquivoTextoEstruturado(String nomeArquivo) {
        Path arq = Paths.get(nomeArquivo);
        BufferedReader reader = null;
        String line = "";

        try {
            reader = Files.newBufferedReader(arq, Charset.defaultCharset());
            while ((line = reader.readLine()) != null) {
                String sb[] = line.split(":");
                System.out.println("Numero: " + sb[0]);
                System.out.println("Nome: " + sb[1]);
                System.out.println("\n");
            }
            reader.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void escreveArquivoTexto(String nomeArquivo, Scanner scanner){
        Path arq = Paths.get(nomeArquivo);
        Path out = Paths.get("Outuput.txt");
        BufferedReader reader = null;
        BufferedWriter writer = null;
        String line = "";

        try{
            reader = Files.newBufferedReader(arq, Charset.defaultCharset());
            writer = Files.newBufferedWriter(out, Charset.defaultCharset());

            while((line = reader.readLine()) != null){
                writer.append(line);
                writer.append("\n");
                String textoUser = scanner.nextLine();
                writer.append(textoUser);
            }
            reader.close();
            writer.close();
        } catch(Exception e){
            System.out.println(e);
        }
    }

}
