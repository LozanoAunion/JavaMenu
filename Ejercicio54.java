package Ejercicios;


import java.util.Scanner;

public class Ejercicio54 {

	
	  public static void Metodo54()  {	        Scanner sc = new Scanner (System.in);

	        System.out.println("Que quieres poner en la etiqueta h1");
	        String h1 = sc.nextLine();

	        System.out.println("Que quieres poner en la etiqueta p");
	        String p = sc.nextLine();



	        String arriba = "<!DOCTYPE html> \n"+
	        									"<html> \n" +
	        												"<head> \n" +
	        															"\t <title> Ejercicio 54 Java </title>\n" +
	        												"</head> \n" +
	        														
	        												
	        									"<body>";

	        String abajo = " 												\t <h1> " + h1 + " </h1>  \n " +
	        															" \t <p> " + p + " </p> \n" +
	        									"</body> \n" +
	        									"</html>";
	        
	        System.out.println(arriba);
	        System.out.println(abajo);




sc.close();

	    }

	
    }       

