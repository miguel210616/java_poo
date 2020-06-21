package com.Tecsup.lab04_1;

public class DocenteTiempoParcial extends Docente{
	
	double horas, tarifa;
	
	public DocenteTiempoParcial (String nom, String ape, String dni, 
								double horas, double tarifa) {
		super(nom, ape, dni);
		this.horas = horas;
		this.tarifa = tarifa;
	}
	
	String obtenerDatos() {
		return "Nombre   :" + getNom() + "\n" +
				"Apellido:   " + getApe() + "\n" +
				"DNI:   " + getDni() + "\n" +
				"Horas:   " + getHoras() + "\n" +
				"Tarifa:   " + getTarifa();
	}
	
	double sueldoBruto() {
		return horas*tarifa;
	}
	
	public double getHoras() {
		return horas;
	}
	
	public void setHoras(double horas) {
		this.horas = horas;
	}
	
	public double getTarifa() {
		return tarifa;
	}

	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}	
}
