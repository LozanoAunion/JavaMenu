package Ejercicios;

import java.util.Scanner;

public class Ejercicio36 {

	static boolean esprimo(int num) {

		int numdivisores = 0;  // Comprueba si es primo o no SI = TRUE
		boolean resultado=false;
		
		for (int i = 1; i <= num; i++) { // Recorre los numero desde 1 hasta NUM y si es menor aumenta

			if (num % i == 0) { // Comprueba si el numero es divisible entre cada uno de los numeros y si es 0 significa que es un divisor

				numdivisores++;

			}

		}

		if (numdivisores <= 2) { // Si los divisores son menores a 2 es primo porque un primo solo es divisible entre 1 y si mismo

			
			return true; //Si tiene 2 divisores devuelve TRUE
		}
		
		else {
		return resultado;
				}
	}

	static void Divisoresprimos(int num) {
		System.out.println("Los divisores primos son los siguiente: " );
		for (int i =1 ; i <= num; i++) { // Recorre los divisores

			if (num % i == 0) { // Resto = 0 comprueba si es primo

				if (esprimo(i)) {
					System.out.println(i);
					
					
				}

			}

		}

	}

	public static void Metodo36() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Dime el numero");
		int num = sc.nextInt();
		
		
		Divisoresprimos(num);
		

		sc.close();

	}
}