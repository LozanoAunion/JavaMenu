package Ejercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ejercicio41 {
	public static void Metodo41() {
	      
	      // Creamos la lista   
		
	      List	<String> lista = new ArrayList	<String>();

	      // Añadimos cosas a la lista
	      
	      lista.add("1");
	      lista.add("2");
	      lista.add("3");  
	      lista.add("4"); 
	      lista.add("5"); 

	      System.out.println("Lista inicial " +lista);
	     
	     
	      
	      Collections.shuffle(lista); // Se desordena la lista

	      System.out.println("Lista desordenada " +lista);
	   }    

}
