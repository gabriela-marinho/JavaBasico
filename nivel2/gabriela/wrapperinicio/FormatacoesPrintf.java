package com.nivel2.gabriela.wrapperinicio;

public class FormatacoesPrintf {

	public static void main(String[] args) {
		
		
		//FORMATANDO STRING
		System.out.printf("%s", "Olá, Mundo!");
		System.out.println();
		// %S deixa tudo em caixa alta
		System.out.printf("%S", "Olá, Mundo!");
		System.out.println();

		//FORMATANDO CARACTERES
		System.out.printf("%c", 'c');
		System.out.println();
		System.out.printf("%C", 'c');
		
		// PULA NOVA LINHA, É UMA BOA PRATICA
		System.out.printf("%n");
		
		//FORMATAÇÃO DE INTEIROS
		int valor = 123456789;
		System.out.printf("%d", valor);

		System.out.println();

		//FORMATAÇÃO PONTO FLUTUANTE
		double pontoFlutuante = 3.1456789;
		System.out.printf("%f", pontoFlutuante);

		System.out.println();

		//ALINHAMANETO A ESQUERDA E A DIREITA COM UM ESPAÇO
		String olaMundo = "Olá, Mundo!";
		System.out.printf("%20s", olaMundo);

		System.out.println();

		System.out.printf("%-20s", olaMundo);

		System.out.println();

		// FORMATAÇÃO DE NUMEROS COLOCANDO UM SINAL DE POSITIVO NA FRENTE
		System.out.printf("%+d", valor);

		System.out.println();

		//FORMATAÇÃO DE NUMEROS COLOCANDO A QUANTIDADE DE NUMEROS QUE DESEJA IMPRIMIR, SE O NUMERO NAO ATINGIR A QUANTIDADE ELE COLOCA ZEROS NA FRENTE.

		System.out.printf("%015d", valor);

		System.out.println();

		//FORMATAÇÃO APLICANDO AS VIRGULAS NO NUMERO, SEPARANDO CENTENAS UNIDADES E MILHARES ETC.
		System.out.printf("%,d", valor); //usem , EM PORTUGUES BRASIL
		
		System.out.println();
		
		
		
		int valor2 = -123456789;
		System.out.printf("%d", valor2);
		System.out.println();
		System.out.printf("% d", valor);

		System.out.println();

		//AREDONDA PARA QUANTIDADE DE CASAS DECIMAIS ABAIXO MOSTRA Q SÃO 3 CASAS
		System.out.printf("%.3f", pontoFlutuante);

		System.out.println();
		
		//AQUI TERÁ 10 NUMEROS (Q NAO VÃO APARECER) E APOS O PONTO A QUANTIDADE DE NUMEROS APOS A VIRGULA.

		System.out.printf("R$%10.2f", pontoFlutuante);

		System.out.println();

		testeMaisCompleto();
	}
	
	private static void testeMaisCompleto(){
		
		double[] precos = {10000, 123.54, 7843.567, 1, 4.56789};
		
		for (int i=0; i<precos.length; i++){
			System.out.printf("%s %02d: total de R$%,10.2f%n", "Item", i+1, precos[i]);
		}
		
	}

}
