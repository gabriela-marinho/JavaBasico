package com.nivel2.gabriela.enumMetodosAbstratos;

public enum TipoDocs {
	
	CPF {
		@Override
		public String geraAleatorio() {
			return GeraCpfCpnj.cpf();
		}
	},CNPJ {
		@Override
		public String geraAleatorio() {
			return GeraCpfCpnj.cnpj();
		}
	};
	
	public abstract String geraAleatorio();

}
