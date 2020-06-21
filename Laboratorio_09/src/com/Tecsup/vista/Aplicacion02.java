package com.Tecsup.vista;
import java.util.Scanner;
import com.Tecsup.datos.Arreglos;

public class Aplicacion02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Arreglos a = new Arreglos();
		System.out.println("Ingrese la cantidad de números");
		int l = s.nextInt();
		a.numeros=new int[l];
		
		for(int i=0;i<l;i++) {
			System.out.println("Ingrese un número:");
			int num = s.nextInt();
			a.numeros[i]=num;			
		}
		a.imprimir();
	}

}
