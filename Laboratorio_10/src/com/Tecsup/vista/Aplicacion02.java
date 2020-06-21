package com.Tecsup.vista;
import java.sql.*;

public class Aplicacion02 {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String cadena = "jdbc:oracle:thin:@localhost:1521:xe";
		String usuario = "user01";
		String clave = "tecsup";
		Connection conn;
		Statement sen;
		ResultSet data;
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(cadena,usuario,clave);
			System.out.println("Conexion establecida correctamente");
			sen = conn.createStatement();
			System.out.println("");
			data = sen.executeQuery("select * from alumno2");
			while(data.next()) {
				System.out.println("---Registro---");
				System.out.println("Código:   "+data.getInt("codigo")+" ");
				System.out.println("Apellido:   "+data.getString("apellidos")+" ");
				System.out.println("Nombre:   "+data.getString("nombres")+" ");
				System.out.println("DNI:   "+data.getString("dni")+" ");	
				System.out.println("Dirección:   "+data.getString("direccion")+" ");
				System.out.println();
			}
			System.out.println("---Fin de Registros---");
		}catch(ClassNotFoundException e1) {
			System.out.println("Error en el driver");
		}catch(SQLException e2) {
			System.out.println("Error de la conexion");
		}	
	}
}
