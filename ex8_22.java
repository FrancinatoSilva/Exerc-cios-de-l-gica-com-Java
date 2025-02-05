package estiloFerKipper;

import java.util.Arrays;
import java.util.Scanner;

//Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente.
public class ex8_22 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        int[] numeros = new int[3];

        System.out.print("Digite o primeiro valor: ");
        numeros[0] = sc.nextInt();
        System.out.println();

        System.out.print("Digite o segundo valor: ");
        numeros[1] = sc.nextInt();
        System.out.println();

        System.out.print("Digite o terceiro valor: ");
        numeros[2] = sc.nextInt();
        System.out.println();

        //Ordena o array em ordem crescente
        Arrays.sort(numeros);

        //depois de ter o array ordenado, preciso apenas imprimir ao contrário na saída.

        System.out.println("Números em ordem decrescente: " +
                numeros[2] + ", " + numeros[1] + ", " + numeros[0]);

        sc.close();
    }
}
