package com.Tecsup.datos;
import java.sql.*;

public class Libreria {
	
	public Connection conn;
	public PreparedStatement sen;
	public ResultSet data;
	public Statement datarequest;
	public String driver = "com.mysql.jdbc.Driver";
	public String cadena = "jdbc:mysql://localhost/empresa";
	public String user = "root";
	public String password = "";
	
	public Connection conexionDB() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(cadena,user,password);
			System.out.println("Buena conexi�n");
		}catch(ClassNotFoundException e1) {
			System.out.println("Error en el driver");
		}catch(SQLException e2) {
			System.out.println("Error en la conexi�n");
		}
		return conn;
	}

	public boolean Insertar(int codigo, String apellidos, String nombres,
							String ruc, double lineaCredito) {
		try {
			String querySQL = "insert into clientes values(?,?,?,?,?)";
			sen = conexionDB().prepareStatement(querySQL);
			sen.setInt(1, codigo);
			sen.setString(2, apellidos);
			sen.setString(3, nombres);
			sen.setString(4, ruc);
			sen.setDouble(5, lineaCredito);
			sen.executeUpdate();
			System.out.println("Se registro correctamente");
		}catch(SQLException e3) {
			System.out.println("Error al insertar");
		}
		return true;
	}
	
	public ResultSet consulta(String sql) {
		try {
			String querySQL = sql;
			sen = conexionDB().prepareStatement(querySQL);
			data = sen.executeQuery();
		}catch(SQLException e5) {
			System.out.println("Error en la consulta");
		}
		return data;
	}
	
	public ResultSet buscar(String codigo) {
		try {
			String querySQL = "select * from clientes where codigo = "+codigo;
			datarequest = conexionDB().createStatement();
			data = datarequest.executeQuery(querySQL);
		}catch(SQLException e4) {
			System.out.println("Error al buscar el codigo");
		}
		return data;
	}
	
	public void cerrarDB() {
		try {
			conn = conexionDB();
			conn.close();
		}catch(SQLException e5) {
			System.out.println("Error al cerrar la base de datos");
		}
	}
}
