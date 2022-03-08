package gabriela.exercicios.javaBasico;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in );
		
		System.out.println("Digite o tamanho do Lado do quadrado:");
		int tamanho = scan.nextInt();
		
		double resultado = Math.pow(tamanho, 2) * 2;
		
		System.out.println("O dobro da área do quadrado é: " + resultado);
		

	}

}
