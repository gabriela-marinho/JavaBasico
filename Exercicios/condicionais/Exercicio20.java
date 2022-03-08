package gabriela.aprendizado.javacondicionais;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("TELEFONOU PARA VITIMA?");
        String perg1 = scan.next();

        System.out.println("ESTEVE NO LOCAL DO CRIME?");
        String perg2 = scan.next();

        System.out.println("MORA PERTO DA VITIMA?");
        String perg3 = scan.next();

        System.out.println("DEVIA PARA VITIMA?");
        String perg4 = scan.next();

        System.out.println("JÁ TRABALHOU COM A  VITIMA?");
        String perg5 = scan.next();



        int cont = 0;

        if (perg1.equalsIgnoreCase("S")){
            cont++;
        }

        if (perg2.equalsIgnoreCase("S")){
            cont++;
        }

        if (perg3.equalsIgnoreCase("S")){
            cont++;
        }

        if (perg4.equalsIgnoreCase("S")){
            cont++;
        }

        if (perg5.equalsIgnoreCase("S")){
            cont++;
        }

        if (cont == 2){
            System.out.println("Suspeita");
        } else if (cont == 3 || cont == 4){
            System.out.println("Cúmplice");
        } else if (cont == 5){
            System.out.println("Assassino");
        } else if (cont == 0){
            System.out.println("Inocente");
        }
    }
}