package gabriela.aprendizado.javaVetorMatriz;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] a= {1,3,5,7,9,11,13,15,2,6,10,14,18,22,26};
        int[] b = new int[15]; //tem o mesmo tamanho do vetor a.

        for(int i=0;i<a.length;i++){
            b[i]=a[i] * a[i];

        }
        System.out.print("Vetor A = ");
        for (int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor B = ");
        for (int i=0; i<b.length; i++){
            System.out.print(b[i] + " ");
        }

    }
}
