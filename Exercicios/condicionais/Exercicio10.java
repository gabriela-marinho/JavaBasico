package gabriela.exercicios.javaCondicionais;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in );
		
		System.out.println("Qual turno vc estuda M-MANHÃ | T-TARDE | N-NOITE?  ");
		String turno = scan.next();
		
		switch (turno) {
		
		case "M" : 
		case "m" : System.out.println("BOM DIA!"); break;
		case "T" : 
		case "t" : System.out.println("BOA TARDE!"); break;
		case "N" : 
		case "n" : System.out.println("BOA NOITE!"); break;
		default :  System.out.println("valor invalido");

		}
		
		
		
		
			}

}
