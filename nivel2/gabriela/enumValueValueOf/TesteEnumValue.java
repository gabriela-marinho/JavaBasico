package com.nivel2.gabriela.enumValueValueOf;

import com.nivel2.gabriela.enumClasses.ClasseConstrutorEnum;

public class TesteEnumValue {

	public static void main(String[] args) {

		
		//1 OPÇÃO : ITERO COM O FOR, COLOCANDO A CLASSE ENUM DENTRO DE UM VETOR
		ClasseConstrutorEnum[] dias = ClasseConstrutorEnum.values();
		
		for(int i =0; i< dias.length;i++) {
			System.out.println(dias[i]);
		}
		
		//FOR MELHORADO
		//2 OPÇÃO :  ATRIBUO A CLASSE ENUM A UMA VARIAVEL E FAÇO DIRETAMENTE A CLASSE COM O .VALUES()
		
		for(ClasseConstrutorEnum dia :ClasseConstrutorEnum.values()) {
			System.out.println(dia);
		}
	}

}
