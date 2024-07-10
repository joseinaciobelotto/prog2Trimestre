package aula22.exemplo2;

public class Teste {
    public static void main(String[] args) {
        Operacoes2 op = new Operacoes2();

        System.out.println("Somando dois números"+op.soma(2,3));
        System.out.println("Somando três números"+op.soma(2,3,4));
        System.out.println("Somando duas Strings"+op.soma("Dois","Três"));
    }
}
