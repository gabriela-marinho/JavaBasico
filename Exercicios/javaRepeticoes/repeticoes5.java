package gabriela.aprendizado.javaRepeticoes;

import java.util.Scanner;

public class repeticoes5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int habPaisA;
        int habPaisB;
        double txAnualCrescA;
        double txAnualCrescB;

        boolean valido = false;
        do {
            System.out.println("qual a qntd de habitantes do pais A:");
            habPaisA = scan.nextInt();
            if (habPaisA > 0) {
                valido = true;
            } else {
                System.out.println("População A precisa ser maior que 0.");

            }
        }
            while (!valido) ;


            valido = false;
            do {
                System.out.println("qual a qntd de habitantes do pais B:");
                habPaisB = scan.nextInt();
                if (habPaisB > 0) {
                    valido = true;
                } else {
                    System.out.println("População A precisa ser maior que 0.");

                }
            } while (!valido);

            valido = false;
            do {

                System.out.println("Entre com a taxa de crescimento da população A:");
                txAnualCrescA = scan.nextDouble();

                if (txAnualCrescA > 0) {
                    valido = true;
                } else {
                    System.out.println("Taxa de crescimento A precisa ser maior que 0.");
                }

            } while (!valido);


            valido = false;
            do {

                System.out.println("Entre com a taxa de crescimento da população B:");
                txAnualCrescB = scan.nextDouble();

                if (txAnualCrescB > 0) {
                    valido = true;
                } else {
                    System.out.println("Taxa de crescimento B precisa ser maior que 0.");
                }

            } while (!valido);

            int contAnos = 0;
            while (habPaisA < habPaisB) {
                habPaisA += (habPaisA * txAnualCrescA);
                habPaisB += (habPaisB * txAnualCrescB);
                contAnos++;
            }


            System.out.println("população a :" + habPaisA);
            System.out.println("população a :" + habPaisB);
            System.out.println("anos:" + contAnos);


        }
    }

