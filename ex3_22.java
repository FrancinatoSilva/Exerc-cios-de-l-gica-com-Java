package estiloFerKipper;

//3 - Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores,
//caso contrário devera multiplicar A por B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e
//imprimir seu valor na tela.

import java.util.Scanner;

public class ex3_22 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Digite o valor A: ");
        int a = sc.nextInt();
        System.out.println();

        System.out.print("Digite o valor de B: ");
        int b = sc.nextInt();
        System.out.println();

        int c;
        if (a == b) {
            c = a + b;
            System.out.printf("A soma entre %d e %d é %d.",a, b, c);
        } else {
            c = a * b;
            System.out.printf("%d multiplicado por %d é igual à %d.",a, b, c);
        }


        sc.close();
    }
}
