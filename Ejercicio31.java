package Ejercicios;

import java.util.Scanner;

public class Ejercicio31 {

	public static void Metodo31() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Dime el radio de la esfera para calcular el volumen y el area: ");

		Float radio = sc.nextFloat();

		float volumen = (float) ((4 / 3) * Math.PI * (radio * radio * radio));

		float area = (float) ((4 * Math.PI * (radio * radio)));

		System.out.println("El volumen es: " + volumen);
		System.out.println("El area es: " + area);

		sc.close();
	}
}
