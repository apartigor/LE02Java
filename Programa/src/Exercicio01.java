import java.util.Scanner;

public class Exercicio01 {
    public static void executar() {
        Scanner ler = new Scanner(System.in);

        double vetor[] = new double[5];
        double media;
        double soma = 0;
        int i;

        for (i = 0; i < 5; i++) {
            System.out.printf("Informe um valor(%d):", (i + 1));
            vetor[i] = ler.nextDouble();

        }
        for (i = 0; i < 5; i++) {
            soma = vetor[i] + soma;
        }

        media = (soma / 5);

        System.out.printf("Média: %.2f\n", media);

        for (i = 0; i < 5; i++) {
            if (vetor[i] > media) {
                System.out.printf("%.2f é maior que a média (%.2f)\n", vetor[i], media);
            } else if (vetor[i] < media) {
                System.out.printf("%.2f é menor que a média (%.2f)\n", vetor[i], media);

            } else {
                System.out.printf("%.2f é igual a média (%.2f)\n", vetor[i], media);
            }
        }
        ler.close();
    }
}
