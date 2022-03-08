package gabriela.exercicios.javaBasico;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in );
		
		System.out.println("Digite o Raio do círculo:");
		int raio = scan.nextInt();
		
		double resultado = Math.PI * Math.pow(raio, 2);
		
		System.out.println("A área do cículo é: " + resultado);
		

	}

}
