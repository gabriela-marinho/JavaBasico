package com.nivel2.gabriela.enumMetodosAbstratos;

public class TesteDocs {

	public static void main(String[] args) {

//		for(TipoDocs doc : TipoDocs.values()) { //vamos obter todos os valores desse cpf e cnpj
//			System.out.println(doc + " - " + doc.geraAleatorio());

			Pessoa pf = new Pessoa();
			pf.setTipoDocs(Enum.valueOf(TipoDocs.class, "CPF")); // LEMBRANDO QUE AQUI PASSO A CLASSE ENUM E APOS O ENUM LISTADO NA CLASSE(nesse caso cpf ou cnpj)
			pf.setNumDoc(pf.getTipoDocs().geraAleatorio());
			System.out.println(pf);

			Pessoa pj = new Pessoa();
			pj.setTipoDocs(Enum.valueOf(TipoDocs.class, "CNPJ")); // LEMBRANDO QUE AQUI PASSO A CLASSE ENUM E APOS O ENUM LISTADO NA CLASSE(nesse caso cpf ou cnpj)
			pj.setNumDoc(pj.getTipoDocs().geraAleatorio());
			System.out.println(pj);

		}
	}



