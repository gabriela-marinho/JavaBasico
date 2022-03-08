package com.nivel2.gabriela.threads;

public class TesteRunnable {

	public static void main(String[] args) {
		ClasseThreadRunnable threadRunnable =  new ClasseThreadRunnable("gabriela", 1150, 2);
		ClasseThreadRunnable threadRunnable1 = new ClasseThreadRunnable("ana", 600, 3);
		ClasseThreadRunnable threadRunnable3 = new ClasseThreadRunnable("ozana", 999, 4);


		//POSSO INSTANCIAR DENTRO DO CONSTRUTOR
		//Thread t1 = new Thread(threadRunnable); 
		//t1.start();
	}

}
