package com.Tecsup.lab04_1;

import java.util.Scanner;

public class Aplicacion02 {

	public static void main(String[] args) {
		
		int tipo;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Tipos de profesor:  (1)Tiempo parcial  "
							+ " (2)Tiempo Completo");
		tipo = s.nextInt();
		
		if(tipo==1) {
			
			String nom, ape, dni;
			double horas, tarifa;
			
			System.out.println("Ingrese nombre:");
			nom = s.next();
			System.out.println("Ingrese apellido:");
			ape = s.next();
			System.out.println("Ingrese DNI:");
			dni = s.next();
			System.out.println("Número de horas trabajadas:");
			horas = s.nextInt();
			System.out.println("Tar1ifa por hora:");
			tarifa = s.nextInt();
			
			DocenteTiempoParcial d1= new DocenteTiempoParcial(nom, ape, 
													dni, horas, tarifa);
			System.out.println(" ");
			System.out.println("-----Datos personales-----");
			String dato = d1.obtenerDatos();
			System.out.println(dato);
			System.out.println("Código:   "+d1.generarCodigo());
			System.out.println(" ");
			System.out.println("----------Sueldo----------");
			System.out.println("Sueldo bruto:   "+d1.sueldoBruto());	
		}else if(tipo==2) {
			String nom, ape, dni;
			double sueldo, boni;
			System.out.println("Ingrese nombre:");
			nom = s.next();
			System.out.println("Ingrese apellido:");
			ape = s.next();
			System.out.println("Ingrese DNI:");
			dni = s.next();
			System.out.println("Sueldo básico:");
			sueldo = s.nextInt();
			System.out.println("Porcentaje de bonificacion(%):");
			boni = s.nextInt();
			
			DocenteTiempoCompleto d2= new DocenteTiempoCompleto(nom, ape, 
													dni, sueldo, boni);
			System.out.println(" ");
			System.out.println("-----Datos personales-----");
			String dato = d2.obtenerDatos();
			System.out.println(dato);
			System.out.println("Código:   "+d2.generarCodigo());
			System.out.println(" ");
			System.out.println("----------Sueldo----------");
			System.out.println("Sueldo bruto:   "+d2.sueldoBruto());
		}else {
			System.out.println("Opción incorrecta");
		}
	}
}
