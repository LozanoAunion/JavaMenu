package Ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
	public static void Metodo4() {

		Scanner sc = new Scanner(System.in);

		System.out.println("dime la base del triangulo: ");
		double base = sc.nextDouble();

		System.out.println("dime la altura del triangulo: ");
		double altura = sc.nextDouble();

		double Area = (base * altura) / 2;

		System.out.println("El area del triangulo es: " + Area);

		sc.close();
	}
}
