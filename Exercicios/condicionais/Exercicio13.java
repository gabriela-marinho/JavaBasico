package gabriela.exercicios.javaCondicionais;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in );
		
		System.out.println("Digite a PRIMEIRA nota:");
		double nota1 = scan.nextDouble();
		
		System.out.println("Digite a SEGUNDA nota:");
		double nota2 = scan.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		
		
		if(media <= 10 && media >= 9) {
			
		    System.out.println("APROVADO ,Conceito A");
			
		}else if(media >= 7.5 && media <=9 ) {

			System.out.println("APROVADO ,Conceito B"); 
			
		}else if(media >= 6 && media <=7.5 ) {

			System.out.println("APROVADO ,Conceito C"); 
			
		
		}else if(media >= 4 && media <=6 ) {

			System.out.println("REPROVADO ,Conceito D"); 
			
		}else {
			System.out.println("REPROVADO ,Conceito E"); 
		} 
		
		System.out.println("Nota 1:" +" "+ nota1 + "  " + "Nota 2:"+" " + nota2 +  "  " + "Média:" +" "+ media); 
	}

}
