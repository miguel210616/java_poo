package com.Tecsup.vista;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.Tecsup.datos.Libreria;

class Consultar {

	public static void main(String[] args) {
		Libreria lib = new Libreria();
		
		ResultSet datos=lib.consulta("select * from prodcutos");
		try {
			while(datos.next()) {
				System.out.println(datos.getString(1)+"");
				System.out.println(datos.getString(2)+"");
				System.out.println(datos.getString(3)+"");
				System.out.println(datos.getString(4)+"");
				System.out.println("");
			}
		}catch(SQLException e5){
			JOptionPane.showMessageDialog(null, "Error en la consulta");
		}
	}

}
