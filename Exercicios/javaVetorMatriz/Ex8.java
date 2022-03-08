package gabriela.aprendizado.javaVetorMatriz;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] a = new int[10];
        int [] b = new int[a.length]; //tem o mesmo tamanho do vetor a.
        int [] c = new int[a.length];

        for(int i = 0 ; i < a.length; i++){ //i será menor que o tamanho do vetor

            System.out.println("Entre com o valor da posição A: " + i);
            a[i] = scan.nextInt();
        }

        for(int i = 0 ; i < b.length; i++) { //i será menor que o tamanho do vetor

            System.out.println("Entre com o valor da posição B: " + i);
            b[i] = scan.nextInt();
        }

        for(int i = 0 ; i < c.length; i++) { //i será menor que o tamanho do vetor


            c[i] = a[i]*b[i];
        }
        System.out.print("Vetor a = ");
        for (int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }

        System.out.print("Vetor B = ");
        for (int i=0; i<b.length; i++){
            System.out.print(b[i] + " ");
        }
        System.out.print("Vetor c = ");
        for (int i=0; i<c.length; i++){
            System.out.print(c[i] + " ");
        }
    }
}



