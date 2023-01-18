package Ejercicios;

import java.util.Scanner;

public class Ejercicio39 {
	
	
	public static double enteros(int cantidad, int valormin, int valormax){
		
		double valorinc=0;
		for(int i=1; i<=cantidad; i++ ){
			
		 double valor = (double) (Math.random() * valormax+valormin);  
		 System.out.println(valor);
		 
			valorinc=valor;
	   
	          }
		
		return valorinc;
	        }

	
	public static void Metodo39() {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		
		int valormax=1; 
		
		
		int valormin=0; 
		
		System.out.println("Dime la cantidad de numeros ramdon");
		
		int cantidad=sc.nextInt(); 
		
		 enteros(cantidad,valormin,valormax);
		
		
		
			
		
		sc.close();
		
	}
	
	
}
