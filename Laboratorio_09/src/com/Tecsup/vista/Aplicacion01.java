package com.Tecsup.vista;
import java.util.Scanner;
import com.Tecsup.datos.*;

public class Aplicacion01 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Ingrese dimensi�n 1:");
		double a = s.nextDouble();
		System.out.println("Ingrese dimensi�n 2: ");
		double b = s.nextDouble();
		
		if (a>0 && b>0) {
			Rectangulo r = new Rectangulo(a,b);
			Triangulo t = new Triangulo(a,b);
			Figura fig;
			fig=r;
			System.out.println("El �rea del rect�ngulo es: "+fig.area());
			fig=t;
			System.out.println("El �rea del tri�ngulo es: "+fig.area());
		}else {
			System.out.println("Error...datos incorrectos");
		}
	}
}
