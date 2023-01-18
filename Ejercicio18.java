package Ejercicios;

import java.util.Scanner;

public class Ejercicio18 {
	public static void Metodo18() {

		Scanner sc = new Scanner(System.in);

		int numero1 = (int) (Math.random() * 99 + 1);
		System.out.println("El primer valor es: " + numero1);

		int numero2 = (int) (Math.random() * 99 + 1);
		System.out.println("El segundo valor es: " + numero2);

		int operacion = numero1 + numero2;

		int contestacion = sc.nextInt();

		if (contestacion == operacion) {

			System.out.println("El resultado es correcto!!");
		} else {

			System.out.println("El resultado no es correcto!!");

		}

		sc.close();

	}
}
