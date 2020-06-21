package com.tecsup.eva1;
import java.util.Scanner;

public class Aplicacion01 {
	
	public static void main(String[] args) {
		
		double cat1,cat2 ,h;
	
		Scanner s = new Scanner(System.in);
		
		System.out.println("Ingrese cateto 1 : ");
		cat1 = s.nextDouble(); 
		System.out.println("Ingrese cateto 2 : ");
		cat2 = s.nextDouble();
		
		TrianguloRectangulo t = new TrianguloRectangulo(cat1, cat2);
		h = t.hipotenusa();
		System.out.println("La hipotenusa es:   "+ h);
	}

}
