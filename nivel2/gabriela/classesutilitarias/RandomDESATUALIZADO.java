package com.nivel2.gabriela.classesutilitarias;

import java.util.Random;

public class RandomDESATUALIZADO {
public static void main(String[] args) {
		
		System.out.println(Math.floor(Math.random() * 100));
		
		RandomDESATUALIZADO aleatorio = new RandomDESATUALIZADO();
		
		System.out.println(aleatorio.nextInt());
		
		System.out.println(aleatorio.nextInt(5 + 1));
	}

}
