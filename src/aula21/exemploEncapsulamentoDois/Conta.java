package aula21.exemploEncapsulamentoDois;

import java.util.Random;

public class Conta {


    float saldo;
    String idenficador;
    String titular;
    String senha;

    Conta(String titular, String senha)
    {
     this.titular = titular;
     this.senha = senha;
     geralIdentificador();
    }


    void geralIdentificador()
    {
        Random aleatorio = new Random();
        String identificador = "";
        for(int i=0; i<4; i++)
        {
        identificador+=(char)aleatorio.nextInt(65,90);
        }
        identificador+=aleatorio.nextInt(1000,2000);
        this.idenficador += identificador;

    }

    void depositar(float valor)
    {
        saldo+=valor;
    }

    boolean sacar(float valor)
    {
        if(saldo>=valor)
        {
            saldo-=valor;
            return true;
        }
        return false;
    }

    boolean validaAcesso(String idenficador, String senha)
    {
        return this.idenficador.equals(idenficador) && this.senha.equals(senha);




    }


}
