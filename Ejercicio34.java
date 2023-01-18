package Ejercicios;

import java.util.Scanner;

public class Ejercicio34 {
	public static void Metodo34() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Dime el numero de dias");

		int dia = sc.nextInt();

		System.out.println("Dime el numero de horas");

		int horas = sc.nextInt();

		System.out.println("Dime el numero de minnutos");

		int min = sc.nextInt();

		int segdia = dia * 86400;

		int seghora = horas * 3600;

		int segmin = min * 60;

		int total = segdia + seghora + segmin;

		System.out.println("El numero total de segundos es: " + total);

		sc.close();

	}

}
