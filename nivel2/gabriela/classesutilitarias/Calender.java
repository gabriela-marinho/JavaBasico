package com.nivel2.gabriela.classesutilitarias;

import java.util.Calendar;

public class Calender {

	public static void main(String[] args) {
		
		
		//CLASSE ABSTRATA
		//ja existe um calendario  instanciado NO JAVA, é só chamamos o getInstance.
		Calendar hoje = Calendar.getInstance(); // PADRÃO : singleton

		System.out.println(hoje);

		int ano = hoje.get(Calendar.YEAR); //constante year
		int mes = hoje.get(Calendar.MONTH);
		int dia = hoje.get(Calendar.DAY_OF_MONTH);
		int hora = hoje.get(Calendar.HOUR_OF_DAY);
		int minutos = hoje.get(Calendar.MINUTE);
		int segundos = hoje.get(Calendar.SECOND);
		
		System.out.printf("Hoje é : %02d/%02d/%d %02d:%02d:%02d", dia, (mes+1), ano, hora, minutos, segundos);
		
		//hoje.add(Calendar.DAY_OF_MONTH, -1);
		
		hoje.add(Calendar.DAY_OF_MONTH, 6);
		
		System.out.println();
		
		System.out.println(hoje.get(Calendar.DAY_OF_MONTH));
	
	}

}
