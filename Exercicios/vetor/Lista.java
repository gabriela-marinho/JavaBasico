package gabriela.aprendizado.estruturadados.vetor;

import java.lang.reflect.Array;

import gabriela.parendizado.teste.Usuario;

public class Lista<T> {
	/**
	 * @author Gabriela Marinho
	 *
	 */
	private T[] elementos;
	private int tamanho;
	private Usuario[] usuarios;

	// generic do JAVA: Class<T>, podemos passar qlq tipo
	// construtor para inicializar o vetor
	public Lista(int capacidade) {
		this.elementos = (T[]) new Object[capacidade]; // solução do livro effective Java
		this.tamanho = 0;
		usuarios = new Usuario[10];
	}

	public Usuario[] getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Usuario[] usuarios) {
		this.usuarios = usuarios;
		Usuario usuario = new Usuario();
		this.usuarios[0] = usuario;
		Usuario usuario2 = new Usuario(2,"gabriela","568974");
		this.usuarios[1]=usuario2;
		Usuario usuario3 = new Usuario(3);
		this.usuarios[2]=usuario3;
	}

	public T[] getElementos() {
		return elementos;
	}

	public void setElementos(T[] elementos) {
		this.elementos = elementos;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	// public Lista(int capacidade, Class<T> tipoClasse){
//				this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
//				this.tamanho = 0;
//			}
////		
	// NÃO ENTENDI ESSE CONSTRUTOR AQUI
	public Lista() {

		this(10);

	}

	// METODO QUE ADICIONA ELEMENTO NO FINAL DO VETOR
	public boolean adiciona(T elemento) {
//				this.aumentaCapacidade();
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			this.aumentaCapacidade();
			return true;
		}
		return false;
	}

	// METODO QUE AUMENTA O TAMANHO DO VETOR
	private void aumentaCapacidade() {
		if (this.tamanho == this.elementos.length) {
			T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
			for (int i = 0; i < this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}

//			METODO QUE OBTEM A POSIÇÃO DE UM ARRAY
	public T busca(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("posiçao nao existe");
		} else {
			return this.elementos[posicao];
		}
	}

	// METODO QUE BUSCA SE UM ELEMENTO EXISTE NO VETOR
	public int busca(T elemento) {
		for (int i = 0; i < this.tamanho; i++) {
			if (this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}

	// METODO QUE DIZ QUANTOS ITENS EXISTEM NO VETOR
	public int tamanho() {
		return this.tamanho;
	}

	// METODO QUE MOSTRA A QUANTIDADE EXATA DE ITENS DO VETOR E IMPRIME
	// source =>Generate toString()
	@Override
	public String toString() {

		StringBuilder s = new StringBuilder();
		s.append("[");

		for (int i = 0; i < this.tamanho - 1; i++) {
			s.append(this.elementos[i]);
			s.append(",");
		}
		if (this.tamanho > 0) {
			s.append(this.elementos[this.tamanho - 1]);
		}

		s.append("]");
		return s.toString();
	}

	// METODO DE REMOVER UM ELEMENTO, COLOCANDO O PROXIMO EM SEU LUGAR
	public void remove(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("posiçao nao existe");
		}
		for (int i = posicao; i < this.tamanho - 1; i++) {
			this.elementos[i] = this.elementos[i + 1];
		}
		this.tamanho--;
	}

	// ex1
	public boolean contem(T elemento) {
		for (int i = 0; i < this.tamanho; i++) {
			if (this.elementos[i].equals(elemento)) {
				return true;
			}
		}
		return false;
	}

	// ex2
	public int ultimoIndice(T elemento) {
		for (int i = 0; i < this.tamanho; i++) {
			if (this.elementos[i].equals(elemento)) {
				return i;
			}

		}
		return -1;
	}
}
