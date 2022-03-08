package gabriela.exercicios.javaCondicionais;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in );
		
		System.out.println("Digite o preço da blusa:");
		double preBlusa = scan.nextDouble();
		
		System.out.println("Digite o preço da bolsa:");
		double preBolsa = scan.nextDouble();
		
		System.out.println("Digite o preço da calça:");
		double preCalca = scan.nextDouble();
		
		if(preBlusa <= preBolsa && preBolsa<= preCalca){
			System.out.println( preBlusa + " " + "Compre a Blusa!!!" );
			
		}else if(preBolsa <= preBlusa && preBlusa <= preCalca){
			System.out.println( preBolsa + " " + "Compre a bolsa!!!!" );
			
		}else if(preCalca <= preBolsa && preBolsa <= preBlusa){
		
			System.out.println( preCalca + " " + "Compre a calça!!!" );
		}	
	}
		

}
