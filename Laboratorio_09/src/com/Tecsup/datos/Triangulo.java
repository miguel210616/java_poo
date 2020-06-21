package com.Tecsup.datos;

public class Triangulo extends Figura{

	public Triangulo(double a, double b) {
		super(a, b);
	}

	
	public double area() {
		double a = dim1*dim2/2;
		return a;
	}
}
