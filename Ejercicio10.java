package Ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void Metodo10() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Dime un número");
		int num1 = sc.nextInt();

		System.out.println("Dime otro número");
		int num2 = sc.nextInt();

		boolean result = num1 == num2;
		System.out.println("Los números son iguales : " + result);

		sc.close();

	}
}
