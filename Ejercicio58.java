package Ejercicios;

import java.util.Scanner;

public class Ejercicio58 {
	public static void Metodo58() {
		
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("dime una frase: ");
		String frase = sc.nextLine();
		
		System.out.println("dime la palabra que quieres remplazar: ");
		String palabra1 = sc.nextLine();
		
		System.out.println("dime la palabra que quieres remplazar: ");
		String palabra2 = sc.nextLine();
		
		System.out.println(frase.replace(palabra1, palabra2));
		
		sc.close();
		
	}

}
