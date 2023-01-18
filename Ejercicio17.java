package Ejercicios;

import java.util.Scanner;

public class Ejercicio17 {
	public static void Metodo17() {

		System.out.println("Dime el valor que quieres saber el valor absoluto");

		Scanner sc = new Scanner(System.in);

		int valor = sc.nextInt();

		if (valor < 0) {

			int resultado = valor * -1;

			System.out.println("Este es el valor absoluto: " + resultado);

		}

		else {

			System.out.println("Este es el valor absoluto: " + valor);

		}

		sc.close();

	}

}
