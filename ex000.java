package estruturaFor;

import java.util.Scanner;

public class ex000 {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int count = 0;

        for (int i=0; i<N; i++) {
            int X = sc.nextInt();
            count += X;
        }

        System.out.printf("A soma dos números digitados é %d", count);

        sc.close();
    }
}
