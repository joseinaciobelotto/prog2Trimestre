package aula22.exemploExceção;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Atividade {


    public static void main(String[] args) {

        boolean erroTeste = false;
        Scanner ler = new Scanner(System.in);
        do {


        try
        {



            System.out.println("Digite um número: ");
            int n1 = ler.nextInt();
            System.out.println("Digite outro número");
            int n2 = ler.nextInt();
            int resposta = n1 / n2;
            System.out.println(resposta);
            erroTeste = false;

        } catch (InputMismatchException erro) {
            System.out.println("Os valores precisam ser núemros");
            System.out.println(erro);
            erroTeste = true;
            ler.next();
          //  erro.printStackTrace();
        } catch (ArithmeticException erro) {
            System.out.println("Não é possível dividir por zero");
            erroTeste = true;
        } catch (Exception erro)
        {
            System.out.println("Erro indeterminado!");
            erroTeste = true;
        }
        }while (erroTeste!=false);

        Exemplo2 e = new Exemplo2();

        System.out.println(e.divide(2,3));


    }
    }
