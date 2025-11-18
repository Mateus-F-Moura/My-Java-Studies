package Java_Completo.Loops;

import java.util.Scanner;

public class a54_e6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, divisor;

        x = sc.nextInt();

        for (int i = x; i > 0; i--) {
            if (x % i == 0) {
                divisor = x / i;
                System.out.println(divisor);
            }
        }

        sc.close();
    }

}
