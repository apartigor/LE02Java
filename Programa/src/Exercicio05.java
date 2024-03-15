import java.util.Scanner;

public class Exercicio05 {
    public static void executar() {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite 5 números:");
        int[] num = new int[5];
        for (int i = 0; i < 5; i++) {
            num[i] = ler.nextInt();
        }

        System.out.println("Digite um número N:");
        int n = ler.nextInt();

        int cont = 0;
        for (int i = 0; i < 5; i++) {
            if (num[i] == n) {
                cont++;
            }
        }
        System.out.printf("O número %d aparece %d vez(es) dentro do vetor\n", n, cont);

        ler.close();
    }
}