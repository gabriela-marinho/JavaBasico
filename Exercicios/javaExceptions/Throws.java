package gabriela.aprendizado.javaExceptions;

import java.util.Scanner;

public class Throws {
    public static void main(String[] args) {
        System.out.println("entre com um numero");
        try {
            double num = lerNumero();
            System.out.println("vc digitou " + num);
        } catch (Exception e) {
            System.out.println("numero invalido");
            e.printStackTrace();
        }
    }
    public static double lerNumero() throws Exception{
        Scanner scan = new Scanner(System.in);
        double num = scan.nextDouble();
        return num;
    }
}
