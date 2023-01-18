package Ejercicios;

import java.util.Scanner;

public class Ejercicio13 {
	public static void Metodo13() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu número de DNI: ");

		int numDNI = sc.nextInt();
		System.out.printf("La letra que corresponde a %d es %c", numDNI, calcularLetra(numDNI));
		sc.close();
	}

	private static char calcularLetra(int dni) {
		String caracteres = "TRWAGMYFPDXBNJZSQVHLCKE";
		int resto = dni % 23;
		return caracteres.charAt(resto);
	}
}
