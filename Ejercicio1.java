package Ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void Metodo1() {

		Scanner sc = new Scanner(System.in);

		float precioUnidad, cantidad, iva, precioSinIva, totalIva;

		System.out.print("Introduzca precio por unidad del producto: ");
		precioUnidad = sc.nextFloat();

		System.out.print("Introduzca número de productos vendidos: ");
		cantidad = sc.nextFloat();

		System.out.print("Introduzca %IVA: ");
		iva = sc.nextFloat();

		precioSinIva = precioUnidad * cantidad;
		totalIva = precioSinIva * iva / 100;

		System.out.println("Precio de venta -> " + (precioSinIva + totalIva));

		sc.close();
	}
}
