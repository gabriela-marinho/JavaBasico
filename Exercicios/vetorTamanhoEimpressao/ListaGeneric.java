package gabriela.aprendizado.estruturadados.vetorTamanhoEimpressao;

import gabriela.aprendizado.estruturadados.vetor.Lista;

public class ListaGeneric {

	public static void main(String[] args) {
		Lista<String> vetor = new Lista<String>("1");
		vetor.adiciona("1");
		//vetor.adiciona(1); Ele só permite argumentos do tipo String.
	}

}
