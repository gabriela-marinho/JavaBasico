package gabriela.exercicios.javaCondicionais;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in );
		
		System.out.println("Digite um valor:");
		double valor = scan.nextDouble();
		
		
		if(valor > 0) {
			System.out.println("Valor é POSITIVO!" );

	}else {
		System.out.println("Valor é Negativo!" );
		}
	}
	

}
