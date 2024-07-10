package aula22.exemploArquivos;

import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Escrevendo
{

    public static void main(String[] args) {

        File caminho = new File("C:/Users/C313/Documents/sssdd/");

        if(caminho.exists())
        {
            System.out.println("O caminho existe!");
        }else
        {
            System.out.println("O caminho não existe, tantando criar...");
            caminho.mkdirs();
        }

        Pessoa p1 = new Pessoa();
        p1.setNome("Armando");
        p1.setSobrenome("Zeanim");

        File arquivo = new File(caminho,"dadosPessoa.db");

        try
        {
            ObjectOutputStream objEscrita = new ObjectOutputStream(new FileOutputStream(arquivo.getAbsolutePath()));
            objEscrita.writeObject(p1);
            objEscrita.close();
            System.out.println("Salvo com sucesso!");
        }
        catch (FileNotFoundException erro)
        {
            System.out.println("Erro ao ler o arquivo!");
        }
        catch (IOException erro)
        {
            System.out.println("Erro ao gravar as informações!");
        }

    }
}
