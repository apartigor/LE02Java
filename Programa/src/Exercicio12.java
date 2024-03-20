import java.util.Scanner;

public class Exercicio12 {
    public static void executar() {
        Scanner ler = new Scanner(System.in);

        int[] vetor = new int[12];
        int produto = 1;

        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < 12; i++) {
            vetor[i] = ler.nextInt();
        }
        
        for (int i = 0; i < 12; i++) {
            if (vetor[i] > 0 && vetor[i] % 2 == 0) {
                produto *= vetor[i];
            }
        }
        System.out.println("Produto dos elementos pares positivos: " + produto);
        ler.close();
    }
}