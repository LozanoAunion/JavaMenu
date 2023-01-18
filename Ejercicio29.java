package Ejercicios;

import java.util.Scanner;

public class Ejercicio29 {

	public static void Metodo29() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Dime el numero del cual quieres saber la raiz cuadrada");

		int numero = sc.nextInt();

		double resultado = Math.sqrt(numero);
		System.out.println("La raíz cuadrada de " + numero + " es " + resultado);

		sc.close();
	}
}
