package estruturaWhile;

import java.util.Scanner;

public class ex000 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();
        System.out.println();

        int count = numero;
        while (numero != 0) {
            System.out.print("Digite outro número: ");
            numero = sc.nextInt();
            count = count + numero;
        }

        System.out.printf("Parabéns você conseguiu sair do loop, a soma dos " +
                "números que você digitou é %s", count);


        sc.close();
    }

}
