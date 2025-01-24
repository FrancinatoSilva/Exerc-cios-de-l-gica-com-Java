package estiloFerKipper;

import java.util.Scanner;

public class exVetor01 {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Quantos números você vai digitar? ");
        int repeticoes = sc.nextInt();

        int[] vetor = new int[repeticoes];
        for (int i=0; i < repeticoes; i++) {
            System.out.printf("Digite o %da número: ", i + 1);
            vetor[i] = sc.nextInt();
        }

        System.out.println("Números negativos: ");
        for (int i=0; i < repeticoes; i++) {
            if (vetor[i] < 0) {
                System.out.println(vetor[i]);
            }else {
                System.out.println("Nenhum número digitado é negativo!");
            }
        }

        sc.close();
    }

}
