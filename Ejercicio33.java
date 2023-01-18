package Ejercicios;

import java.util.Scanner;

public class Ejercicio33 {

	public static int mostrarPares(int n) {

		for (int i = 0; i <= n; i++) {

			if (i % 2 == 0) {

				//System.out.println(i);
			}
		}

		return n;
	}

	public static void Metodo33() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Dime el ultimo valor");
		int valor1 = sc.nextInt();

		int resultado = mostrarPares(valor1);
		System.out.println(resultado);

		sc.close();

	}

}
