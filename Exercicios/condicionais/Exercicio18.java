package gabriela.aprendizado.javacondicionais;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero inteiro:");
        int num = scan.nextInt();

        if(num % 2 ==0){
            System.out.println("Número Par");
        }else{
            System.out.println("Número ímpar!");
        }

    }
}
