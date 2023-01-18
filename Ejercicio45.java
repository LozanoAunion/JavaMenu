package Ejercicios;

import java.util.Scanner;

public class Ejercicio45 {



	public static void main(String [] args) {
		
		
		//Declaramos matriz sus valores seran True o False
		
		boolean [][] mapas = new boolean [4][4];
		
		//Indicamos 1 a 1 el valor que tendra ese campo
	
		mapas [0][0] = false; // Desde Posicion 0 no podremos ir a 0
		mapas [0][1] = true;
		mapas [0][2] = true;  // Desde posicion 0 podremos ir a 2
		mapas [0][3] = false;
		
		mapas [1][0] = true;
		mapas [1][1] = false;
		mapas [1][2] = true;
		mapas [1][3] = false;
		
		mapas [2][0] = true;
		mapas [2][1] = true;
		mapas [2][2] = false;
		mapas [2][3] = true;
		
		mapas [3][0] = false;
		mapas [3][1] = false;
		mapas [3][2] = true;
		mapas [3][3] = false;
		
		
		Scanner sc= new Scanner (System. in);
		
		 	System.out.println("Lugar actual?");
		 		int actual = sc.nextInt();
		
		 	System.out.println("La meta es?");
		 		int meta = sc.nextInt();
		 		
		System.out.println();

			int camino = 0;
			
		
		
	
	}
	
}
