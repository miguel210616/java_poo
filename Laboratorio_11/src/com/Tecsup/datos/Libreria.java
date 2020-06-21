package com.Tecsup.datos;
import java.sql.*;
import javax.swing.JOptionPane;

public class Libreria {
	public Connection conn;
	public Statement sen;
	public ResultSet data;
	public PreparedStatement sen2;
	public String driver = 	"com.mysql.jdbc.Driver";
	public String cadena = 	"jdbc:mysql://localhost/semana11";
	public String user = "root";
	public String password = "";
	
	public Connection conexionDB() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(cadena,user,password);
			JOptionPane.showMessageDialog(null,"Buena Conexión");
		}catch(ClassNotFoundException e1){
			JOptionPane.showMessageDialog(null, "Error en el driver");			
		}catch(SQLException e2){
			JOptionPane.showMessageDialog(null,"Error en la conexión");
		}
		return conn;
	}
	
	public boolean registro(int codigo, String nombre, int cantidad, double precio) {
		try {
			String codigoSQL="insert into prodcutos values(?,?,?,?)";
			sen2=conexionDB().prepareStatement(codigoSQL);
			//sen2 = conn.prepareStatement(codigoSQL);
			sen2.setInt(1, codigo);
			sen2.setString(2, nombre);
			sen2.setInt(3, cantidad);
			sen2.setDouble(4, precio);
			sen2.executeUpdate();
		}catch(SQLException e3) {
			JOptionPane.showMessageDialog(null, "Error en el proceso de registro");
		}
		return true;
	}
	
	public ResultSet consulta(String sql) {
		try {
			String codigosql=sql;
			sen2=conexionDB().prepareStatement(codigosql);
			data = sen2.executeQuery();
		}catch(SQLException e4) {
			JOptionPane.showMessageDialog(null, "Error en el proceso de consulta");
		}
		return data;
	}
	
	public void cerrarBD() {
		try {
			conn.close();
		}catch(SQLException e3) {
			JOptionPane.showMessageDialog(null,"Error al cerrar la conexión");
		}
	}
}
