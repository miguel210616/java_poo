package com.Tecsup.datos;

public class Arreglos implements Constante{
	
	public int numeros[];
	
	public int mayor() {
		int numMay;
		numMay = numeros[0];
		for(int i = 0;i<numeros.length;i++) {
			if (numeros[i]>numMay) {
				numMay = numeros[i];				
			}	
		}
		return numMay;
	}

	public int menor() {
		int numMen = numeros[0];
		for(int i = 0; i<numeros.length; i++) {
			if(numMen>numeros[i]) {
				numMen = numeros[i];
			}
		}
		return numMen;
	}

	public double promedio() {
		int suma = 0;
		for(int i = 0; i<numeros.length; i++) {
			suma = suma + numeros[i];
		}
		return suma/numeros.length;
	}

	public void imprimir() {
		System.out.println("--- Número Mayor ---");
		int ma = mayor();
		System.out.println(ma);
		System.out.println("--- Número Menor ---");
		int me = menor();
		System.out.println(me);
		System.out.println("----- Promedio -----");
		double pro = promedio();
		System.out.println(pro);
	}
}
