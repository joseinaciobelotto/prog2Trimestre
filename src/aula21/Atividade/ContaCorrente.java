package aula21.Atividade;

import java.util.Random;

public class ContaCorrente extends Conta {

    private float limite;

    public ContaCorrente(String titular, String senha, float limite)
    {
     super(titular,senha);

    };

    public boolean sacar (float valor)
    {
        if (valor <= saldo+limite)
        {
            saldo-=valor;
            if(saldo < 0)
            {
                limite += saldo;
            }

            return true;
        }
        else
        {
            return false;
        }
    }


    public String verificarSaldo() {

            return String.format("Seu saldo é de R$"+saldo+" e o limite é R$"+limite);
    }
}
