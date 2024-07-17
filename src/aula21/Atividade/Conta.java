package aula21.Atividade;

import java.io.Serializable;
import java.util.Random;

public class Conta implements Serializable {


    protected float saldo;
    private String identificador;
    private String titular;
    private String senha;

    public Conta(String titular, String senha)
    {
     this.titular = titular;
     this.senha = senha;
     geralIdentificador();
    }

    public String getIdentificador() {
        return this.identificador;
    }


    public String getTitular() {
        return this.titular;
    }

    public void setSenha(String senha)
    {
        this.senha = senha;
    }



    private void geralIdentificador()
    {
        Random aleatorio = new Random();

        String identificador = "";

        identificador+=aleatorio.nextInt(1000,2000);
        System.out.println( "Seu identificador é "+identificador);
        this.identificador = identificador;

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
        return this.identificador.equals(idenficador) && this.senha.equals(senha);

    }

    public String verificarSaldo()
    {
        return String.format("Seu saldo é de R$"+saldo);
    }




}
