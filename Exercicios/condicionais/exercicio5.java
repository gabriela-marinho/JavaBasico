package gabriela.exercicios.javaCondicionais;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in );
		
		System.out.println("Digite a PRIMEIRA nota:");
		double nota1 = scan.nextDouble();
		
		System.out.println("Digite a SEGUNDA nota:");
		double nota2 = scan.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		
		
		if(media == 10) {
			
		    System.out.println("Aprovado com Distinção");
			
		}else if(media >= 7 ) {

			System.out.println("Aprovado"); 
			
		
		}else {
			System.out.println("Reprovado"); 
		}

	}

}
