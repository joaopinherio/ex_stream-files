package exercicio1;

import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LeituraArquivoTexto {
    //acha o local/caminho do arquivo desejado
    public LeituraArquivoTexto(){
    }

    public void leArquivoTexto(){
        Path path = Paths.get("NOMES.TXT");

        try{
            //classe para "gravar" o arquivo
            BufferedWriter bw = Files.newBufferedWriter(path, Charset.defaultCharset());
            PrintWriter pw = new PrintWriter(bw);
            pw.println("Escrevendo linha em arquivo de texto");
            pw.println("outra linha");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

}

/*
    public void leArquivoTexto(){
    Path path = Paths.get("NOMES.TXT");
    
        try{
            //classe para "gravar" o arquivo
            BufferedWriter bw = Files.newBufferedWriter(path, Charset.defaultCharset());
            PrintWriter pw = new PrintWriter(bw);
            pw.println("Escrevendo linha em arquivo de texto");
            pw.println("outra linha");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    */