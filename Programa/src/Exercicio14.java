import java.util.Scanner;

public class Exercicio14 {
    public static void executar() {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite os elementos do vetor:");
        int[] vet = new int[5];
        for (int i = 0; i < vet.length; i++) {
            vet[i] = ler.nextInt();
        }
        int maior = 0;
        for (int i = 1; i < vet.length; i++) {
            if (vet[i] > vet[maior]) {
                maior = i;
            }
        }

        int temp = vet[maior];
        vet[maior] = vet[vet.length - 1];
        vet[vet.length - 1] = temp;

        System.out.println("Vetor atualizado com o maior elemento na última posição:");
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + " ");
        }

        ler.close();
    }
}