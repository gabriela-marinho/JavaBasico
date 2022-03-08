package gabriela.aprendizado.javaVetorMatriz;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] a = new int[10];
        int [] b = new int[a.length]; //tem o mesmo tamanho do vetor a.

        for(int i = 0 ; i < a.length; i++){ //i será menor que o tamanho do vetor

            System.out.println("Entre com o valor da posição: " + i);
            a[i] = scan.nextInt();

            b[i]= a[i] * i;
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
