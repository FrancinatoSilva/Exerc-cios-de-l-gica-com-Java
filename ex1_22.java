package estiloFerKipper;

import java.util.Scanner;

//1 - Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.

public class ex1_22 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 3 valores: ");
        int valorA = sc.nextInt();
        int valorB = sc.nextInt();
        int valorC = sc.nextInt();

        int soma = valorA + valorB;

        System.out.printf("A soma entre %d e %d é %d", valorA, valorB, soma);
        System.out.println();
        if (soma < valorC) {
            System.out.printf("%d é menor que o valor %d.", soma, valorC);
        }else if (soma == valorC) {
            System.out.printf("%d é igual ao valor %d.", soma, valorC);
        }else {
            System.out.printf("%d não é menor que o valor %d.", soma, valorC);
        }

        sc.close();

    }
}
