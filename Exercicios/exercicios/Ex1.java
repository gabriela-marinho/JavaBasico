package gabriela.aprendizado.estruturadados.exercicios;

import gabriela.aprendizado.estruturadados.vetor.Lista;

public class Ex1 {

		
public static void main(String[] args) {
		
		Lista<String> lista = new Lista<String>();
		
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");
		
		System.out.println(lista.contem("J"));
		System.out.println(lista.contem("B"));
		System.out.println(lista.contem("Y"));
    }
}
