package com.nivel2.gabriela.enumClasses;

public enum ClasseConstrutorEnum {

	DOMINGO(1),SEGUNDA(2),TERCA(3),QUARTA(4),QUINTA(5),SEXTA(6),SABADO(7);

	private int valor;
	
	//não uso modificadores de acesso no construtor do enum
	ClasseConstrutorEnum(int valor){
		this.valor = valor;
	}
	
	public int getValor() {
		return this.valor;
	}
}
