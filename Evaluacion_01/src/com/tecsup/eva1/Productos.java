package com.tecsup.eva1;

public class Productos {
	
	private String codigo;
	private String descripcion;
	private int cantidad;
	private double precioUnitario;
	
	public Productos(String codigo, String descripcion, int cantidad, double precioUnitario) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.cantidad = cantidad;
		this.precioUnitario = precioUnitario;
	}

	public double precioTotal() {
		return cantidad*precioUnitario;
	}
	
	public double igvTotal() {
		return cantidad*precioUnitario*0.18;
	}
	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
		
}
