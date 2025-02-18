package estruturaFor;

import java.util.Scanner;

public class ex001 {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();
        System.out.println();

        System.out.printf("Para chegar até %d esses são os números ímpares: ", numero);
        System.out.println();

        for (int i=0; i<=numero; i++) {
            if (i % 2 != 0 ) {
                System.out.println(i);
            }
        }


        sc.close();
    }
}
