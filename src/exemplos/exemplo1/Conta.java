package exemplos.exemplo1;
import java.util.Scanner;
import java.util.Random;


class Conta {
    Scanner ler = new Scanner(System.in);
    String titular;
String senha;
    String identificador;
    float saldo;

    Conta(String titular, String senha, float saldo)
    {
        this.identificador = gerarId();
        this.titular = titular;
        this.saldo = saldo;
        this.senha = senha;
    }


    void depositar() {
        float valorDepositado;
        System.out.println("Quanto deeja depositar: ");
        valorDepositado= ler.nextFloat();
        saldo += valorDepositado;
        System.out.println("O saldo atual é "+saldo);

    }

    boolean sacar()
    {
        float valorSaque=0;
        System.out.println("Quanto deeja sacar: ");
        valorSaque= ler.nextFloat();

        if (saldo >= valorSaque)
        {
            saldo -= valorSaque;
            System.out.println("O saldo atual é "+saldo);

            return true;
        } else {
            System.out.println("Saldo Insuficiente");
            return false;
        }


    }

    String gerarId()
    {
        int num= new Random().nextInt(10000,99999);
        char letra = (char) new Random().nextInt(65,91);
        String id= num+"-"+letra;
        System.out.println("O seu identificador é "+id);

        return id;

    }



}
