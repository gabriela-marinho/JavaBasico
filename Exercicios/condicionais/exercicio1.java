package gabriela.exercicios.javaCondicionais;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in );
		
		System.out.println("Digite um número:");
		double num1 = scan.nextDouble();
		
		System.out.println("Digite OUTRO número:");
		double num2 = scan.nextDouble();
		
		if(num1 >num2) {
			System.out.println("Número 1 é MAIOR que número 2" );

	}else {
		System.out.println("Número 2 é MAIOR que número 1" );
		}
	}

}
