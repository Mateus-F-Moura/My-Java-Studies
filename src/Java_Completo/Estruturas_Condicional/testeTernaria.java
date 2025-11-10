package Java_Completo.Estruturas_Condicional;

import java.util.Scanner;

public class testeTernaria {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x, y, z;
        x = input.nextInt();
        y = input.nextInt();

        z = (x > y) ? 1 : 0;

        System.out.println("z = " + z);
    }
}
