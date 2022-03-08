package com.nivel2.gabriela.strings;

import java.util.StringTokenizer;

public class Importante {

	public static void main(String[] args) {
		
		//TRABALHO DE INTEGRA��O
		String teste = "Isso � um teste.";
		
		System.out.println(teste);
		//METODO SUBSTRING
		/*indice de inicio :10
		 * indice de inicio e fim :10 , 15 
		 */
		System.out.println(teste.substring(10));
		System.out.println(teste.substring(10, 15));

		//CONCAT NORMAL
		String ola = "ol�";
		String mundo = " mundo";
		String olaMundo = ola.concat(mundo); //ola + mundo
		System.out.println(olaMundo);
		
		//METODO REPLACE
		/* replace, coloca um caractere no seu lugar
		 */
		String espacos = "i s p a � o";
		String semEspacos = espacos.replace('i', 'e');
		System.out.println(semEspacos);
		
		//METODO REGEX
		/* substituir todos os espa�os por uma sting vazia :""
		 * com espa�o : " "
		 */
		semEspacos = semEspacos.replaceAll(" ", "");
		System.out.println(semEspacos);
		
		//ESPA�OS ADICIONAIS
		 /*remove todos os espa�os na frente e atras
		  * 
		  */
		String nome = " meu nome �: ";
		System.out.println(nome);
		System.out.println(nome.trim());
		
		
		String teste2 = "Teste";
		// TUDO EM LETRA MINUSCULA
		String testeMinusc = teste2.toLowerCase();
		//TUDO EM LETRA MAIUSCULA
		String testeMaisc = teste2.toUpperCase();

		System.out.println(testeMinusc);
		System.out.println(testeMaisc);
		
		//COMPARA�OES DE STRING SEM UTILIZAR EQUALSIGNORECASE
		//if (teste.toLowerCase().equals(teste.toLowerCase()))
		
		
		//JUNTANDO STRING
		System.out.println("*****JOIN E SPILT*****");
		
		//METODO JOIN ,PRIMEIRO PASSO UMA SEQUENCIA DE CARACTERES, E PARAMETROS Q EU QUERO SEPEPAR
		String alfabeto = String.join(", ", "A", "B", "C", "D");
		System.out.println(alfabeto);

		//METODO SEPARAR
		String[] letras = alfabeto.split(", ");
		for (String letra : letras){
			System.out.println(letra);
		}
		
		String doArquivo = "1;Ant�nio;30;";
		String[] infos = doArquivo.split(";");
		//transformo para Interger, quem for int
		Pessoa pessoa = new Pessoa(Integer.parseInt(infos[0]), infos[1], Integer.parseInt(infos[2]));
		System.out.println(pessoa);
		

		System.out.println("StringBuilder | StringBuffer");

		String[] letras1 = {"B", "C", "D", "E", "F"};

		String alfabeto1 = "";
		
		for (String letra1 : letras1){
			alfabeto1 += letra1;
		}

		System.out.println(alfabeto1);
		
		
		
		System.out.println("StringBuffer");
		
		//� THREAD SAVE
		//apend de novas strings
		StringBuffer sb = new StringBuffer();
		for (String letra1 : letras1){
			
			//append q eu quero adicionar
			sb.append(letra1);
		}
		alfabeto = sb.toString();
		
		System.out.println(alfabeto + "stringBuffer");
		
		alfabeto1 = new String(sb);
		System.out.println(alfabeto1);
		
		System.out.println(sb.reverse()+ "invertido");
		
		
		
		
		System.out.println("StringBuilder");

		//quando temos mais de uma thread precisamos trabalhar com stringBuffer
		//quandop nao sincromizamos os recursos em varias thjreads pode dar problema
		//N�O � THREAD sAVE
		StringBuilder sb_ = new StringBuilder();
		for (String letra1 : letras1){
			sb_.append(letra1);
		}
		alfabeto1 = sb_.toString();
		
		System.out.println(alfabeto1);
		
		
		System.out.println("StringTokenizer");

		String doArquivo1 = "1;Ant�nio;30;";
		//VAMOS EXTRAIR TOKENS DA STRING QUE ESTAMOS EXTRAINDO INFORMA�OES
		//AQUI VAMOS INFORMAR A STRING DE ONDE VAMOS PUXAR AS INFORMA�OES E O SEGUNDO PARAMETRO � ONDE FICA O DELIMITADOR
		StringTokenizer st = new StringTokenizer(doArquivo1, ";");
		//ENQUANTO O StringTokenizer TEM MAIS TOKENS...
		while (st.hasMoreTokens()){
			//AQUI EM NEXTTOKEM � UMA FORMA DE ITERAR
			
			System.out.println(st.nextToken());
		}
		
	}
	
	
	

}
