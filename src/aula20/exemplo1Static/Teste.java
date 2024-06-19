package aula20.exemplo1Static;

public class Teste {

    public static void main(String[] args)
    {
        ContaTeste2 c1 = new ContaTeste2("Jonas", "123", 10);
        c1.nomeBanco = "Banco Cimol";
        ContaTeste2 c2 = new ContaTeste2("Ana", "123", 10);
        System.out.println(("Nome do banco de c1"+c1.nomeBanco));
        System.out.println(("Nome do banco de c1"+c2.nomeBanco));

    }

}
