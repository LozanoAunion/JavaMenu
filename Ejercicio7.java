package Ejercicios;

import java.util.Scanner;

public class Ejercicio7 {
	public static void Metodo7() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime los milimetros ");
		int milim = sc.nextInt();
		System.out.println("Dime los centimetros ");
		int cen = sc.nextInt();

		System.out.println("Dime los metros ");
		int metros = sc.nextInt();
		int milicm = milim / 10;
		int mcm = metros * 100;
		int totalcm = milicm + mcm + cen;
		System.out.println("Los cm totales son: " + totalcm + " cm");

		sc.close();
	}
}
