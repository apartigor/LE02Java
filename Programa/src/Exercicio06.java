import java.util.Scanner;

public class Exercicio06 {
    public static void executar() {
        Scanner ler = new Scanner(System.in);

        double[] nota = new double[5];
        double[] peso = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.printf("Nota(%d): ", i + 1);
            nota[i] = ler.nextDouble();
        }
        for (int i = 0; i < 5; i++) {
            System.out.printf("Peso da Nota(%d): ", i + 1);
            peso[i] = ler.nextDouble();
        }
        double somaNotas = 0;
        double somaPesos = 0;
        for (int i = 0; i < 5; i++) {
            somaNotas = nota[i] * peso[i] + somaNotas;
            somaPesos = somaPesos + peso[i];
        }

        double media = somaNotas / somaPesos;

        System.out.printf("Média Ponderada: %.2f", media);

        ler.close();
    }
}