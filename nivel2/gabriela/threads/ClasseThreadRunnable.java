package com.nivel2.gabriela.threads;

public class ClasseThreadRunnable implements Runnable{

	private String nome;
	private int tempo;
	private int sala;

	
	public ClasseThreadRunnable() {
		super();
	}

	public ClasseThreadRunnable(String nome, int tempo , int sala) {
		this.nome= nome;
		this.tempo=tempo;
		this.sala=sala;
		//THIS FAZ REFERENCIA A PROPRIA CLASSE
		Thread t = new Thread(this); //construtor do proprio Thread
		t.start();
	}

	public void run() {

		try {
			for(int i =0; i< 1; i++) {
				System.out.println(nome + " SE DIRIJA A SALA: "+ sala + i);
				Thread.sleep(tempo);
			}

		} catch(InterruptedException e){
			e.printStackTrace();
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void adiciona(String nome) {
		
	}
}
