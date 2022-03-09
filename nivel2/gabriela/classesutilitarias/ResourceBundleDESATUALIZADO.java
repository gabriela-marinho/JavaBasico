package com.nivel2.gabriela.classesutilitarias;

import java.util.Locale;

///
public class ResourceBundleDESATUALIZADO {

	public static void main(String[] args) {
		System.out.println("Locale atual " + Locale.getDefault());
		ResourceBundleDESATUALIZADO rb = ResourceBundleDESATUALIZADO.getBundle("meu-texto");
		
		System.out.println("Hello EN: " + rb.getString("hello"));
		System.out.println("World EN: " + rb.getString("world"));
		
		// Locale.setDefault(new Locale("pt_BR", "pt_BR"));
		rb = ResourceBundleDESATUALIZADO.getBundle("meu-texto");
		
		System.out.println("Olá pt_BR: " + rb.getString("hello"));
		System.out.println("Mundo pt_BR: " + rb.getString("world"));
	}

	
}
