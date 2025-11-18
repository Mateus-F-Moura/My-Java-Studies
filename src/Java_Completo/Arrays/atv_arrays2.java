package Java_Completo.Arrays;

import java.util.Scanner;

public class atv_arrays2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;
        System.out.print("Digite quantas temperaturas você quer analisar: ");
        x = sc.nextInt();

        int[] temp = new int[x];
        int maior = temp[0];

        for (int i = 0; i < temp.length; i++) {
            System.out.print("Digite um temperatura: ");
            temp[i] = sc.nextInt();

            if (temp[i] > maior) {
                maior = temp[i];
            }
        }

        System.out.println("A maior temperatura é: " + maior);
    }
}