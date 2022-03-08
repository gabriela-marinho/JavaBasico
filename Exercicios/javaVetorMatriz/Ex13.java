package gabriela.aprendizado.javaVetorMatriz;
import java.util.Scanner;

import java.util.Random;

public class Ex13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] numerosAle = new int[3][3];

        //povoei minha matriz
        for (int i = 0; i < numerosAle.length; i++) {
            for (int j = 0; j < numerosAle[i].length; j++) {
                System.out.println("Digite os valores:");
                numerosAle [i][j] = scan.nextInt();
            }
        }
        //imprimi na tela a matriz povoada
        for (int i = 0; i < numerosAle.length; i++) {
            for (int j = 0; j < numerosAle[i].length; j++) {
                System.out.print(numerosAle[i][j] + "   ");

            }
            System.out.println();

        }
        //diz quem é par da linha e da coluna

        int par = 0;
        int impar = 0;

        for (int i = 0; i < numerosAle.length; i++) {
            for (int j = 0; j < numerosAle[i].length; j++) {
                if (numerosAle[i][j] % 2 ==0) {

                    par++;
                }else{
                    impar++;
                }
            }

            }

            System.out.println("pares = " + par);
            System.out.println("impares = " + impar);

    }
}
