package gabriela.exercicios.javaCondicionais;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in );
		
		System.out.println("Digite o seu salario:");
		double salario = scan.nextDouble();
		
		

		
		double reajuste = 0;
		int percentual = 0;
		if(salario <= 280) {
			percentual = 20;
			reajuste = salario * 0.20;
		}else if(salario > 280 && salario < 700){
			percentual = 15;
			reajuste = salario * 0.15;
		}else if(salario >= 700 && salario <= 1500){
			percentual = 10;
			reajuste = salario * 0.10;
		}else{
			percentual = 5;
			reajuste = salario *0.05;
		}
		
		double salAjustado = reajuste + salario;
				
		System.out.println("Salario : " + salario + " " + "Seu reajuste é:"
				+ " " + reajuste + " " + "Foi dado um percentual de:" + percentual +"%" + " Salario Reajustado:" + salAjustado
				
				);
		
	}

}
