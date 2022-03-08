package gabriela.exercicios.javaCondicionais;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in );
		
		System.out.println("Digite o valor ganho por hora:");
		double valorHora = scan.nextDouble();
		
		System.out.println("Digite a quantidade de horas trabalhadas por mês:");
		int horasTrabalhadas = scan.nextInt();
		
		double salarioBruto = valorHora * horasTrabalhadas;
		
		double iR = 0;
		int percentualIR = 0;
		int percentualINSS = 10;
		int percentualSindicato =3;
		int percentualFGTS = 11;
		if(salarioBruto <= 900) {
			percentualIR = 0;
			System.out.println("ISENTO");
		}else if(salarioBruto > 900 && salarioBruto <= 1500){
			percentualIR = 5;
			iR = salarioBruto * 0.05;
		}else if(salarioBruto > 1500 && salarioBruto <= 2500){
			percentualIR = 10;
			iR = salarioBruto * 0.10;
		}else{
			percentualIR = 20;
			iR = salarioBruto * 0.20;
		}
		
		double fgts = salarioBruto * 0.11;
		double inss = salarioBruto * 0.10;
		double sindicato = salarioBruto * 0.03;
		double descontos = inss+sindicato+iR;
		double salarioLiquido = salarioBruto  -iR - sindicato - inss;
		
		System.out.println("Salario Bruto: "+"( "+valorHora +" X "+ horasTrabalhadas+" )           :R$" + salarioBruto
				+ "          (-)IR "+"("+percentualIR +"%)" + "                                    :R$" + iR 
				+ "          (-) INSS( " + percentualINSS + "%)                                              :R$" + inss
				+ "          (-) Sindicato(" + percentualSindicato + "%)                                     :R$" + sindicato 
				+ "          FGTS(" + percentualFGTS + "%)                                                   :R$" + fgts 
				+ "          Total de descontos " + "                                                        :R$ " + descontos 
				+ "          Salario Líquido " + "                                                           :R$ " + salarioLiquido 
				);
		
	}
	

}
