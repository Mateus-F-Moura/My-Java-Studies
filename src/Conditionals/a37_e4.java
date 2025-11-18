package Conditionals;

import java.util.Scanner;

public class a37_e4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start, end, duration = 0;

        start = sc.nextInt();
        end = sc.nextInt();

        if (end == 0 && start == 0) {
            duration = 24;
        } else if (end < start) {
            duration = (24 - start) + end;
        } else if (end > start) {
            duration = end - start;
        }

        System.out.println("O jogo durou " + duration + " hora(s)");

        sc.close();
    }
}
