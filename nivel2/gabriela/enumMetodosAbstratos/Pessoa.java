package com.nivel2.gabriela.enumMetodosAbstratos;

public class Pessoa {
	
	private TipoDocs tipoDocs; //ENUM
	private String numDoc;
	
	
	
	public Pessoa() {
		super();
	}
	
	public Pessoa(TipoDocs tipoDocs, String numDoc) {
		super();
		this.tipoDocs = tipoDocs;
		this.numDoc = numDoc;
	}
	public TipoDocs getTipoDocs() {
		return tipoDocs;
	}
	public void setTipoDocs(TipoDocs tipoDocs) {
		this.tipoDocs = tipoDocs;
	}
	public String getNumDoc() {
		return numDoc;
	}
	public void setNumDoc(String numDoc) {
		this.numDoc = numDoc;
	}

	@Override
	public String toString() {
		return "Pessoa [tipoDocs=" + tipoDocs + ", numDoc=" + numDoc + "]";
	}
	
	
	

}
