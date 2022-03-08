/**
 * 
 */
package gabriela.aprendizado.estruturadados.vetor;

//import java.util.Arrays;

/**
 * @author Gabriela Marinho
 *
 */
public class Vetor {
	//todos os elementos do vetor
		private String[]elementos;
		
		//atributo  que controla o tamanho real do vetor e guarda a ultima posição do vetor.
		private int tamanho;
		
		//construtor para inicializar o vetor, com  capacidade de elementos que eu quero criar, 
		public Vetor(int capacidade) {
			this.elementos = new String[capacidade];
			//inicializar o vetor com tamanho zero, assim qnd eu for aumentando ele vai crescendo junto com o vetor 
			this.tamanho=0;
		}
		
		// PRIMEIRA OPÇÃO aqui eu estava iterando todo o vetor para achar um elemento NULO
		/* public void adiciona(String elemento) {
			for(int i=0; i< this.elementos.length; i++) {
				if (this.elementos[i] == null) {
					this.elementos[i] = elemento;
					break;
				}
			} */
		
		/*public void adiciona(String elemento) throws Exception {
			
			//SEGUNDA OPÇÃO  verifico se o vetor é maior que a capacidade de elementos
			if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho ++;
			}else {
				//se eu uso o throw tenho q declarar ele no metodo.
				throw new Exception("Vetor já está cheio!");
			}
		}*/
		
		//TERCEIRA OPÇÃO METODO QUE ADICIONA ELEMENTO NO FINAL DO VETOR
		public boolean adiciona(String elemento) {
//			this.aumentaCapacidade();
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
				String[] elementosNovos = new String[this.elementos.length * 2];
				for (int i=0; i<this.elementos.length; i++) {
					elementosNovos[i] = this.elementos[i];
				}
				this.elementos = elementosNovos;
			}
		}
		
		
		
		
//		METODO QUE OBTEM A POSIÇÃO DE UM ARRAY
		/*public String busca(int posicao) {
			if(!(posicao >= 0 && posicao < tamanho)) {
				throw new IllegalArgumentException("posiçao nao existe");
			}else {
				return this.elementos[posicao];
			}*/
			
		//METODO QUE BUSCA SE UM ELEMENTO EXISTE NO VETOR
			public int busca(String elemento) {
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

