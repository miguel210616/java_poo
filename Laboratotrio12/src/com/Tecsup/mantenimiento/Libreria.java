package com.Tecsup.mantenimiento;
import java.sql.*;
import com.Tecsup.DAO.Conexion;

public class Libreria implements Conexion{
	
	public Connection conn;
	public PreparedStatement sen;
	public Statement datarequest;
	public ResultSet data;
	public String driver = "com.mysql.jdbc.Driver";
	public String cadena = "jdbc:mysql://localhost/ventas2020";
	public String user = "root";
	public String password = "";
	
	@Override
	public Connection conexionDB() {
		try {
		Class.forName(driver);
		conn = DriverManager.getConnection(cadena,user,password);
		System.out.println("Buena conexión");
		}catch(ClassNotFoundException e1){
			System.out.println("Driver error");
		}catch(SQLException e2) {
			System.out.println("Connection error");
		}
		return conn;
	}

	@Override
	public boolean insertar(int codigo, String nombre, int cantidad, double precio) {		
		try {
			String querySql = "insert into productos values(?,?,?,?)";
			sen = conexionDB().prepareStatement(querySql);
			sen.setInt(1,codigo);
			sen.setString(2, nombre);
			sen.setInt(3, cantidad);
			sen.setDouble(4,precio);
			sen.executeUpdate();
			System.out.println("Successful insert");
		}catch(SQLException e3) {
			System.out.println("Insert error");
		}
		return true;
	}

	@Override
	public ResultSet consulta(String querySql) {
		try {
			sen=conexionDB().prepareStatement(querySql);
			data = sen.executeQuery();
		}catch(SQLException e4) {
			System.out.println("Consult error");
		}
		return data;
	}

	@Override
	public ResultSet buscar(String nombre) {
		try {
			String querySQL = "select * from productos where descripcion = '"+nombre+"'";
			datarequest = conexionDB().createStatement();
			data = datarequest.executeQuery(querySQL);
		}catch(SQLException e5) {
			System.out.println("Error searching name");
		}
		return data;
	}

	@Override
	public ResultSet buscar(double precio) {
		try {
			String querySQL = "select * from productos where precio = "+precio;
			datarequest = conexionDB().createStatement();
			data = datarequest.executeQuery(querySQL);
		}catch(SQLException e5) {
			System.out.println("Error searching price");
		}
		return data;
	}

}
