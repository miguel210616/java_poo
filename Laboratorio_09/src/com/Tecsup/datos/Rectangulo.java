package com.Tecsup.datos;

public class Rectangulo extends Figura  {
	
	public Rectangulo(double a, double b) {
		super(a, b);
	}

	public double area() {
		double a = dim1*dim2;
		return a;
	}
}
