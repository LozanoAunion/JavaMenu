package Ejercicios;

import java.util.Scanner;

public class Ejercicio30 {
	public static void Metodo30() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Cuanto dinero tienes en el banco?");

		float dinerobanco = sc.nextFloat();

		if (dinerobanco == 0) {

			System.out.println("Pues no calculo nada");
			System.exit(0);
		}

		System.out.println("Cuanto dinero tienes en el cajon de tu casa?");

		float dinerocajon = sc.nextFloat();

		if (dinerocajon == 0) {

			System.out.println("Tu saldo es: " + dinerobanco + " €");
			System.exit(0);

		}

		System.out.println("Cuanto dinero tienes en la hucha?");

		float dinerohucha = sc.nextFloat();

		if (dinerohucha == 0) {

			float dinero1 = dinerobanco + dinerocajon;

			System.out.println("Tu saldo es: " + dinero1 + " €");
			System.exit(0);

		}

		System.out.println("Cuanto dinero tienes en el bolsillo?");

		float dinerobolsillo = sc.nextFloat();

		if (dinerobolsillo == 0) {

			float dinero2 = dinerobanco + dinerocajon + dinerohucha;

			System.out.println("Tu saldo es: " + dinero2 + " €");
			System.exit(0);

		}

		float dinerototal = dinerobanco + dinerocajon + dinerohucha + dinerobolsillo;

		System.out.println("Tu dinero total es : " + dinerototal + " €");
		
	
		

		sc.close();
	}

}
