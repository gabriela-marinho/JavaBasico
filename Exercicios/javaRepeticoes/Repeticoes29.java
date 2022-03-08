package gabriela.aprendizado.javaRepeticoes;

import java.util.Scanner;

public class Repeticoes29 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numInformado;


        boolean dados =false;
        do{
            System.out.println("Digite um numero");
            numInformado = scan.nextInt();

        }  while (!dados);

        for(int i = 1;i<=numInformado;i++){
            dados = true;
            for(int j= 2;j<=i;j++){
                if (i % j == 0){
                    dados = false;

                }
            if (dados){
                System.out.println(i);

            }
            }
        }
    }
}
