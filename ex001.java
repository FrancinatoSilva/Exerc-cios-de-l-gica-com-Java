package estruturaWhile;

import java.util.Scanner;

public class ex001 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);

        int senhaCorreta = 2002;

        System.out.print("Digite a sua senha: ");
        int senhaDigitada = sc.nextInt();
        System.out.println();

        while (senhaDigitada != senhaCorreta) {
            System.out.println("SENHA INCORRETA!");
            System.out.println();
            System.out.print("Tente novamente: ");
            senhaDigitada = sc.nextInt();
        }

        System.out.println("ACESSO PERMITIDO!");

        sc.close();
    }
}
