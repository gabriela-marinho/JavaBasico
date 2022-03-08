package com.nivel2.gabriela.enumClasses;

import com.nivel2.gabriela.enumConstantes.DiaSemana;

public class TesteEnum {

	public static void main(String[] args) {
		
		// AQUI É A CLASSE ONDE ESTÁ O GETVALOR, NÃO INSTANCIAMOS OS ENUMERADOS COM O NEW, É FEITO IMPLICITAMENTE.
		ClasseConstrutorEnum dia = ClasseConstrutorEnum.QUINTA;
		
		//System.out.print(dia.toString() + " -> " + dia.getValor());
		
		Data data = new Data(24, 2, 2022, ClasseConstrutorEnum.QUINTA);
		System.out.println(dia.toString() +" -> " + data.getDia()+ " /" + data.getMes()+ " /" +data.getAno());
	}

}
