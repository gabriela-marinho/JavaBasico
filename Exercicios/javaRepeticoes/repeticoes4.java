package gabriela.aprendizado.javaRepeticoes;

import java.util.Scanner;

public class repeticoes4 {
    public static void main(String[] args) {



        int habPaisA = 80000;
        int habPaisB = 200000 ;
        int contAnos = 0;
        double txAnualCrescA = 0.03;
        double txAnualCrescB = 0.015;

        while (habPaisA < habPaisB){
            habPaisA += (habPaisA * txAnualCrescA);
            habPaisB += (habPaisB * txAnualCrescB);
            contAnos++;
        }
        System.out.println("população a :" + habPaisA);
        System.out.println("população a :" + habPaisB);
        System.out.println("anos:" + contAnos);
    }
}
