package gabriela.exercicios.javaCondicionais;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in );
		
		System.out.println("Digite uma Letra:");
		String letra = scan.next();

		switch(letra) {
		case "a": 
		case "e": 
		case "i": 
		case "o": 
		case "u": System.out.println("Sua Letra é uma vogal!"); break;
		default : System.out.println("Sua Letra é uma consoante!");
		}
	}
}	


