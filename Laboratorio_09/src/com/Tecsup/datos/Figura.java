package com.Tecsup.datos;

public abstract class Figura {
	double dim1;
	double dim2;
	
	public Figura(double a, double b) {
		super();
		this.dim1 = a;
		this.dim2 = b;
	}
	
	public abstract double area();
	
}
