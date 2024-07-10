package aula22.exemplo2;


public class Pessoa2 {

    public String nome;

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String sobrenome;

    public String obterDados()
    {
        return nome+""+sobrenome;
    }

    @Override
    public String toString()
    {
        return obterDados();
    }


}

