package Java_Completo.Estruturas_Sequencial;

import java.util.Scanner;

public class a30_e2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double r1, rQuadrado, area;
        final double  pi = 3.14159;

        System.out.print("Digite o raio do círculo: ");
        r1 = sc.nextDouble();

        rQuadrado = Math.pow(r1, 2);
        area = pi * rQuadrado;
        System.out.printf("Resultado: %.4f%n", area);

        sc.close();
    }
}
