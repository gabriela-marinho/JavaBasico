package gabriela.aprendizado.javaVetorMatriz;

import java.util.Random;

public class Ex12 {
    public static void main(String[] args) {
        int[][] numerosAle = new int[10][10];

        Random numeroRandom = new Random();

        for (int i = 0; i < numerosAle.length; i++) {
            for (int j = 0; j < numerosAle[i].length; j++) {
                numerosAle[i][j] = numeroRandom.nextInt(50);

            }
        }
        for (int i = 0; i < numerosAle.length; i++) {
            for (int j = 0; j < numerosAle[i].length; j++) {
                System.out.print(numerosAle[i][j] + "   ");

            }
            System.out.println();

        }

        int linhaMaior5 = 0;
        int linhaMenor5 = 51;
        int linha = 5;
        for (int i = 0; i < numerosAle[linha].length; i++) {

            if (numerosAle[linha][i] > linhaMaior5) {
                linhaMaior5 = numerosAle[linha][i];
                //linha = i;
            }
            if (numerosAle[5][i] < linhaMenor5) {
                linhaMenor5 = numerosAle[linha][i];
                //linha = i;
            }
        }
        System.out.println("Maior valor da linha 5 = " + linhaMaior5);
        System.out.println("Menor valor da linha 5 = " + linhaMenor5);


        int colMaior5 = 0;
        int colMenor5 = 51;
        int col = 7;
        for (int i = 0; i < numerosAle[col].length; i++) {

            if (numerosAle[i][col] > colMaior5) {
                colMaior5 = numerosAle[i][col];
                //col = i;
            }
            if (numerosAle[i][col] < colMenor5) {
                colMenor5 = numerosAle[i][col];
               // col = i;
            }
        }

        System.out.println("Maior valor da coluna 7 = " + colMaior5);
        System.out.println("Menor valor da coluna 7 = " + colMenor5);
    }
}
