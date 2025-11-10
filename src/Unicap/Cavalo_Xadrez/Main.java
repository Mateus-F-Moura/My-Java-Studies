package Unicap.Cavalo_Xadrez;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        try (Scanner sc = new Scanner(System.in)) {
            
            String linha = sc.nextLine();
            String[] posicaoStr = linha.split(" ");
            
            int[] posinicio = getCoordenadas(posicaoStr[0]);
            int[] posdestino = getCoordenadas(posicaoStr[1]);

            boolean movimentoValido = isMovimentoCavaloValido(posinicio, posdestino);

            if (movimentoValido) {
                System.out.println("VALIDO");
            } else {
                System.out.println("INVALIDO");
            }
        }
    }

    public static int[] getCoordenadas(String posicaoStr) {
        int coluna = posicaoStr.charAt(0) - 'a';
        int linha = posicaoStr.charAt(1) - '1';

        return new int[]{coluna, linha};
    }

    public static boolean isMovimentoCavaloValido(int[] inicio, int[] destino) {
        int diferencaColuna = Math.abs(inicio[0] - destino[0]);
        int diferencaLinha = Math.abs(inicio[1] - destino[1]);

        return (diferencaColuna == 1 && diferencaLinha == 2) || (diferencaColuna == 2 && diferencaLinha == 1);
    }
}