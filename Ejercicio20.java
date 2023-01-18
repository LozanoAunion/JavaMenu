package Ejercicios;

import java.util.Scanner;

public class Ejercicio20 {

	public static void Metodo20() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Dime el angulo del triangulo");

		double angulo = sc.nextInt();
		double resultado = 0;
		double radianes = Math.toRadians(angulo);

		if (angulo > 360) {

			double angulosmayores = angulo / 360;

			int entero = (int) angulosmayores;

			resultado = angulosmayores - entero;

			int resultado2 = (int) (resultado * 360);

			System.out.println("El angulo es: " + resultado2 + "º");

		}

		if (angulo < 360) {

			System.out.println("Ese angulo convertido a radianes es: " + radianes);

		}

		sc.close();

	}

}
