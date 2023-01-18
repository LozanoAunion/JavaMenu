package Ejercicios;

import java.util.Scanner;

public class Ejercicio11 {
	public static void Metodo11() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime los metros que quieres que pase a cm");
		double m = sc.nextDouble();
		int cent = (int) (m * 100);
		System.out.println("El total de centimetros son: " + cent + " centimetro");

		sc.close();

	}
}
