package Ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

	public static void Metodo9() {
		System.out.println("Dime un numero para calcular su raiz cuadrada");
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();

		double resultado = sc.nextDouble();
		resultado = Math.sqrt(numero);
		System.out.println("La raíz cuadrada de " + numero + " es " + resultado);

		sc.close();
	}
}
