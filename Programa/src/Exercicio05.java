import java.util.Scanner;

public class Exercicio05 {
    public static void executar() {
       Scanner ler = new Scanner(System.in);

       System.out.println("Digite 5 números:");
       double[] numeros = new double[5];
       for (int i = 0; i < 5; i++) {
           numeros[i] = ler.nextDouble();
       }

       System.out.println("Digite um número n:");
       double n = ler.nextDouble();

       System.out.println("Os índices dos elementos inferiores a n são:");
       for (int i = 0; i < 5; i++) {
           if (numeros[i] < n) {
               System.out.println(i + " ");
           }
       }

       ler.close();
   }
}