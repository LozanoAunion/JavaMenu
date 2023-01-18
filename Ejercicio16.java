package Ejercicios;

import java.util.Scanner;

public class Ejercicio16 {
	public static void Metodo16() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Dime la altura del triangulo: ");
		double altura = sc.nextDouble();

		System.out.println("Dime la base del triangulo: ");
		double base = sc.nextDouble();

		while (altura < 0) {
			System.out.println("Valores en altura negativos introducelo de nuevo");
			altura = sc.nextDouble();
		}

		while (base < 0) {
			System.out.println("Valores en base negativos introducelo de nuevo");
			base = sc.nextDouble();
		}

		double resultado = (altura * base) / 2;

		System.out.println("El area del triangulo es la siguiente: " + resultado);

		sc.close();
	}
}
