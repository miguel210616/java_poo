package com.tecsup.eva1;

public class EcuacionCaudratica {
	
	private double a;
	private double b;
	private double c;
	
	public EcuacionCaudratica(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double discriminante() {
		return Math.pow(b, 2)-(4*a*c);
	}
	
	public double raiz1() {
		double r = ((-b)+Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a);
		return r;
	}

	public double raiz2() {
		double r = ((-b)-Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a);
		return r;
	}
	
	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}
}
