package Loops;

import java.util.Scanner;

public class a54_e1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;

        do {
            x = sc.nextInt();
        } while (x < 1 || x > 1000);

        for (int i = 1; i <= x; i++) {
            if (i % 2 != 0){
                System.out.println(i);
            }
        }

        sc.close();
    }

}
