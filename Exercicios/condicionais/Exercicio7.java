package gabriela.exercicios.javaCondicionais;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in );
		
		System.out.println("Digite um numero:");
		double num1 = scan.nextDouble();
		
		System.out.println("Digite OUTRO numero:");
		double num2 = scan.nextDouble();
		
		System.out.println("Digite MAIS UM numero:");
		double num3 = scan.nextDouble();
		
		if(num1 >= num2 && num1 >= num3 ) {
			
			System.out.println("numero 1 é o maior");
		}else if(num2 >= num1 && num2 >= num3 ) {
			
			System.out.println("numero 2 é o maior");
		}else {
			System.out.println("numero 3 é o maior");
		}
		
		
		if(num1 <= num2 && num1 <= num3) {
			System.out.println("numero 1 é o menor");
		}else if(num2 <= num1 && num2 <= num3) {
			System.out.println("numero 2 é o menor");
		}else {
			System.out.println("numero 3 é o maior");
		}
		
		
	}

}
