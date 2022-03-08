package gabriela.aprendizado.javaVetorMatriz;
import java.util.Random;
import java.util.Scanner;
public class Ex11 {
    public static void main(String[] args) {
        int[][] numerosAle = new int[4][4];

        Random numeroRandom = new Random();

        for (int i = 0; i < numerosAle.length; i++) {
            for (int j = 0; j < numerosAle[i].length; j++) {
                numerosAle[i][j] = numeroRandom.nextInt(9);

            }
        }
        int maior = 0;
        int linha = 0;
        int coluna = 0;
        for (int i = 0; i < numerosAle.length; i++) {
            for (int j = 0; j < numerosAle[i].length; j++) {
                if (numerosAle[i][j] > maior) {
                    maior = numerosAle[i][j];
                    linha = i;
                    coluna = j;
                }
            }
            for (i = 0; i < numerosAle.length; i++) {
                for (int j = 0; j < numerosAle[i].length; j++) {
                    System.out.print(numerosAle[i][j] + " ");

                }
                System.out.println();
            }
            System.out.println("Maior valor = " + maior);
            System.out.println("Linha = " + linha);
            System.out.println("Coluna = " + coluna);
        }
    }
}
