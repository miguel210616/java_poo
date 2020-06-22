package com.Tecsup.DAO;
import java.sql.*;

public interface Conexion {
	
	public Connection conexionDB();
	public boolean insertar(int codigo, String nombre, 
							int cantidad, double precio);
	public ResultSet consulta(String querySql);
	public ResultSet buscar(String nombre);
	public ResultSet buscar(double precio);

}
