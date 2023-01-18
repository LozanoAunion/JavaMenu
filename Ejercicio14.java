package Ejercicios;

import java.util.Scanner;

public class Ejercicio14 {
	public static void Metodo14() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Cantidad de comida comprada en KG");

		double diaria = sc.nextDouble();

		System.out.println("Cantidad de animales");

		double numanimales = sc.nextDouble();

		System.out.println("Cuanto necesita cada animal en KG");

		double gastoanimal = sc.nextDouble();

		double resultado1 = diaria / numanimales; // Comida que comen los animales
		// double resultado2= numanimales*gastoanimal; // Comida Necesaria

		if (resultado1 < gastoanimal) {

			System.out.println("El animal pasa hambre porque come menos de la media");

			System.out.println("El animal come:" + resultado1 + "KG" + " Y la comida necesaria es: " + gastoanimal);

		}

		else if (resultado1 > gastoanimal) {

			System.out.println("El animal esta mas gordo que el churumbel");

		}

		else {

			System.out.println("El animal bien de peso");

		}

		sc.close();
	}
}
