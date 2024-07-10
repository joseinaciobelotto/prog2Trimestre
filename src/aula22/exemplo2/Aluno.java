package aula22.exemplo2;



public class Aluno extends Pessoa2 {

    private String matricula;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String obterDados()
    {
        return nome+""+sobrenome+""+matricula;
    }
}
