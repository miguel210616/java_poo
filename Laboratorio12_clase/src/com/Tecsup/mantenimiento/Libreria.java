package com.Tecsup.mantenimiento;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.Tecsup.clases.DAO;

public class Libreria implements DAO{
	public Connection conn;
	public PreparedStatement sen;
	public ResultSet data;
	public String driver = "com.mysql.jdbc.Driver";
	public String cadena = "jdbc:mysql://localhost/semana12";
	public String usuario = "root";
	public String clave = "";
	
	@Override
	public Connection conexion() {
		try {
			Class.forName(driver);
			conn= DriverManager.getConnection(cadena,usuario,clave);
		}catch(ClassNotFoundException e1) {
			System.out.println("Error en el driver");
		}catch(SQLException e2) {
			System.out.println("Error en la conexión");
		}
		return conn;
	}

	@Override
	public boolean insertar(int art_codigo, String art_nombre, int art_stock, double art_precio) {
		try {
			String sql = "insert into articulos values(?,?,?,?)";
			sen=conexion().prepareStatement(sql);
			sen.setInt(1,art_codigo);
			sen.setString(2, art_nombre);
			sen.setInt(3, art_stock);
			sen.setDouble(4, art_precio);
			sen.executeUpdate();
		}catch(SQLException e3){
			System.out.println("Error en el proceso de registro");
		}
		return true;
	}

	@Override
	public ResultSet consulta(String codigosql) {
		try {
			String sql = codigosql;
			sen=conexion().prepareStatement(sql);
			data = sen.executeQuery();
		}catch(SQLException e4) {
			System.out.println("Error en proceso de consulta");
		}
		return data;
	}

}
