package Ejercicios;

import java.util.Scanner;

public class Ejercicio27 {

 public static int mcd(int a, int b) {
		int divisor;

		// Lo primero es seleccionar el menor de los dos
		
		if (a > b)
			divisor = b;
		else
			divisor = a;
		
		// Y ahora empiezo a probar si ese número es el mcd o lo son
		// los sucesivos inferiores a él
		
		while ((a % divisor != 0 || b % divisor != 0) && divisor > 1)
			divisor--;
		
		// Para salir del bucle while, se deben cumplir una de las dos condiciones:
		// - divisor es un mcd de ambos números
		// - divisor ha llegado a valer 1, con lo cual ése es el máximo común divisor
		
		
		return divisor;

	}

	public static void Metodo27() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Dime el primer valor");
		int valor1 = sc.nextInt();

		System.out.println("Dime el segundo valor");
		int valor2 = sc.nextInt();

		int resultado = mcd(valor1, valor2);

		System.out.println("El resultado del maximo comun divisor es: " + resultado);

		sc.close();
	}
}