package Ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio19 {

	public static void Metodo19() {

		Scanner sc = new Scanner(System.in);

		int numero1 = (int) (Math.random() * 99 + 1);
		System.out.println("El primer valor es: " + numero1);

		int numero2 = (int) (Math.random() * 99 + 1);
		System.out.println("El segundo valor es: " + numero2);

		ArrayList<String> palabras = new ArrayList<String>();

		palabras.add("Multiplicacion");
		palabras.add("Resta");
		palabras.add("Suma");

		int eleccion = (int) (Math.random() * 3);

		System.out.println("La operacion es: " + palabras.get(eleccion));

		System.out.println("Realiza la operacion e introduce el resultado");

		int contestacion = sc.nextInt();
		int operacion1 = numero1 * numero2;
		int operacion2 = numero1 - numero2;
		int operacion3 = numero1 + numero2;

		if (contestacion == operacion1) {

			System.out.println("El resultado es correcto!!");
		}

		else if (contestacion == operacion2) {

			System.out.println("El resultado es correcto!!");

		}

		else if (contestacion == operacion3) {

			System.out.println("El resultado es correcto!!");

		} else {

			System.out.println("El resultado no es correcto!!");

		}

		sc.close();

	}

}
