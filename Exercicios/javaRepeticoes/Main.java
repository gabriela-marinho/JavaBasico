package gabriela.aprendizado.javaRepeticoes;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in );

        boolean notaCerta = false;

        do {
            System.out.println("Digite a nota entre 0 e 10" );
            int nota = scan.nextInt();

            if(nota>= 0 && nota<=10) {
                notaCerta= true;
                System.out.println("Digite a nota: "+ nota);

            }else{
                System.out.println("Digite uma nota valida");
            }


        }while(!notaCerta);




    }
}
