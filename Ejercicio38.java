package Ejercicios;

import java.util.Scanner;

public class Ejercicio38 {
	
public static int enteros(int cantidad, int valormin, int valormax){
	
	int valorinc=0;
	for(int i=1; i<=cantidad; i++ ){
		
	 int  valor = (int) (Math.random() * valormin+valormax);  
	 System.out.println(valor);
	 
		valorinc=valor;
   
          }
	
	return valorinc;
        }


public static void Metodo38() {
	
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Dime el valor maximo del numero ramdon");
	
	int valormax=sc.nextInt(); 
	
	System.out.println("Dime el valor min del numero ramdon");
	
	int valormin=sc.nextInt(); 
	
	System.out.println("Dime la cantidad de numeros ramdon");
	
	int cantidad=sc.nextInt(); 
	
	 enteros(cantidad,valormin,valormax);
	
	
	
		
	
	sc.close();
	
}


}

