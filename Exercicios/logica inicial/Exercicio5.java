package gabriela.exercicios.javaBasico;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in );
		
		System.out.println("Digite a quantidade de metros,para conversão");
		int metro = scan.nextInt();
		
		int resultado = metro * 100;
		
		System.out.println(metro +"metro(s) equivalem a:"  + resultado + "cm");
		

	}

}
