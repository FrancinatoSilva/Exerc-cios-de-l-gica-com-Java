package estiloFerKipper;

import java.util.Scanner;

public class exVetor02 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Quantos números você vai digitar? ");
        int quantidadeDeNumeros = sc.nextInt();

        double[] vetor = new double[quantidadeDeNumeros];
        for (int i=0; i < quantidadeDeNumeros; i++) {
            System.out.printf("Digite o %da número: ", i+1);
            vetor[i] = sc.nextDouble();
            System.out.println();
        }

        double soma = 0;
        for (int i=0; i < quantidadeDeNumeros; i++) {
             soma = soma + vetor[i];
        }
        double media = soma / quantidadeDeNumeros;

        System.out.print("Valores = ");
        for (int i=0; i < quantidadeDeNumeros; i++) {
            System.out.print(vetor[i]+" ");
        }
        System.out.println();
        System.out.printf("Soma = %.2f", soma);
        System.out.println();
        System.out.printf("Media = %.2f", media);

        sc.close();
    }
}
