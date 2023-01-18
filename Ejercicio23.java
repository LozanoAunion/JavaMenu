package Ejercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio23 {
	public static void Metodo23() {

		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#");
		
		System.out.println("Dime la hora: ");
		
		int hora = sc.nextInt();
		while(hora>23 || hora<0) {
			System.out.println("dime un numero menor de 60 y mayor que 0:");
			hora=sc.nextInt();
		}
		
		System.out.println("Dime los minutos");
		
		int min=sc.nextInt();
		while(min>59 || min<0) {
			System.out.println("dime un numero menor de 60 y mayor que 0:");
			min=sc.nextInt();
		}
		
		System.out.println("Dime los segundos");
		
		int segundos = sc.nextInt();
		while(segundos>59 || segundos<0) {
			System.out.println("dime un numero menor de 60 y mayor que 0:");
			segundos=sc.nextInt();
		}
		
		System.out.println("tu hora es " + hora + ":" + min + ":" + segundos);
		
		System.out.println("dime los segundos que quieres sumar: ");
		
		double  masSegundos = sc.nextDouble();
	    double segundos2 = (segundos + masSegundos);

	    
		if (segundos2 > 60){
	        double minutosSumar = (segundos2 / 60);
	        double minutos2 = min + minutosSumar;

	        while (segundos2 > 60){
	            segundos2 = (segundos2 - 60);
	        }

	        double horasSumar = minutos2 / 60;

	        while (minutos2 > 60){
	            minutos2  = (minutos2  - 60);
	        }

	        double hora2 = hora + horasSumar;

	        System.out.println("Hora con los segundos sumados : " + df.format((hora2)) + ":"+ df.format((minutos2)) +":"+df.format((segundos2)) );
	    }
	    else {
	        System.out.println("Hora actual : " + hora  + ":"+ min +":"+ df.format((segundos2)));
	    }
		sc.close();
		}

	}