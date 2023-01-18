package Ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void Metodo2() {

		int entero;
		int suma;

		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe un numero entero: ");
		entero = sc.nextInt();

		int resto = entero % 7;
		suma = 7 - resto;

		System.out.println("Para que sea multiplo de 7 hay  que sumarle: " + suma);
		sc.close();

	}
}
