package com.nivel2.gabriela.enumCalculadoraExercicio;

public enum Calculadora {
	SOMAR("+") {
		@Override
		public double executarOperacao(double x, double y) {
			// TODO Auto-generated method stub
			return x + y;
		}
	},SUBTRAIR("-") {
		@Override
		public double executarOperacao(double x, double y) {
			// TODO Auto-generated method stub
			return x - y;
		}
	},MULTIPLICAR("*") {
		@Override
		public double executarOperacao(double x, double y) {
			// TODO Auto-generated method stub
			return x * y;
		}
	},DIVIDIR("/") {
		@Override
		public double executarOperacao(double x, double y) {
			// TODO Auto-generated method stub
			return x / y;
		}
	};
	
	private String sinal;
	
	Calculadora(String sinal ) {
		this.sinal=sinal;
	}
	
	
	public abstract double executarOperacao(double x,double y);
		
	public String toString(){
		return this.sinal;
	}

	
	
	
}
