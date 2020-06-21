package com.Tecsup.datos.lab05;

public class Ventas {
	private String codigo, producto;
	private int cantidad;
	private double precio, subTotal, igv, total;
	
	public double operacion(int cantidad, double precio) {
		subTotal = cantidad * precio;
		return subTotal;
	}
	
	public double operacion(double subTotal) {
		igv = subTotal*0.18;
		return igv;
	}
	
	public double operacion(double subTotal, double igv) {
		total = subTotal + igv;
		return total;
	}

	public String obtenerDatos() {
		return "Código:   " + getCodigo() + "\n" +
				"Producto:   " + getProducto() + "\n" +
				"Cantidad:   " + getCantidad() + "\n" +
				"Precio:   " + getPrecio() + "\n";
	}
	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getSubTotal() {
		return subTotal;
	}
	public double getIgv() {
		return igv;
	}
	
	public double getTotal() {
		return total;
	}
}
