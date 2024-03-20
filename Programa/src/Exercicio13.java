import java.util.Scanner;

public class Exercicio13 {
    public static void executar() {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o numero de termos da fómula Fibonacci(lembre-se deve ser N > 2 )");
        int tamN = ler.nextInt();
        if (tamN <= 2) {
            System.out.println("Inválido (N <= 2)");
            return;
        }

        int[] vet = new int[tamN];

        vet[1] = 1;
        vet[0] = 1;

        for (int i = 2; i < tamN; i++)
        {
            vet[i] = vet[i - 1] + vet[i - 2];
        }

        System.out.println("Sequência de Fibonacci com os primeiros " + tamN + " termos: ");
        for (int i = 0; i < tamN; i++)
        {
            System.out.println(vet[i]);
        }

        ler.close();
    }
}