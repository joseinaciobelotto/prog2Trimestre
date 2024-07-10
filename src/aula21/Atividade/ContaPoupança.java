package aula21.Atividade;

import java.util.Random;

public class ContaPoupança extends Conta {



    public ContaPoupança(String titular, String senha)
    {
        super(titular,senha);

    };

    public boolean sacar (float valor)
    {
        if (valor <= saldo)
        {
            saldo-=valor;
            return true;
        }
        else
        {
            return false;
        }
    }


    public String verificarSaldo() {

        return String.format("Seu saldo é de R$"+saldo);
    }
}
