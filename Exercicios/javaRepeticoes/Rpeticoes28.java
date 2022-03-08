package gabriela.aprendizado.javaRepeticoes;

import java.util.Scanner;

public class Rpeticoes28 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numInformado;

        System.out.println("Digite um numero");
        numInformado = scan.nextInt();

        if(numInformado / numInformado == 1){
            System.out.println("numero" + numInformado + "é primo");
        }

    }
}
