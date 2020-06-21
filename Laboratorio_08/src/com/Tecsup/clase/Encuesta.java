package com.Tecsup.clase;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Encuesta {
	
	private String usuario;
	private String sexo;
	private String email;
	private String buscador;
	
	Properties p = new Properties();
	public void almacenar() throws IOException {
		p.put("Ususario",usuario);
		p.put("sexo",sexo);
		p.put("Email",email);
		p.put("Buscador",buscador);
		FileOutputStream salida = new FileOutputStream(usuario+".txt");
		p.store(salida,"Encuensta realizada a "+usuario);
		salida.flush();
		salida.close();
	}
	
	public void imprimir() {
		for(Object valor:p.keySet()) {
			System.out.println(p.get(valor));
		}
	}
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBuscador() {
		return buscador;
	}
	public void setBuscador(String buscador) {
		this.buscador = buscador;
	}
}
