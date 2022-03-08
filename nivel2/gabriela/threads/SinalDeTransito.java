package com.nivel2.gabriela.threads;

public class SinalDeTransito implements Runnable{

	private String cor;
	private boolean parar;
	private long tempo;



	public SinalDeTransito() {
		super();

	}

	public SinalDeTransito(String cor, long tempo) {
		super();
		this.cor = cor;
		//this.parar = false; //posso deixar de colocar essa info pois todo boolean começa com false.
		this.tempo = tempo;
		//Thread t = new Thread(this);
		//t.start();
		new Thread(this).start();

	}	
	//OU dessa forma é mais simplificado
	/* new Thread(this,cor).start();
	 * 
	 *  é a MESMA COISA que fazer :
	 * Thread t = new Thread(this);
		    t.start();
	 * 
	 */
	@Override
	public synchronized void run() {

		//while(!parar) {
				
			//System.out.println("OLHE PARA O SINAL");
			for(int i=0; i<=3;i++) {
				System.out.println("OLHE PARA O SINAL");
				System.out.print("mudando a cor  =====>");
				System.out.println(" " + cor);
			}
			try {
				Thread.sleep(tempo);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}



		}
				

			

}	
	
	
	
	//}




