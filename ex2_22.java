package estiloFerKipper;

import java.util.Scanner;

// 2 - Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.
public class ex2_22 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Digite um número:");
        int numero = sc.nextInt();
        System.out.println();

        if (numero % 2 == 0) {
            if (numero > 0) {
                System.out.printf("O número %d é par e é um número positivo.", numero);
            }else {
                System.out.printf("O número %d é par e é um número negativo.", numero);
            }
        }else {
            if (numero > 0) {
                System.out.printf("O número %d é impar e é um número positivo.", numero);
            }else {
                System.out.printf("O número %d é impar e é um número negativo.", numero);
            }
        }

        sc.close();
    }
}
