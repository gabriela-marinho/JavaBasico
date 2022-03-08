package com.nivel2.gabriela.enumClasses;

public class Formulario {
	
	enum Genero {
		FEMELE('F'),
		MASC('M');
		
		private char valor;
		Genero(char valor){
			this.valor=valor;
		}
	}
	
	private String nome;
	private Genero genero;
}
