package Ejercicios;

import java.util.Scanner;

public class Ejercicio28 {

	public static void Metodo28() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Dime el primer valor");
		int valor1 = sc.nextInt();

		System.out.println("Dime el segundo valor");
		int valor2 = sc.nextInt();

		int resultado = valor1 * valor2;
		int resultado2 = Ejercicio27.mcd(valor1, valor2);
		int resultado3 = resultado / resultado2;

		System.out.println("El MCM es: " + resultado3);

		sc.close();
	}
}
