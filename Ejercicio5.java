package Ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
	public static void Metodo5() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Vamos a resolver el siguiente polinomio: Y=ax2 + bx +c");
		System.out.println("dime el coeficiente a: ");
		int a = sc.nextInt();

		System.out.println("dime el coeficiente b: ");
		int b = sc.nextInt();

		System.out.println("dime el coeficiente c: ");
		int c = sc.nextInt();

		System.out.println("dime el coeficiente x: ");
		int x = sc.nextInt();

		int Y = a * x ^ 2 + b * x + c;

		System.out.println("El resultado del polinomio Y es: " + Y);

		sc.close();
	}
}
