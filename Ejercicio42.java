package Ejercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ejercicio42 {
	public static void Metodo42() {
	      
	      // Creamos la lista     
	      List<String> lista = new ArrayList<String>();

	      // Añadimos cosas a la lista
	      
	      lista.add("1");
	      lista.add("2");
	      lista.add("3");  
	      lista.add("4"); 
	      lista.add("5"); 

	      System.out.println("Lista inicial " +lista);
	     
	      ArrayList<String> lista2 = new ArrayList<String>(lista);
	      // SE HACE UNA COPIA DE LA LISTA
	      
	      Collections.shuffle(lista2); // Se desordena la lista

	      System.out.println("Lista desordenada " +lista2);
	   }    

}
