package com.Tecsup.vista;
import javax.swing.JOptionPane;

import com.Tecsup.datos.Libreria;

public class Registrar {

	public static void main(String[] args) {
		Libreria lib = new Libreria();
		String temp,nom;
		int cod,can;
		double pre;
		
		temp=JOptionPane.showInputDialog("Ingrese código:");
		cod = Integer.parseInt(temp);
		nom=JOptionPane.showInputDialog("Ingrese nombre:");
		temp=JOptionPane.showInputDialog("Ingrese cantidad:");
		can = Integer.parseInt(temp);
		temp = JOptionPane.showInputDialog("Ingrese precio:");
		pre=Double.parseDouble(temp);
		boolean x=lib.registro(cod, nom, can, pre);
		if(x==true) {
			JOptionPane.showConfirmDialog(null, "Producto registrado correctamente");
		}else {
			JOptionPane.showConfirmDialog(null, "Error al insertar producto");
		}

	}

}
