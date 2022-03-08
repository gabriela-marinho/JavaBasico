package gabriela.exercicios.javaCondicionais;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in );
		
		System.out.println("Digite seu Sexo:");
		String sexo = scan.next();
		//como fazer no next pRA LER STRING . reposta: String input
	
		
		if(sexo.equalsIgnoreCase("f")) {
			System.out.println("Feminino" );

		}else if (sexo.equalsIgnoreCase("m")){
			System.out.println("Masculino" );
		}else {
			System.out.println("Sexo não cadastrado" );

		}
	}

}


