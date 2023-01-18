package Ejercicios;

import java.util.Scanner;


public class Ejercicio44 {

	static int a = (int) (1 + (Math.random() * 10));
	static int b = (int) (1 + (Math.random() * 10));  
	static int c = (int) (1 + (Math.random() * 10));  
	static int d = (int) (1 + (Math.random() * 10));  
	
	
	public static void Metodo44() {
		
		
		Alumno arrayalumno[]= {	
				
				new Alumno(1, "Antonio", a, b, c, 0, 0),
				new Alumno(2, "Eustaquio", b, a, c, 0, 0),
				new Alumno(3, "Pepe", d, a, b, 0, 0),
				new Alumno(4, "Natalia", b, a, c, 0, 0), 
				new Alumno(5, "Marc", c, a, d, 0, 0) 
								
								};
		
			
			//for (int i=0; i < arrayalumno.length; i++ ) { // i = 1
			
			//System.out.println(arrayalumno[i]);
			
			
			//}
		
			
	

		
		  Scanner sc= new Scanner(System.in);
		  
		  System.out.println("Dime el ID de uno de los alumnos: ");
		  int num =sc.nextInt();
		  
		
		  
		  switch(num) {
		  
		  
		  case 1: 
			  
			  System.out.println(arrayalumno[0]);
			  break;
		  
		  
		 case 2: 
		  
			 System.out.println(arrayalumno[1]);
			 break;
	  
		 case 3:
			 
			  System.out.println(arrayalumno[2]);
			  break;
		  
		 case 4:
			 
			  System.out.println(arrayalumno[3]);
			  break;
		  
		  
		 case 5:
			 
			  System.out.println(arrayalumno[4]);
			  break;
			  
		 case 6: 
			 System.out.println(arrayalumno[0]);
			 System.out.println(arrayalumno[1]);
			 System.out.println(arrayalumno[2]);
			 System.out.println(arrayalumno[3]);
			 System.out.println(arrayalumno[4]);
			  break;
		  
		  
		  }
	
	sc.close();
	  
}
		  
		  
		  

		  
		
		  	
	
	
	    }















	


