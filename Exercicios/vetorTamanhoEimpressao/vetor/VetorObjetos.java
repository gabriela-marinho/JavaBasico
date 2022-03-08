package gabriela.aprendizado.estruturadados.vetor;

public class VetorObjetos {
	/**
	 * @author Gabriela Marinho
	 *
	 */
			private Object[]elementos;
			private int tamanho;
			
			public VetorObjetos(int capacidade) {
				this.elementos = new Object[capacidade];
				this.tamanho=0;
			}
			
			
			
			//TERCEIRA OPÇÃO METODO QUE ADICIONA ELEMENTO NO FINAL DO VETOR
			public boolean adiciona(Object elemento) {
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
					Object[] elementosNovos = new Object[this.elementos.length * 2];
					for (int i=0; i<this.elementos.length; i++) {
						elementosNovos[i] = this.elementos[i];
					}
					this.elementos = elementosNovos;
				}
			}
			
			
			
			
//			METODO QUE OBTEM A POSIÇÃO DE UM ARRAY
			public Object busca(int posicao) {
				if(!(posicao >= 0 && posicao < tamanho)) {
					throw new IllegalArgumentException("posiçao nao existe");
				}else {
					return this.elementos[posicao];
				}
			}
				
			//METODO QUE BUSCA SE UM ELEMENTO EXISTE NO VETOR
				public int busca(Object elemento) {
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
						throw new IllegalArgumentException("posiçao nao existe");
					}
				 for (int i = posicao; i< this.tamanho -1; i++) {
					 this.elementos[i]=this.elementos[i+1];
				 }
				 this.tamanho--;
			 }
			
	



}
