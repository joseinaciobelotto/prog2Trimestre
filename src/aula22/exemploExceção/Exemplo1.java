package aula22.exemploExceção;

import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n1 = ler.nextInt();
        System.out.println("Digite outro número");
        int n2 = ler.nextInt();
        int resposta = n1/n2;
        System.out.println(resposta);
    }
}
