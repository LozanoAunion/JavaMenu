package Ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
	public static void Metodo6() {

		Scanner sc = new Scanner(System.in);

		System.out.println("dime un numero de segundos: ");
		int segundos = sc.nextInt();

		int horas = (segundos / 3600);
		int minutos = ((segundos - horas * 3600) / 60);
		int seg = segundos - (horas * 3600 + minutos * 60);

		System.out.println("el total son " + seg + ":segundos " + minutos + ":minutos " + horas + ":horas");

		sc.close();
	}
}
