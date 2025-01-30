package estiloFerKipper;

import java.util.Locale;
import java.util.Scanner;

/*
Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule quantos salários mínimos esse
usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20).
*/
public class ex5_22 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        sc.useLocale(Locale.US);

        double salarioMinimo = 1293.20;

        System.out.print("Informe o seu salário: ");
        double salarioDoUsuario = sc.nextDouble();

        double quantidadeDeSalarios = salarioDoUsuario / salarioMinimo;

        System.out.printf("Você recebe aproximadamente %.2f salários mínimos.%n", quantidadeDeSalarios);


        sc.close();
    }
}
