package gabriela.exercicios.javaBasico;

import java.util.Scanner;

public class Exercicio10 {

	
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in );
			
			System.out.println("Digite a temperatura em C°:");
			double grauC = scan.nextInt();
			
			double resultado = grauC *1.8 + 32;
			
			System.out.println("Temperatura em F° é" +" " + resultado + " " + "F°");
			

		}
}
