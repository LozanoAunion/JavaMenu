package Ejercicios;

import java.util.Scanner;

public class Ejercicio32 {

	static double distance(double x1, double y1, double x2, double y2) {

		double cuadrado = Math.pow(x1, 2);
		double cuadrado2 = Math.pow(x2, 2);
		double cuadrado3 = Math.pow(y1, 2);
		double cuadrado4 = Math.pow(y2, 2);

		double result = Math.sqrt((cuadrado - cuadrado2) + (cuadrado3 - cuadrado4));

		return result;
	}

	public static void Metodo32() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Dime el primer valor");
		double valor1 = sc.nextDouble();

		System.out.println("Dime el segundo valor");
		double valor2 = sc.nextDouble();

		System.out.println("Dime el tercer valor");
		double valor3 = sc.nextDouble();

		System.out.println("Dime el cuarto valor");
		double valor4 = sc.nextDouble();

		System.out.println("La distancia es: ");
		double distancia2 = distance(valor1, valor2, valor3, valor4);

		System.out.println(distancia2);

		sc.close();
	}
}
