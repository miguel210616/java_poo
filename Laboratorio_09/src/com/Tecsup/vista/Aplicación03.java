package com.Tecsup.vista;
import java.util.Scanner;
import com.Tecsup.datos.*;

public class Aplicación03 {
	public static void main(String[] args) {
		Fibonacci f = new Fibonacci();
		Scanner s = new Scanner(System.in);
		System.out.println("------ Serie Fibonacci ------");
		System.out.println("Ingrese el número de términos que desea vizualizar:");
		int l = s.nextInt();	
		f.imprimirFibonacci(l);
		f.imprimirFibonacci02(l);
	}
}