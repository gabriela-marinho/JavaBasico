package com.nivel2.gabriela.threads;

public class ClasseThreads extends Thread {

	private String nome;
	private int tempo;

	
	public ClasseThreads(String nome, int tempo) {
		this.nome = nome;
		start(); // podemos colocar o metodo start dentro do construtor ,não sendo necessario fucar chamando toda hora
	}
	
	public void run() { //triangulo para cima indica que estamos sobreescrevendo o metodo na ClasseThreads
		
		try {
			for (int i=0; i<2; i++){
				System.out.println(nome + " contador " + i);
				Thread.sleep(tempo); ///coloquei a thread oara dormir
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(nome + " terminou a execução");
	}

		
		//System.out.println("EXECUTOU A THREAD");
		 
	
}
