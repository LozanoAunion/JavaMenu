package Ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
	public static void Metodo3() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe un numero entero: ");
		int numero = sc.nextInt();

		System.out.println("Escribe un multiplo: ");
		int multiplo = sc.nextInt();

		int resto = numero % multiplo;
		int suma = multiplo - resto;

		System.out.println("para que sea multiplo de" + multiplo + " hay  que sumar: " + suma);

		sc.close();
	}
}
