package gabriela.exercicios.javaBasico;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in );
		
		System.out.println("Digite a temperatura em F°:");
		double grauF = scan.nextInt();
		
		double resultado = (5 * (grauF-32)/9);
		
		System.out.println("Temperatura em C° é" +" " + resultado + " " + "Celsius");
		

	}

}
