package com.Tecsup.datos;

import java.sql.*;

public class Libreria {
	public Connection conn;
	public PreparedStatement sen;
	public ResultSet data;
	public String driver = "com.mysql.jdbc.Driver";
	public String cadena = "jdbc:mysql://localhost/tecsup";
	public String user ="root";
	public String password = "";
	
	public Connection conexionDB() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(cadena, user, password);
			System.out.println("Buena conexi�n");
		}catch(ClassNotFoundException e1) {
			System.out.println("Driver error");
		}catch(SQLException e2) {
			System.out.println("Conection error");
		}
		return conn;
	}

	public boolean registrar(int codigo, String apellido, String nombres, int dni, String direccion) {
		try {
			String querySQL = "insert into alumno values(?,?,?,?)";
			sen = conexionDB().prepareStatement(querySQL);
			sen.setInt(1, codigo);
			sen.setString(2, apellido);
			sen.setString(3, nombres);
			sen.setInt(4, dni);
			sen.setString(5, direccion);
			sen.executeUpdate();
		}catch(SQLException e3) {
			System.out.println("Error en el proceso de registro");
		}
		return true;
	}
	
	public ResultSet consulta(String sql) {
		try {
			sen = conexionDB().prepareStatement(sql);
			data = sen.executeQuery();
		}catch(SQLException e4) {
			System.out.println("Error en proceso de consulta");
		}
		return data;
	}
	
	public ResultSet buscar(int dni) {
		try {
			String querySQL = "select * from alumno where dni = "+dni;
			sen = conexionDB().prepareStatement(querySQL);
			data = sen.executeQuery();
		}catch(SQLException e5) {
			System.out.println("Error al buscar DNI");
		}
		return data;	
	}
	
	public void cerraDB() {
		try {
			conn.close();
		}catch(SQLException e6) {
			System.out.println("Error al cerrar la conexi�n");
		}
	}
}
















