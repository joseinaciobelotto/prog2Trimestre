package aula19.exemplo1;
import java.util.Scanner;
class Banco
{
    public static void main(String args[])
    {
        Scanner ler = new Scanner(System.in);

        Conta[] listaContas = new Conta[100];
        int auxcontas = 0;

        do {

            System.out.println("c - criar conta");
            System.out.println("a - acessar conta");
            System.out.println("l - lista de contas");
            char acao = ler.next().toLowerCase().charAt(0);

            if(acao =='c') {
                System.out.println("Insira seu nome: ");
                String titular = ler.next();
                System.out.println("Insira a senha ");
                String senha = ler.next();
                System.out.println("Insira a saldo ");
                float saldo = ler.nextFloat();

                listaContas[auxcontas] = new Conta(titular, senha, saldo);
                auxcontas++;
                System.out.println("");
            }
            if(acao =='a')
            {
                System.out.println("Digite a seu identificador");
                String identificador = ler.next();

                for(int aux=0; aux<auxcontas; aux++)
                {
                    if (listaContas[aux].identificador.equals(identificador))
                    {
                        System.out.println("Digite a sua senha");
                        String senha = ler.next();


                        if (listaContas[aux].senha.equals(senha))
                        {
                            System.out.println("O que você deseja fazer?");
                            System.out.println("s - sacar");
                            System.out.println("d - depositar");
                            char acao2 = ler.next().toLowerCase().charAt(0);
                            if (acao2 == 's')
                            {
                                listaContas[aux].sacar();
                            }
                            else if (acao2 == 'd')
                            {
                                listaContas[aux].depositar();
                            }
                       }
                    }
                }
            }
            if(acao=='l')
            {
                for(int aux=0; aux<auxcontas; aux++)
                {
                    System.out.println("Nome: "+listaContas[aux].titular+" ");
                    System.out.println("Id: "+listaContas[aux].identificador);
                    System.out.println("Saldo: "+listaContas[aux].saldo);

                }

            }
        }while (true);
    }
}

