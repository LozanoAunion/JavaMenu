package Ejercicios;



import java.util.Scanner;
public class Ejercicio55 {
	
	
	
	
	public static void Metodo55() {
	 Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el texto a codificar: ");
		String string = sc.nextLine();
	
		
		String r1 = string.replace("a", "@");
		
		String r2 = r1.replace("e", "€");
		
		String r3 = r2.replace("i", "1");
		
		String r4 = r3.replace("o", "0");
		
		String r5 = r4.replace("u", "?");
		
		System.out.println("Texto despues de ser codificado: " +r5);
		
		System.out.println("Texto sin codificar: " +string);
		
		
		sc.close();
	}

}
