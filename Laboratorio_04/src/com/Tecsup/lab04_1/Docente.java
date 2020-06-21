package com.Tecsup.lab04_1;

public class Docente {
	
	protected String nom, ape,dni;

	public Docente(String nom, String ape, String dni) {
		this.nom = nom;
		this.ape = ape;
		this.dni = dni;
	}

	public String generarCodigo() {
		return ""+nom.charAt(0)+ape.charAt(ape.length()-1)+dni;
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getApe() {
		return ape;
	}

	public void setApe(String ape) {
		this.ape = ape;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

}
