package aula22.exemplo2;



public class Principal {

    public static void main(String[] args) {
      Pessoa2 p1 = new Pessoa2();

      p1.setNome("Ana");
      p1.setSobrenome("Almenim");

      Aluno a1 = new Aluno();


        a1.setNome("Ana");
        a1.setSobrenome("Almenim");
        a1.setMatricula("1t2t2t3");

        System.out.println(a1.obterDados());

    }
}
