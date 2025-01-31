package estiloFerKipper;

import java.util.Locale;
import java.util.Scanner;

//Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.
public class ex6_22 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        System.out.print("Informe o seu salário atual: ");
        double salarioAtual = sc.nextDouble();

        double salarioComReajuste = salarioAtual * 1.05;

        System.out.printf("Com o reajuste seu salário será R$%.2f!", salarioComReajuste);



        sc.close();
    }
}
