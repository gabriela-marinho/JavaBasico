package gabriela.aprendizado.estruturadados.exercicios;

import gabriela.aprendizado.estruturadados.vetor.Lista;
import gabriela.parendizado.teste.Usuario;

public class Ex2 {

	public static void main(String[] args) {
		
		Lista<String> lista = new Lista<String>();
		
		Lista l = new Lista();
		l.setUsuarios( new Usuario[10]);
		System.out.println(l.getTamanho());
		System.out.println(l.getUsuarios()[0].toString());
		System.out.println(l.getUsuarios()[1].toString());
		System.out.println(l.getUsuarios()[2].toString());
//		lista.adiciona("A");
//		lista.adiciona("B");
//		lista.adiciona("C");
//		
		/*System.out.println(lista.contem("J"));
		System.out.println(lista.contem("B"));
		System.out.println(lista.contem("Y"));*/
				//System.out.println(lista.tamanho());

//		lista.ultimoIndice();
//		System.out.println(lista.ultimoIndice());
	}

}
