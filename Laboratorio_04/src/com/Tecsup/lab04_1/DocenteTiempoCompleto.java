package com.Tecsup.lab04_1;

public class DocenteTiempoCompleto extends Docente {
	
	double sueldoBasico, porcentajeBonifi;
	
	public DocenteTiempoCompleto(String nom, String ape, String dni,
					double sueldoBasico, double porcentajeBonifi) {
		super(nom, ape, dni);
		this.sueldoBasico = sueldoBasico;
		this.porcentajeBonifi = porcentajeBonifi;
	}
	
	String obtenerDatos() {
		return "Nombre   :" + getNom() + "\n" +
				"Apellido:   " + getApe() + "\n" +
				"DNI:   " + getDni() + "\n" +
				"Sueldo:   " + getSueldoBasico() + "\n" +
				"Bonificación:   " + getPorcentajeBonifi()+"%";
		
	}

	double bonifiSoles() {
		return sueldoBasico*porcentajeBonifi/100;
	}
	
	double sueldoBruto() {
		return sueldoBasico+bonifiSoles();
	}

	public double getSueldoBasico() {
		return sueldoBasico;
	}

	public void setSueldoBasico(double sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}

	public double getPorcentajeBonifi() {
		return porcentajeBonifi;
	}

	public void setPorcentajeBonifi(double porcentajeBonifi) {
		this.porcentajeBonifi = porcentajeBonifi;
	}
	
}
