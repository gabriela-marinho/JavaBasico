package com.nivel2.gabriela.enumConstantes;

public class Teste {

	public static void main(String[] args) {
		usandoConstantes();
		
	System.out.println();
	
		agoraComEnum();
	}
	
	private static void usandoConstantes() {
		int domingo = ClasseEnum.DOMINGO;
		int segunda = ClasseEnum.SEGUNDA_FEIRA;
		int terca = ClasseEnum.TERCA_FEIRA;
		int quarta = ClasseEnum.QUARTA_FEIRA;
		int quinta = ClasseEnum.QUINTA_FEIRA;
		int sexta = ClasseEnum.SEXTA_FEIRA;
		int sabado = ClasseEnum.SABADO;

		System.out.println("teste utilizando CONSTANTE");
		imprimeDiaSemana(domingo);
		imprimeDiaSemana(segunda);
		imprimeDiaSemana(terca);
		imprimeDiaSemana(quarta);
		imprimeDiaSemana(quinta);
		imprimeDiaSemana(sexta);
		imprimeDiaSemana(sabado);
	}
	
	
	private static void imprimeDiaSemana(int dia) {
		switch (dia) {
		case 1: 

			System.out.println("Domingouuuuu!");
			break;

		case 2: 

			System.out.println("Segundou!");
			break;	

		case 3: 

			System.out.println("Terçou!");
			break;
		case 4: 

			System.out.println("Quartou!");
			break;
		case 5: 

			System.out.println("Caranguejo!");
			break;
		case 6: 

			System.out.println("Sextou menino!!!!!!!");
			break;
		case 7: 

			System.out.println("Cervejou!");
			break;
		}
		
	
	}
	private static void agoraComEnum() {
		
		DiaSemana dom = DiaSemana.DOMINGO;
		DiaSemana seg = DiaSemana.SEGUNDA;
		DiaSemana ter = DiaSemana.TERCA;
		DiaSemana qua = DiaSemana.QUARTA;
		DiaSemana qui = DiaSemana.QUINTA;
		DiaSemana sex = DiaSemana.SEXTA;
		DiaSemana sab = DiaSemana.SABADO;
		System.out.println("teste utilizando ENUM");
		imprimeDiaSemanaEnum(dom);
		imprimeDiaSemanaEnum(seg);
		imprimeDiaSemanaEnum(ter);
		imprimeDiaSemanaEnum(qua);
		imprimeDiaSemanaEnum(qui);
		imprimeDiaSemanaEnum(sex);
		imprimeDiaSemanaEnum(sab);

		
	}
	
	private static void imprimeDiaSemanaEnum(DiaSemana dia) {
		switch (dia) {
		case DOMINGO: 

			System.out.println("Domingouuuuu!COM ENUM");
			break;

		case SEGUNDA: 

			System.out.println("Segundou!COM ENUM");
			break;	

		case TERCA: 

			System.out.println("Terçou!COM ENUM");
			break;
		case QUARTA: 

			System.out.println("Quartou!COM ENUM");
			break;
		case QUINTA: 

			System.out.println("Caranguejo!COM ENUM");
			break;
		case SEXTA: 

			System.out.println("Sextou menino!COM ENUM");
			break;
		case SABADO: 

			System.out.println("Cervejou!COM ENUM");
			break;
		}
	}	

}
