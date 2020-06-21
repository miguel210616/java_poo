package com.Tecsup.vista;
import java.sql.*;
public class Aplicacion01 {

	public static void main(String[] args) {
		String driver = "com.mysql.jdbc.Driver";
		String cadena = "jdbc:mysql://localhost/tecsup";
		String usuario = "root";
		String clave = "";
		Connection conn; //obtener cone
		Statement sen;  //ejecuta una sentencia sql
		ResultSet data;  //Almacena la data consultada
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(cadena,usuario,clave);
			System.out.println("Conexion establecida correctamente");
			System.out.println("");
			sen = conn.createStatement();
			data = sen.executeQuery("select * from alumno");
			while(data.next()) {
				System.out.println("---Registro---");
				System.out.println("Código:   "+data.getInt("codigo")+" ");
				System.out.println("Apellido:   "+data.getString("apellidos")+" ");
				System.out.println("Nombre:   "+data.getString("Nombres")+" ");
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
