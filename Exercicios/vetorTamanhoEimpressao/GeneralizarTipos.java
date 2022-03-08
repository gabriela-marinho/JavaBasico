package gabriela.aprendizado.estruturadados.vetorTamanhoEimpressao;

import gabriela.aprendizado.estruturadados.vetor.VetorObjetos;

public class GeneralizarTipos {
	public static void main(String[] args) {
		VetorObjetos vetor = new VetorObjetos(3);

		Agenda a1 = new Agenda("gabi", "859988-8888", "rua das iliveiras 25");
		Agenda a2 = new Agenda("aurean", "21777-8888", "rua das ypes 107");
		Agenda a3 = new Agenda("ozana", "1166666-5555", "rua ariel 1");
		
		vetor.adiciona(a1);
		vetor.adiciona(a2); 
		vetor.adiciona(a3);
		System.out.println("Tamanho do vetor:" + vetor.tamanho());
		int posicao = vetor.busca(a1);
		if (posicao > -1) {
			System.out.println("Contato existe");

		}else {
			System.out.println("Contato NÃO existe");

		}
		System.out.println("Itens do vetor:" + vetor);
		
		
		
		
		
		
	}
}
