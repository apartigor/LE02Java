import java.util.Scanner;

public class Exercicio09 {
    public static void executar() {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite os elementos do vetor A:");
        double[] A = new double[5];
        for (int i = 0; i < 5; i++) {
            A[i] = ler.nextDouble();
        }

        System.out.println("Digite os elementos do vetor B:");
        double[] B = new double[5];
        for (int i = 0; i < 5; i++) {
            B[i] = ler.nextDouble();
        }

        double[] C = new double[5];
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                C[i] = A[i / 2];
            } else {
                C[i] = B[(i - 1) / 2];
            }
        }

        System.out.println("Vetor C:");
        for (int i = 0; i < 5; i++) {
            System.out.println(C[i]);
        }

        ler.close();
    }
}