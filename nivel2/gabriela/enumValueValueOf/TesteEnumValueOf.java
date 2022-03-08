package com.nivel2.gabriela.enumValueValueOf;

import com.nivel2.gabriela.enumConstantes.DiaSemana;

public class TesteEnumValueOf {

	public static void main(String[] args) {
		
						
			System.out.println(Enum.valueOf(DiaSemana.class, "SEGUNDA"));
			
			//se não souber, mas tiver um valor de uma string, pode avaliar o valor dessa string, transformando ela
			//numa propria instancia de um enumerador
			DiaSemana dia = Enum.valueOf(DiaSemana.class, "DOMINGO");
			
			System.out.println(dia);

	}

}
