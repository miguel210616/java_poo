package laboratorio_06;
import java.util.ArrayList;
import java.util.Scanner;

public class Aplicacion02 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<String> alumnos = new ArrayList<String>();
		
		System.out.println("¿Cuántos nombres desea ingresar?:");
		int a = s.nextInt();
		
		for(int i=0;i<a;i++) {
			System.out.println("Ingrese el nombre "+(i+1)+":");
			String nom = s.next();
			alumnos.add(nom);
		}
		
		System.out.println(" ");
		System.out.println("---Lista de alumnos---");
		for(String m : alumnos) {
			System.out.println(m);
		}
		
		System.out.println(" ");
		System.out.println("¿Qué número de alumno desea modificar?:");
		int b = s.nextInt();
		System.out.println("¿Cuál será el nuevo nombre?");
		String c = s.next();
		alumnos.set(b-1, c);
		
		System.out.println(" ");
		System.out.println("---Lista de alumnos(2)---");
		for(String m : alumnos) {
			System.out.println(m);
		}
		
		System.out.println(" ");
		System.out.println("¿Qué número de alumno desea eliminar?:");
		int d = s.nextInt();
		alumnos.remove(d-1);
		
		System.out.println(" ");
		System.out.println("---Lista de alumnos Final---");
		for(String m : alumnos) {
			System.out.println(m);
		}		
	}
}
