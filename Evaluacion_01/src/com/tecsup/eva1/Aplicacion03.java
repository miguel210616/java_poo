package com.tecsup.eva1;
import java.util.Scanner;

public class Aplicacion03 {

	public static void main(String[] args) {
		
		String cod;
		String desc;
		int cant;
		double precioUnit;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Ingrese el c�digo: ");
		cod = s.next();
		System.out.println("Ingrese la descripci�n: ");
		desc = s.next();
		System.out.println("Ingrese la cantidad: ");
		cant = s.nextInt();
		System.out.println("Ingrese el precio unitario: ");
		precioUnit = s.nextDouble();
		
		Productos p = new Productos(cod,desc,cant,precioUnit);
		
		System.out.println(" ");
		System.out.println("------Datos del producto------");
		System.out.println("C�digo:   "+p.getCodigo());
		System.out.println("Descripci�n:   "+p.getDescripcion());
		System.out.println("Cantidad:   "+p.getCantidad());
		System.out.println("Preci Unitario:   "+p.getPrecioUnitario());
		System.out.println("------------Costos------------");
		System.out.println("Precio total:   "+p.precioTotal());
		System.out.println("IGV:   "+p.igvTotal());
		System.out.println("Importe total:   "+(p.precioTotal()+p.igvTotal()));
	}
}
