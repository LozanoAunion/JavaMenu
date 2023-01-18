package Ejercicios;

import java.util.Scanner;

public class Ejercicio56 {
	public static void Metodo56() {
		
		
		   Scanner sc = new Scanner(System.in); 
	          int  x=0;

	          System.out.println("Introduce la frase");

	          String frase=sc.nextLine();


	          System.out.println("Introduce el caracter a añadir");

	          String caracter=sc.nextLine();

	        System.out.println("Introduce de cuanto quieres que sea la secuencia");

	        int secuencia = sc.nextInt();

	     
	            String nuevacadena= "";
	       

	            while(x<(frase.length()-secuencia)){
	             nuevacadena= nuevacadena + frase.substring(x, x + secuencia) + caracter;
	             
	                x=x+secuencia;
	               
	                if(frase.length()< secuencia){

	                    System.out.println(nuevacadena);

	                }
	                
	            }


	            System.out.println("El resultado es: " + nuevacadena);


	        sc.close();
		
	}

}
