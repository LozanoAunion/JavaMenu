package Ejercicios;

import java.util.Scanner;

public class Ejercicio35 {

	static int minDiferencia(int hora1, int minuto1, int hora2, int minuto2) {

		int mintotal1 = hora1 * 60 + minuto1;
		int mintotal2 = hora2 * 60 + minuto2;

		int result = mintotal1 - mintotal2;
		
		if (result<0)
			
			result = result * -1;

		return result;

	}

	public static void Metodo35() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Dime el valor de la primera hora");

		int hora1 = sc.nextInt();

		System.out.println("Dime el valor del primer min");

		int min1 = sc.nextInt();

		System.out.println("Dime el valor de la segunda hora");

		int hora2 = sc.nextInt();

		System.out.println("Dime el valor del segundo min");

		int min2 = sc.nextInt();

		int total = minDiferencia(hora1, min1, hora2, min2);

		System.out.println("La diferencia de minutos son: " + total + " minutos");

		sc.close();

	}

}
