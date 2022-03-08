package gabriela.aprendizado.estruturadados.vetorTamanhoEimpressao;

import gabriela.aprendizado.estruturadados.vetor.Vetor;

public class Capacidade {

	public static void main(String[] args) {
		Vetor vetor = new Vetor(2);

		vetor.adiciona(" 1");
		vetor.adiciona(" 2");
		vetor.adiciona(" 3");
		vetor.adiciona(" 4");
		vetor.adiciona(" 5");
		
		System.out.println(vetor);
	}

}
