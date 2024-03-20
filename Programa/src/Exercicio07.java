import java.util.Scanner;

public class Exercicio07 {
    public static void executar() {
        Scanner ler = new Scanner(System.in);

       int[] vet1 = new int[5];
       int[] vet2 = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite algo para o vetor 1: ");
            vet1[i] = ler.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite algo para o vetor 2: ");
            vet2[i] = ler.nextInt();
        }

        boolean iguais = true;
        
        for (int i = 0; i < 5; i++) {
            if (vet1[i] != vet2[i]) {
                iguais = false;
                break;
            }
        }

        if(iguais) {
            System.out.println("Os vetores são iguais.");
        }
        else {
            System.out.println("Os vetores não são iguais.");
        }


        ler.close();
    }
}