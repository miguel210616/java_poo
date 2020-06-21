	package laboratorio_06;
import java.util.ArrayList;
import java.util.Iterator;

public class Aplicacion01 {
	
	public static void main(String[] args) {
		ArrayList lista = new ArrayList();
		
		lista.add("Virus");
		lista.add("Covid");
		lista.add(19);
		
		System.out.println("---Modelo de for Nro. 1---");
		for(int i=0;i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		System.out.println(" ");
		System.out.println("---Modelo de for Nro. 2---");
		for(
				Iterator element= lista.iterator();
				element.hasNext();) {
			Object vi = element.next();
			System.out.println(vi);
		}
		
		System.out.println(" ");
		System.out.println("---Modelo de for Nro. 3---");
		for(Object obj : lista) {
			System.out.println(obj);
		}	
	}
}
