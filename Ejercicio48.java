package Ejercicios;
import java.util.Scanner;
public class Ejercicio48 {
	
	
	    public static void Metodo48() {
	        System.out.println("Dime el dorsal de los corredores que pasan por la meta");
	           Scanner sc = new Scanner (System.in);
	        int dorsal = sc.nextInt();

	        while (dorsal !=-1 ) {
	            System.out.println("Dime el dorsal de los demás corredores");
	             dorsal = sc.nextInt();
	        }
	        if (dorsal == -1) {
	             System.out.println("La carrera ha terminado");
	         }

	        sc.close();
	        }

	}
