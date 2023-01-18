package Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio59 {
	public static void Metodo59() {
		
	
	Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime una frase");
		
				String frase = sc.nextLine();

							String[] fraseSplit = frase.split(" ");
        
											Arrays.sort(fraseSplit);
        
	for (String palabra : fraseSplit){ 
			
			
								System.out.print (palabra + " ");
								
								
		}
     
		sc.close();
	}
	
	
	}

