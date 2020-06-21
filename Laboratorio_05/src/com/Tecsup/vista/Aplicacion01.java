package com.Tecsup.vista;

import java.util.Scanner;

import com.Tecsup.datos.lab05.Ventas;

public class Aplicacion01 {
	
	public static void main(String[] args) {
		
		String cod, product;
		int cant;
		double preci;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Ingrese el código: ");
		cod = s.next();
		System.out.println("Ingrese el producto: ");
		product = s.next();
		System.out.println("Ingrese la cantidad: ");
		cant = s.nextInt();
		System.out.println("Ingrese el precio: ");
		preci = s.nextDouble();
		
		Ventas v = new Ventas();
		v.setCodigo(cod);
		v.setProducto(product);
		v.setCantidad(cant);
		v.setPrecio(preci);
		
		double sub = v.operacion(cant, preci);
		double igv = v.operacion(sub);
		double total = v.operacion(sub, igv);
		
		System.out.println("------Datos de Venta------");
		System.out.println(v.obtenerDatos());
		System.out.println("----------Cálculos---------");
		System.out.println("Subtotal:   "+sub);
		System.out.println("IGV:   "+igv);
		System.out.println("Total:   "+total);
	
	}
}
