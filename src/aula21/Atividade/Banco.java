package aula21.Atividade;

import java.util.Scanner;

public class Banco {
    static Scanner ler = new Scanner(System.in);
    public static ContaPoupança[] listaContasPoupança = new ContaPoupança[100];
    public static ContaCorrente[] listaContasCorrente = new ContaCorrente[100];
    public static  int auxContCorrente = 0;
    public static  int auxContPoupança = 0;
    public static void main(String[] args)
    {



        do {
            char acao;
            do {
                System.out.println("c - criar conta ");
                System.out.println("a - acessar conta");
                System.out.println("l - listar contas");
                acao = ler.next().toLowerCase().charAt(0);
            }while  (acao != 'c' && acao != 'a' && acao != 'l');

            if(acao =='c') {

                char  tipoConta;
                do {
                    System.out.println("c - criar conta corrente");
                    System.out.println("p - criar conta poupança");

                    tipoConta = ler.next().toLowerCase().charAt(0);
                }while  ( tipoConta != 'c' && tipoConta != 'p' );

                System.out.println("Insira seu nome: ");
                String titular = ler.next();
                System.out.println("Insira a senha ");
                String senha = ler.next();



                if( tipoConta=='c')
                {
                    auxContCorrente++;
                    System.out.println("Insira o seu limite");
                    float limite = ler.nextFloat();
                    listaContasCorrente[auxContCorrente]= new ContaCorrente(titular,senha,limite);



                }
                else if ( tipoConta=='p')
                {
                    auxContPoupança++;
                    listaContasPoupança[auxContPoupança]= new ContaPoupança(titular,senha);


                }


                System.out.println("");
            }
            if(acao =='a')
            {

                char  tipoConta;
                do {
                    System.out.println("c - acessar conta corrente");
                    System.out.println("p - acessar conta poupança");

                    tipoConta = ler.next().toLowerCase().charAt(0);
                }while  ( tipoConta != 'c' && tipoConta != 'p' );

                acessarTiposConta(tipoConta);

                }


            if(acao=='l')
            {
                if(auxContCorrente>0) {
                    System.out.println("Contas Corrente: ");
                    for (int aux = 0; aux < auxContCorrente; aux++) {
                        System.out.println("Nome: " + listaContasCorrente[auxContCorrente].getTitular() + " ");
                        System.out.println("Id: " + listaContasCorrente[auxContCorrente].getIdentificador());
                        System.out.println("Saldo: " + listaContasCorrente[auxContCorrente].verificarSaldo());

                    }
                }
                if(auxContPoupança>0)
                {
                System.out.println("Contas Poupança: ");
                for(int aux=0; aux<auxContCorrente; aux++)
                {
                    System.out.println("Nome: "+listaContasPoupança[auxContPoupança].getTitular()+" ");
                    System.out.println("Id: "+listaContasPoupança[auxContPoupança].getIdentificador());
                    System.out.println("Saldo: "+listaContasPoupança[auxContPoupança].verificarSaldo());

                }}

            }
        }while (true);
    }

 static void  acessarTiposConta(char tipo)
{

    if(tipo=='c') {
        System.out.println("Digite a seu identificador");
        String identificador = ler.next();

        for (int aux = 0; aux < auxContCorrente; aux++) {
            System.out.println("Digite a sua senha");
            String senha = ler.next();

            char acao2;
            if (listaContasCorrente[auxContCorrente].validaAcesso(identificador, senha)) {
                char acao3;

                do {
                    System.out.println("O que você deseja fazer?");
                    System.out.println("s - sacar");
                    System.out.println("d - depositar");
                    System.out.println("v - verificar saldo");
                    acao3 = ler.next().toLowerCase().charAt(0);
                } while (acao3 != 's' && acao3 != 'd' && acao3 != 'v');

                if (acao3 == 's') {
                    float valor;
                    do {
                        System.out.println("Qual valor que deseja sacar:");
                        valor = ler.nextFloat();
                    } while (valor <= 0);

                    listaContasCorrente[auxContCorrente].sacar(valor);

                } else if (acao3 == 'd') {
                    float valor;
                    do {
                        System.out.println("Qual valor que deseja depositar:");
                        valor = ler.nextFloat();
                    } while (valor <= 0);

                    listaContasCorrente[auxContCorrente].depositar(valor);


                } else if (acao3 == 'v') {

                    System.out.println(listaContasCorrente[auxContCorrente].verificarSaldo());

                }

            }
        }
    }
    if(tipo=='p') {
        System.out.println("Digite a seu identificador");
        String identificador = ler.next();

        for (int aux = 0; aux < auxContPoupança; aux++) {
            System.out.println("Digite a sua senha");
            String senha = ler.next();

            char acao2;
            if (listaContasPoupança[auxContPoupança].validaAcesso(identificador, senha)) {
                char acao3;

                do {
                    System.out.println("O que você deseja fazer?");
                    System.out.println("s - sacar");
                    System.out.println("d - depositar");
                    System.out.println("v - verificar saldo");
                    acao3 = ler.next().toLowerCase().charAt(0);
                } while (acao3 != 's' && acao3 != 'd' && acao3 != 'v');

                if (acao3 == 's') {
                    float valor;
                    do {
                        System.out.println("Qual valor que deseja sacar:");
                        valor = ler.nextFloat();
                    } while (valor <= 0);

                    listaContasPoupança[auxContPoupança].sacar(valor);

                } else if (acao3 == 'd') {
                    float valor;
                    do {
                        System.out.println("Qual valor que deseja depositar:");
                        valor = ler.nextFloat();
                    } while (valor <= 0);

                    listaContasPoupança[auxContPoupança].depositar(valor);


                } else if (acao3 == 'v') {

                    System.out.println(listaContasPoupança[auxContPoupança].verificarSaldo());

                }

            }
        }
    }






}
}
