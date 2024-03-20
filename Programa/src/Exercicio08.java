import java.util.Scanner;

public class Exercicio08 {
    public static void executar() {
        Scanner ler = new Scanner(System.in);

        int tamA = 5;
        int tamB = 5;

        int[] vet1 = new int[tamA];
        int[] vet2 = new int[tamB];

        int tamC = vet1.length + vet2.length;
        int[] vet3 = new int[tamC];

        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite algo para o vetor 1: ");
            vet1[i] = ler.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite algo para o vetor 2: ");
            vet2[i] = ler.nextInt();
        }

        for (int i = 0; i < vet1.length; i++) {
            vet3[i] = vet1[i];

        }

        for (int i = 0; i < 5; i++) {
            vet3[vet1.length + i] = vet2[i];
        }

        System.out.println("Vetor 3 = Vetor 1 + Vetor 2: ");
        for (int i = 0; i < vet3.length; i++) {
            System.out.printf(vet3[i] + " ");
        }

        ler.close();
    }
}