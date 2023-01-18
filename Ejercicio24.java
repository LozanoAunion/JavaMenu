package Ejercicios;

import java.util.Scanner;

public class Ejercicio24 {

	public static void Metodo24() {
		int inicio, fin, contador = 0;
		Scanner sc = new Scanner(System.in);

		inicio = 1;
		System.out.println("Escribe el fin de la cadena:");
		fin = sc.nextInt();
		for (int i = inicio; i <= fin; i++) {
			if (esPrimo(i)) {
				contador++;
				System.out.print(String.valueOf(i) + ",");
			}
		}
		System.out.printf("\nTotal: %d", contador);
		sc.close();
	}

	public static boolean esPrimo(int numero) {
		// El 0, 1 y 4 no son primos
		if (numero == 0 || numero == 1 || numero == 4) {
			return false;
		}
		for (int x = 2; x < numero / 2; x++) {
			// Si es divisible por cualquiera de estos números, no
			// es primo
			if (numero % x == 0)
				return false;
		}
		// Si no se pudo dividir por ninguno de los de arriba, sí es primo
		return true;
	}
}
