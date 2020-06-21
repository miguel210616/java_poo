package com.tecsup.eva1;

import java.util.Scanner;

public class Aplicacion04 {

	public static void main(String[] args) {
		
		double a,b,c;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Forma general de una ecuación cuadrática");
		System.out.println("        ax^2 + bx + c = 0 ");
		System.out.println("Ingrese los valores de a, b, c");
		System.out.println("Valor de 'a': ");
		a = s.nextDouble();
		System.out.println("Valor de 'b': ");
		b = s.nextDouble();
		System.out.println("Valor de 'c': ");
		c = s.nextDouble();
		
		EcuacionCaudratica e = new EcuacionCaudratica(a, b, c);
		
		if (e.discriminante()<0) {
			System.out.println("Ecuacion -->  "+e.getA()+"x^2 +"+e.getB()+"x +"+e.getC()+" = 0");
			System.out.println("Discriminante:   "+e.discriminante());
			System.out.println("");
			System.out.println("La ecuación tiene raices imaginarias");
		}else if (e.discriminante()==0){
			System.out.println("Ecuacion -->  "+e.getA()+"x^2 +"+e.getB()+"x +"+e.getC()+" = 0");
			System.out.println("Discriminante:   "+e.discriminante());
			System.out.println("-------------Raices-----------");
			System.out.println("Primera raiz:   "+e.raiz1());
			System.out.println("Segunda raiz:   "+e.raiz2());
			System.out.println("");
			System.out.println("La ecuación tiene raices iguales");
		}else {
			System.out.println("Ecuacion -->  "+e.getA()+"x^2 +"+e.getB()+"x +"+e.getC()+" = 0");
			System.out.println("Discriminante:   "+e.discriminante());
			System.out.println("-------------Raices-----------");
			System.out.println("Primera raiz:   "+e.raiz1());
			System.out.println("Segunda raiz:   "+e.raiz2());
			System.out.println("");
			System.out.println("La ecuación tiene raices Reales");
		}
		
	}

}
