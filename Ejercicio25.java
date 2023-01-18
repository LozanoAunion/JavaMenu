package Ejercicios;

import java.util.Scanner;

public class Ejercicio25 {

	public static void Metodo25() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Dime el numeror de filas:");
		int nfilas = sc.nextInt();
		int[] a = new int[1];
		for (int i = 0; i <= nfilas; i++) {
			int[] x = new int[i];
			for (int j = 0; j < i; j++) {
				if (j == 0 || j == (i - 1)) {
					x[j] = 1;
				} else {
					x[j] = a[j] + a[j - 1];
				}
				System.out.print(x[j] + " ");
			}
			a = x;
			System.out.println();
		}
		sc.close();
	}
}
