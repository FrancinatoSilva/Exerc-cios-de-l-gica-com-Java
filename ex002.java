package estruturaFor;

import java.sql.SQLOutput;
import java.util.Scanner;

/*
Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
*/
public class ex002 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Digite um valor:");
        int repeticao = sc.nextInt();
        System.out.println();

        int dentroDoIntervalo = 0;
        int foraDoIntervalo = 0;

        System.out.printf("Digite %d números: ", repeticao);
        System.out.println();

        for (int i=0; i < repeticao; i++) {
            int numeroLido = sc.nextInt();
            System.out.println();
            if (numeroLido >= 10 && numeroLido <= 20) {
                dentroDoIntervalo += 1;
            } else {
                foraDoIntervalo += 1;
            }

        }

        System.out.printf("Dos números digitados %d estão no intervalo de 10-20 e " +
                "%d estão fora desse intervalo.", dentroDoIntervalo, foraDoIntervalo);

        sc.close();
    }
}
