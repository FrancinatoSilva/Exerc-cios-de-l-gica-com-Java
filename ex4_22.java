package estiloFerKipper;

import java.util.Scanner;

//Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.

public class ex4_22 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Digite um número inteiro: ");
        int numeroInteiro = sc.nextInt();

        int antecessor = numeroInteiro - 1;

        int sucessor = numeroInteiro + 1;

        System.out.printf("O antecessor de %d é %d, e seu sucessor é %d.", numeroInteiro, antecessor, sucessor);


        sc.close();
    }
}
