package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

	public static void main(String[] args) {
		
		int [] idades = new int[5];
		
		
		int idade = 29;		
		Integer idadeRef = Integer.valueOf(29); // eu chamo o metodo da class Integer // AUTOBOXING
		//int valor = idadeRef.intValue();
		System.out.println(idadeRef.intValue());
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.BYTES);
		System.out.println(Integer.SIZE);
		
		int valor = idadeRef.intValue(); // Unboxing
		String s = args[0];
		int numero = Integer.parseInt(s);
		System.out.println(numero);
		
		
		
		
		List <Integer> numeros = new ArrayList <Integer>();
		numeros.add(29); // Autoboxing
	}

}