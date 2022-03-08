package gabriela.aprendizado.javaRepeticoes;

import java.util.Scanner;

public class repeticoes30 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int tabuada;
        int vlinicial;
        int vlfinal;

        boolean dados = false;
        do{
            System.out.println("qual tabuada deseja?");
            tabuada = scan.nextInt();
            if (tabuada > 0) {
                dados = true;
            } else {
                System.out.println("Digite um valor valido!");

            }
        }while(!dados);

        dados = false;
        do{
            System.out.println("qual numero inicial deseja?");
            vlinicial = scan.nextInt();
            if (vlinicial > 0) {
                dados = true;
            } else {
                System.out.println("Digite um valor valido!");

            }
        }while(!dados);

        dados = false;
        do{
            System.out.println("qual numero final deseja?");
            vlfinal = scan.nextInt();
            if (vlfinal > 0) {
                dados = true;
            } else {
                System.out.println("Digite um valor valido!");

            }
        }while(!dados);

        for (int i = vlinicial; i<= vlfinal; i++){
            System.out.println(tabuada + " x " + i + " = " + (tabuada*i));
        }
        }
    }
