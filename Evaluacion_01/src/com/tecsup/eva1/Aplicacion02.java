package com.tecsup.eva1;

import java.util.Scanner;

public class Aplicacion02 {

	public static void main(String[] args) {
		
		double r;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Ingrese el radio: ");
		r = s.nextDouble();
		
		Circulo c = new Circulo(r);
		System.out.println("El �rea del c�rculo es :   "+c.calcularArea());
		
	}

}
