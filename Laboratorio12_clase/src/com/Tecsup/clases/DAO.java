package com.Tecsup.clases;
import java.sql.*;

public interface DAO {
	public Connection conexion();
	public boolean insertar(int art_codigo,String art_nombre, 
							int art_stock,double art_precio);
	public ResultSet consulta(String codigosql);	

}
