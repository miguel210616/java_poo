package com.Tecsup.Labo04;

public class Postulante extends Persona{
	
	private int nota1;
	private int nota2;

	public Postulante(String nombre, String dni, String direccion, 
						int nota1, int nota2) {
		super(nombre, dni, direccion);
		this.nota1 = nota1;
		this.nota2 = nota2;

	}

	public int getNota1() {
		return nota1;
	}

	public void setNota1(int nota1) {
		this.nota1 = nota1;
	}

	public int getNota2() {
		return nota2;
	}

	public void setNota2(int nota2) {
		this.nota2 = nota2;
	}
	
	public String autogenerado() {
		return getNombre().charAt(0) + getDni();
	}
	
	public double promedio() {
		return (getNota1()+2*getNota2())/3;
	}
	
	public String condicion() {
		if(promedio()>=14) {
			return "Aceptado";
		}else {
			return "Rechazado";
		}
	}
	
}
