package Ejercicios;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Ejercicio53 {
	 public static void Metodo53() {
	    
			try (Scanner sc = new Scanner(System.in)) {
				@SuppressWarnings("unused")
				int seguir = 0;
				int opcion = 0;
				List<String> Contactos = new ArrayList<String>();

				while (opcion != 4) {
				    System.out.println("1. Añdir nuevos contactos a la lista");
				    System.out.println("2. Busca el telefono a partir del nombre");
				    System.out.println("3. Mostrar la informacion de los contactos ordenados alfabeticamente");
				    System.out.println("4. Salir de la agenda");
				    opcion = sc.nextInt();
				    System.out.println();

				    if (opcion == 4) {
				        break;
				    } else {

				        switch (opcion) {
				            case 1 -> {
				                System.out.println("Nombre: ");
				                String nombre = sc.next();

				                System.out.println("Numero: ");
				                int numero = sc.nextInt();
				                String tlf;
								tlf = (tlf = String.valueOf(numero));

				                Contactos.add(nombre);
				                Contactos.add(tlf);
				                System.out.println();

				            }

				            case 2 -> {
				                System.out.println("Nombre del contacto?");
				                String busca = sc.next();

				                int posicion = Contactos.indexOf(busca);
				                posicion++;

				                System.out.println("Telefono: ");
				                String contenido = Contactos.get(posicion);
				                System.out.println(contenido);
				                System.out.println();
				            }

				            case 3 -> {
				                List<String> soloName = new ArrayList<>(Contactos);

				                for (int i = 1; i < soloName.size(); i++) {
				                    soloName.remove(i);
				                }

				                Collections.sort(soloName);
				                System.out.println(soloName);
				                System.out.println();

				                
				            }

				        }
				    }
				}
			}
	    }

}