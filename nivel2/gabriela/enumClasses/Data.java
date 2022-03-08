package com.nivel2.gabriela.enumClasses;

public class Data {

	private int dia;
	private int mes;
	private int ano;
	private ClasseConstrutorEnum classeConstrutorEnum;
	
	public Data() {
		super();
	}

	public Data(int dia, int mes, int ano, ClasseConstrutorEnum classeConstrutorEnum) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.classeConstrutorEnum = classeConstrutorEnum;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public ClasseConstrutorEnum getClasseConstrutorEnum() {
		return classeConstrutorEnum;
	}

	public void setClasseConstrutorEnum(ClasseConstrutorEnum classeConstrutorEnum) {
		this.classeConstrutorEnum = classeConstrutorEnum;
	}
	
	
}
