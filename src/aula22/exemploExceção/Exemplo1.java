package aula22.exemploExceção;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        try {


        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n1 = ler.nextInt();
        System.out.println("Digite outro número");
        int n2 = ler.nextInt();
        int resposta = n1/n2;
        System.out.println(resposta);
    }
        catch (InputMismatchException erro)
        {
            System.out.println("Os valores precisam ser núemros");
            System.out.println(erro);
            erro.printStackTrace();
        }
        catch (ArithmeticException erro)
        {
            System.out.println("Não é possível dividir por zero");
        }
        catch (Exception erro)
        {
            System.out.println("Erro indeterminado!");
        }



    }
}
