package gabriela.aprendizado.estruturadados.vetorTamanhoEimpressao;

import gabriela.aprendizado.estruturadados.vetor.Vetor;

public class RemovendoIndice {

	public static void main(String[] args) {
		Vetor vetor = new Vetor(6);

		vetor.adiciona(" e1");
		vetor.adiciona(" e2");
		vetor.adiciona(" e3");
		vetor.adiciona(" e4");
		vetor.adiciona(" e5");
		
		System.out.println(vetor);
		vetor.remove(2);
		
		System.out.println(vetor);
		System.out.println("remover elemento E10");
		int pos = vetor.busca("e10");
		if(pos >= 0) {
			vetor.remove(pos);
		}else {
			System.out.println("elemento nao existe");
		}
		System.out.println(vetor);
		
	}

}
