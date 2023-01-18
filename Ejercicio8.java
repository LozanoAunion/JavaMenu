package Ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void Metodo8() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime las hormigas capturadas ");
		int horm = sc.nextInt();
		System.out.println("Dime las arañas capturadas ");
		int ara = sc.nextInt();

		System.out.println("Dime los cochinillas ");
		int coch = sc.nextInt();
		int hormi = horm * 6;
		int aran = ara * 8;
		int cochi = coch * 14;
		int total = hormi + aran + cochi;
		System.out.println("Los patas totales son: " + total);

		sc.close();
	}
}
