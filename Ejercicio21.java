package Ejercicios;

import java.util.Scanner;

public class Ejercicio21 {

	public static void Metodo21() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Elige 1 para convertir a Decimal y 2 a binario: ");
		int eleccion = sc.nextInt();

		if (eleccion == 2) {

			System.out.println("Dime un valor para convertir a binario: ");
			int numInt = sc.nextInt();

			String binario = Integer.toBinaryString(numInt);

			System.out.println(binario);

		}

		else if (eleccion == 1) {

			System.out.println("Dime un valor para convertir a Decimal: ");

			String binaryString = sc.next();

			int decimal = Integer.parseInt(binaryString, 2);
			System.out.println(decimal);
		}

		else {
			System.out.println("No has seleccionado bien");
		}

		sc.close();
	}

}
