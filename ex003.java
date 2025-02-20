package estruturaFor;

import java.util.Scanner;

/*
Escreva um programa que exiba os números de 1 a 10 usando o for.
 */
public class ex003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroInicial = 1;

        for (int i = 0; numeroInicial <= 10; i++) {
            System.out.println(numeroInicial);
            numeroInicial += 1;
        }

        sc.close();
    }
}
