package com.Tecsup.datos;

public class Fibonacci extends Arreglos{
	
	Arreglos f = new Arreglos();
	
	public int numerosFibonacci(int n) {		
		if(n>2) {
		return numerosFibonacci(n-1) + numerosFibonacci(n-2);
		}else if (n==2) {
			return 1;
		}else if (n==1) {
			return 0;
		}else {
			return -1;
		}
	}
	
	public void imprimirFibonacci(int m) {
		f.numeros = new int[m];
		System.out.println("----- Modo 1 ----");
		System.out.println("Serie Fibonacci:");
		for(int i = 0; i<m; i++) {
			int x = numerosFibonacci(i+1);
			f.numeros[i] = x;
			System.out.println(f.numeros[i]+" ");
		}
	}

	public void imprimirFibonacci02(int m) {
		f.numeros = new int[m];
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<m; i++) {
			int x = numerosFibonacci(i+1);
			f.numeros[i] = x;
			sb.append(f.numeros[i]+" ");
		}
		System.out.println("");
		System.out.println("----- Modo 2 -----");
		System.out.println("Serie Fibonacci:  "+sb);
	}
		
}
	

