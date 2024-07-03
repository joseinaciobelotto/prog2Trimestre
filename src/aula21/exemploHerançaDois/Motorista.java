package aula21.exemploHerançaDois;

public class Motorista extends Funcionario
{
    public String cnh;
    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public Motorista(String nome, String sobrenome)
    {
        super(nome,sobrenome);
    }
}
