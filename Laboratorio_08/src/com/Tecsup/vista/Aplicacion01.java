package com.Tecsup.vista;

import java.util.*;

public class Aplicacion01 {

	public static void main(String[] args) {
		
		Map<String,Double> catalogo = new HashMap<String,Double>();
        catalogo.put("TV",2541.12);
        catalogo.put("Tablet",120.1);
        catalogo.put("PC",70541.2);
        catalogo.put("IPHONE",5000.7);
        catalogo.put("EARPOD",241.3);
        
        System.out.println("----Modo 1----");
        for(String valor:catalogo.keySet()){
        	System.out.println(catalogo.get(valor));
        }

        System.out.println("");
        System.out.println("----Modo 2----");
        Iterator it = catalogo.entrySet().iterator();
        while(it.hasNext()) {
        	Map.Entry p = (Map.Entry)it.next();
        	System.out.println(p.getKey()+" "+p.getValue());
        }
        
	}

}
