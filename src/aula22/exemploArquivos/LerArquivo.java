package aula22.exemploArquivos;

import java.io.*;

public class LerArquivo {

    public static void main(String[] args) {
        File caminho = new File("C:/Users/C313/Documents/sssdd/");


        File arquivo = new File(caminho,"dadosPessoa.db");


      Pessoa p1;
        try
        {
            ObjectInputStream objLeitura = new  ObjectInputStream(new FileInputStream(arquivo.getAbsolutePath()));
         p1 = (Pessoa) objLeitura.readObject();
            System.out.println(p1);

        }
        catch (FileNotFoundException erro)
        {
            System.out.println("Erro ao ler o arquivo!");
        }
        catch (IOException erro)
        {
            System.out.println("Erro ao ler as informações!");
        }
        catch (ClassNotFoundException erro)
        {
            System.out.println("Classe não encontrada");
        }
    }

}
