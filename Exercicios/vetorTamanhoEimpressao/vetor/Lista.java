package gabriela.aprendizado.estruturadados.vetor;

import java.lang.reflect.Array;

public class Lista <T>{
	/**
	 * @author Gabriela Marinho
	 *
	 */
			private T[]elementos;
			private int tamanho;
			
			
			public Lista(int capacidade, Class<T> tipoClasse) {
				this.elementos = (T[ ]) Array.newInstance(tipoClasse, capacidade); // (T[]) new Object[capacidade];  => solu��o do Livro Java Efetivo.
				this.tamanho=0;
			}
			
			
			
			public Lista(String string) {
				// TODO Auto-generated constructor stub
			}



			//TERCEIRA OP��O METODO QUE ADICIONA ELEMENTO NO FINAL DO VETOR
			public boolean adiciona(T elemento) {
//				this.aumentaCapacidade();
				if (this.tamanho < this.elementos.length){
					this.elementos[this.tamanho] = elemento;
					this.tamanho++;
					this.aumentaCapacidade();
					return true;
				} 
				return false;
			}
			//METODO QUE AUMENTA O TAMANHO DO VETOR
			private void aumentaCapacidade() {
				if (this.tamanho == this.elementos.length) {
					T[] elementosNovos =  (T[])new Object[this.elementos.length * 2];
					for (int i=0; i<this.elementos.length; i++) {
						elementosNovos[i] = this.elementos[i];
					}
					this.elementos = elementosNovos;
				}
			}
			
			
			
			
//			METODO QUE OBTEM A POSI��O DE UM ARRAY
			public T busca(int posicao) {
				if(!(posicao >= 0 && posicao < tamanho)) {
					throw new IllegalArgumentException("posi�ao nao existe");
				}else {
					return this.elementos[posicao];
				}
			}
				
			//METODO QUE BUSCA SE UM ELEMENTO EXISTE NO VETOR
				public int busca(T elemento) {
					    for(int i =0; i< this.tamanho; i++) {
					    	if(this.elementos[i].equals(elemento)) {
					    		return i;
						}
					}
					return -1;
				}
				
			
			//METODO QUE DIZ QUANTOS ITENS EXISTEM NO VETOR
			public int tamanho() {
				return this.tamanho;
			}
			//METODO QUE MOSTRA A QUANTIDADE EXATA DE ITENS DO VETOR E IMPRIME
			//source =>Generate toString() 
			@Override
			public String toString() {
				
				StringBuilder s = new StringBuilder();
				s.append("[");
				
				for(int i =0; i<this.tamanho -1; i++) {
					s.append(this.elementos[i]);
					s.append(",");
				}
				if (this.tamanho > 0) {
					s.append(this.elementos[this.tamanho-1]);
				}
				
				s.append("]");
				return s.toString();
			}
			
			//METODO DE REMOVER UM ELEMENTO, COLOCANDO O PROXIMO EM SEU LUGAR
			 public void remove(int posicao) {
				 if(!(posicao >= 0 && posicao < tamanho)) {
						throw new IllegalArgumentException("posi�ao nao existe");
					}
				 for (int i = posicao; i< this.tamanho -1; i++) {
					 this.elementos[i]=this.elementos[i+1];
				 }
				 this.tamanho--;
			 }
			
	



}


