package com.tecsup.eva1;

public class TrianguloRectangulo {
	private double cateto1;
	private double cateto2;
	
	public TrianguloRectangulo(double cateto1, double cateto2) {
		this.cateto1 = cateto1;
		this.cateto2 = cateto2;
	}
	
	public double hipotenusa() {
		double h = Math.sqrt(Math.pow(cateto1,2)+Math.pow(cateto2, 2));
		return h;
	}

	public double getCateto1() {
		return cateto1;
	}

	public void setCateto1(double cateto1) {
		this.cateto1 = cateto1;
	}

	public double getCateto2() {
		return cateto2;
	}

	public void setCateto2(double cateto2) {
		this.cateto2 = cateto2;
	}

}
