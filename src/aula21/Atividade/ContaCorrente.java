package aula21.Atividade;

import java.util.Random;

public class Conta {


    protected float saldo;
    private String identificador;
    private String titular;
    private String senha;

    Conta(String titular, String senha)
    {
     this.titular = titular;
     this.senha = senha;
     geralIdentificador();
    }

    public String getIdentificador() {
        return identificador;
    }
    public void setIdentificador(String titular) {
        this.titular = titular;
    }


    public void setSenha(String senha) {
        this.titular = titular;
    }



    private void geralIdentificador()
    {
        Random aleatorio = new Random();
        String identificador = "";
        for(int i=0; i<4; i++)
        {
        identificador+=(char)aleatorio.nextInt(65,90);
        }
        identificador+=aleatorio.nextInt(1000,2000);
        this.identificador += identificador;

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
        return String.format("Seu saldo é de R$%.2f");
    }



}
