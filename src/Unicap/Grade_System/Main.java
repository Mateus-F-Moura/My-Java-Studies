package Unicap.Grade_System;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        String nome;
        double n1, n2, md;
        int tAlunos = 0;

        while (true) {
            System.out.println("Digite o nome do aluno(a) (ou 'Fim' parar encerrar): ");
            nome = input.nextLine();

            if (nome.equalsIgnoreCase("Fim")) {
                break;
            }

            do {
                System.out.println("Digite a Primeira nota: ");
                n1 = input.nextDouble();
            } while (n1 < 1.0 || n1 > 10.0);

            do {
                System.out.println("Digite a Segunda nota: ");
                n2 = input.nextDouble();
            } while (n2 < 1.0 || n2 > 10.0);

            input.nextLine();

            md = (n1 + n2) / 2;

            if (md >= 5.0 && md <= 10.0) {
                System.out.println("== APROVADO ==");
                if (md >= 7.0) {
                    System.out.println("Situação: APROVADO POR MÉDIA");
                };
            } else if (md < 5.0) {
                System.out.println("== REPROVADO ==");
            }

            System.out.println("A maior nota do aluno foi: " + Math.max(n1, n2));

            tAlunos++;
        }

        System.out.println("Total de alunos processados: " + tAlunos);

        input.close();
    }
}