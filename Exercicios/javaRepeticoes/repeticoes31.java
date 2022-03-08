package gabriela.aprendizado.javaRepeticoes;

import java.util.Scanner;

public class repeticoes31 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double salInicial;
        double percentual = 0.015;


        boolean dados = false;
        do{
            System.out.println("Digite seu salario inicial:");
            salInicial = scan.nextDouble();
            if (salInicial > 0) {
                dados = true;
            } else {
                System.out.println("Digite um salario valido!");

            }
        }while(!dados);

        for (int i = 1997; i<=2022; i++){
           percentual *= 2;
           salInicial += salInicial * percentual;
        }
            System.out.println( " Salario final:" + salInicial);
    }
}
