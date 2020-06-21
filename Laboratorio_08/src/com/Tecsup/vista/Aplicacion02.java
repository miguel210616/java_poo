package com.Tecsup.vista;
import java.io.IOException;
import java.util.Scanner;
import com.Tecsup.clase.Encuesta;

public class Aplicacion02 {

	public static void main(String[] args) throws IOException {
		
		String usu;	
		String sex;
		String ema;
		String busc;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese usuario:");
		usu = s.next();
		System.out.println("Ingrese su sexo [M/F]");
		sex = s.next();
		System.out.println("Ingrese email");
		ema = s.next();
		System.out.println("Ingrese buscador");
		busc = s.next();
		
		Encuesta en = new Encuesta();
		en.setUsuario(usu);
		en.setSexo(sex);
		en.setEmail(ema);
		en.setBuscador(busc);
		
		System.out.println("");
		System.out.println("----Datos de encuestad@----");
		en.almacenar();
		en.imprimir();
	}
}
