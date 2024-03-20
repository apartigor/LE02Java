import java.util.Scanner;

public class Exercicio15 {
    public static void executar() {
        Scanner ler = new Scanner(System.in);

        int vet[] = new int[5];

        System.out.println("Digite o primeiro numero do vetor: ");
        vet[0] = ler.nextInt();

        for (int i = 1; i < vet.length; i++) {
            System.out.println("Digite o proximo número");
            int num = ler.nextInt();

            if (num > vet[i - 1])
            {
                vet[i] = num;
            }
            else {
                System.out.println("Número inválido, deve ser maior que o anterior");
                i--;
            }
        }

        System.out.println("Vetor Preenchido: ");
        for(int i = 0; i < vet.length; i++){
            System.out.println(vet[i] + " ");
        }

        ler.close();
    }
}