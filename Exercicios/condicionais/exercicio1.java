package gabriela.exercicios.javaCondicionais;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in );
		
		System.out.println("Digite um n�mero:");
		double num1 = scan.nextDouble();
		
		System.out.println("Digite OUTRO n�mero:");
		double num2 = scan.nextDouble();
		
		if(num1 >num2) {
			System.out.println("N�mero 1 � MAIOR que n�mero 2" );

	}else {
		System.out.println("N�mero 2 � MAIOR que n�mero 1" );
		}
	}

}
