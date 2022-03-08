package com.nivel2.gabriela.classesutilitarias;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregoryCalender {

	public static void main(String[] args) {
		
		//SUBCLASSE DA CLASSE CALENDER, ESTAMOS INSTANCIANDO UMA INSRANCIA DA CLASSE CALENDER
       Calendar hoje1 = Calendar.getInstance();
       
		//PERMITE Q EU CONSIGA INSTANCIA A CLASSE
		GregorianCalendar hoje = new GregorianCalendar();
		
		//System.out.println(hoje);
		
		imprimirData(hoje);
		
		////PERTENCE A CLASSE GREGORIAN CALENDER, 
		//PARA VERIFICAR SE O ANO É BISSEXTO OU NAO É BOM TRABALHAR COM A GREGORIAM CALENDER, CASO CONTRARIO USAR A CALENDER
		//POR TRAS DOS PANOS TENHO UMA CLASSE GREGORIAN CALENDER NO CALENDER
		System.out.println(hoje.isLeapYear(2020));
		
		//MESES INICIAM NO ZERO.
		GregorianCalendar hoje2 = new GregorianCalendar(2017, 0, 1);
		
		imprimirData(hoje2);
		
		GregorianCalendar hoje3 = new GregorianCalendar(2017, 0, 1, 14, 30, 23);
		
		imprimirData(hoje3);

	}
	//COMO A CLASSE GREGORIAN cALENDER EXTENDE A CLASSE CALENDER, UTILIZAMOS O POLIMORFISMO E 
	//PASSAR O GREGORIAN CALENDER COMO PARAMETRO NO METODO IMPRIMIRdATA
	private static void imprimirData(Calendar hoje) {
		
		int ano = hoje.get(Calendar.YEAR);
		int mes = hoje.get(Calendar.MONTH);
		int dia = hoje.get(Calendar.DAY_OF_MONTH);
		int hora = hoje.get(Calendar.HOUR_OF_DAY);
		int minutos = hoje.get(Calendar.MINUTE);
		int segundos = hoje.get(Calendar.SECOND);
		
		System.out.printf("Hoje é : %02d/%02d/%d %02d:%02d:%02d", 
				dia, (mes+1), ano, hora, minutos, segundos);
		
		System.out.println();
	}

}
