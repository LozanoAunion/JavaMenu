package Ejercicios;
import java.util.Scanner;
public class Ejercicio57 {
	public static void Metodo57() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime una frase con nomenclatura Camel: ");
		
		String frase=sc.nextLine();
		
		System.out.println("Frase sin la nomenclatura Camel: " +frase.toLowerCase());
		
		sc.close();
	}

}
