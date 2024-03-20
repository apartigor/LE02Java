import java.util.Scanner;

public class Exercicio11 {
    public static void executar() {
        Scanner ler = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[5];

        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < 5; i++) {
            vetorA[i] = ler.nextInt();
        }

        System.out.println("Digite os elementos do vetor B:");
        for (int i = 0; i < 5; i++) {
            vetorB[i] = ler.nextInt();
        }


        int produtoEscalar = 0;
        for (int i = 0; i < 5; i++) {
            produtoEscalar += vetorA[i] * vetorB[i];
        }

        System.out.println("Produto eleralar: " + produtoEscalar);

        ler.close();
    }
}