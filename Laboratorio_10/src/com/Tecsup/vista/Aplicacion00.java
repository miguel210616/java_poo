package com.Tecsup.vista;

public class Aplicacion00 {

	public static void main(String[] args) {
		int a = 45;
		int b = 0;
		
		try{
			int c = a/b;
			System.out.println(c);
		}catch(ArithmeticException e) {
			System.out.println("Error...division por cero");
		}
		
		System.out.println("Continua...");
	}
}
