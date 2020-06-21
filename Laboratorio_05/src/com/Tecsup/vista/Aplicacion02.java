package com.Tecsup.vista;
import java.util.Scanner;
import com.Tecsup.datos.lab05.Pedidos;

public class Aplicacion02 {

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
		
		Pedidos p = new Pedidos();
		p.setCodigo(cod);
		p.setProducto(product);
		p.setCantidad(cant);
		p.setPrecio(preci);
		double sub = p.operacion(cant, preci);
		double igv = p.operacion(sub);
		double total = p.operacion(sub, igv);
		
		System.out.println("------Datos de Venta------");
		System.out.println(p.obtenerDatos());
		System.out.println("----------Cálculos---------");
		System.out.println("Subtotal:   "+sub);
		System.out.println("IGV:   "+igv);
		System.out.println("Total:   "+total);
	}
}
