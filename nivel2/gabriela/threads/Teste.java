package com.nivel2.gabriela.threads;

public class Teste {

	public static void main(String[] args) {

		ClasseThreads  thread = new ClasseThreads("Threads",1000);
		//thread.start(); //aqui chamo o metodo start, que executa o metodo RUN
		ClasseThreads thread2 = new ClasseThreads("Thread #2", 900);
		
		ClasseThreads thread3 = new ClasseThreads("Thread #3", 500);
	}

}
