package Ejercicios;

import java.util.Scanner;

public class Ejercicio12 {

	public static void Metodo12() {
		var sc = new Scanner(System.in);

		int invertido = 0;
		int resto;

		System.out.println("Introduce un número: ");
		int numero = sc.nextInt();
		int numero2 = numero;

		while (numero > 0) {
			resto = numero % 10;
			invertido = invertido * 10 + resto;
			numero /= 10;

		}
		if (numero2 == invertido) {
			System.out.println("Tu numero es capicua");
		} else
			System.out.println("Tu numero NO es capicua");
		sc.close();

	}
}