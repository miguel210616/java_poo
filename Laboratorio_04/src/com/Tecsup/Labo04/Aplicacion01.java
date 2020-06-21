package com.Tecsup.Labo04;
import java.util.Scanner;

public class Aplicacion01 {
	
	public static void main(String[] args) {
		
		String nom, dni, direc;
		int n1, n2;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Ingrese nombre: ");
		nom = s.next();
		System.out.println("Ingrese DNI: ");
		dni = s.next();
		System.out.println("Ingrese dirección: ");
		direc = s.next();
		System.out.println("Ingrese nota 1: ");
		n1 = s.nextInt();
		System.out.println("Ingrese nota 2: ");
		n2 = s.nextInt();
		
		Postulante p = new Postulante(nom, dni, direc, n1,n2);
		
		System.out.println(" ");
		System.out.println("------ Datos personales------");
		System.out.println("Nombre:     "+p.getNombre());
		System.out.println("DNI:      "+p.getDni());
		System.out.println("Direccion:      "+p.getDireccion());
		System.out.println("");
		System.out.println("----------Resultados----------");
		System.out.println("Código:      "+p.autogenerado());
		System.out.println("Promedio:      "+p.promedio());
		System.out.println("Condición:      "+p.condicion());
	}
}
