package Ejercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio43 {
	
	
	 public static void Metodo43 () {
			int salario=0;
			
			ArrayList<Integer> sueldos=new ArrayList<Integer>();
			Scanner sc = new Scanner (System.in);
			while (salario !=-1 ) {
	    	System.out.println("Dime los salarios");
	      
			 salario = sc.nextInt();
	    	
			 
	        
	      	sueldos.add(salario);
				

			
	        }
			
			System.out.println("No hay más salarios");
			System.out.println("Los sueldos ordenados son: ");
				 
				
				 

	             Collections.sort(sueldos, Collections.reverseOrder());
				 for (Integer i : sueldos) {
					
					if(i!=-1){
						System.out.print(i+",");
					}
				  }
				 
				  int suma=0;
				  for (int i = 0; i < sueldos.size(); i++) {
					suma+=sueldos.get(i);
					
				  }
				  System.out.println(" El sueldo medio es de :" + suma/sueldos.size() + "€");
			 sc.close();
			}
			
	}


