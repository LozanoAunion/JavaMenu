package Ejercicios;

import java.util.Scanner;

public class Ejercicio60 {
	public static void main(String[] args) {

		try (Scanner teclado = new Scanner(System.in)) {
			System.out.println("Pulsa la opcion que quieres");
			int z;
			for (z = 1; z <= 60; z++) {

				System.out.println("Ejercicio " + z);

			}

			System.out.println("-------------------------");
			int numeromenu = teclado.nextInt();

			switch (numeromenu) {

			case 1:
				Ejercicio1.Metodo1();
				break; // Ejercicio1 ejc1 = new Ejercicio1 (); //En caso de no ser Static usamos este
						// metodo para crear el objeto

			case 2:
				Ejercicio2.Metodo2();
				break;

			case 3:
				Ejercicio3.Metodo3();
				break;

			case 4:
				Ejercicio4.Metodo4();
				break;

			case 5:
				Ejercicio5.Metodo5();
				break;

			case 6:
				Ejercicio6.Metodo6();
				break;

			case 7:
				Ejercicio7.Metodo7();
				break;

			case 8:
				Ejercicio8.Metodo8();
				break;

			case 9:
				Ejercicio9.Metodo9();
				break;

			case 10:
				Ejercicio10.Metodo10();
				break;

			case 11:
				Ejercicio11.Metodo11();
				break;

			case 12:
				Ejercicio12.Metodo12();
				break;

			case 13:
				Ejercicio13.Metodo13();
				break;

			case 14:
				Ejercicio14.Metodo14();
				break;

			case 15:
				Ejercicio15.Metodo15();
				break;

			case 16:
				Ejercicio16.Metodo16();
				break;

			case 17:
				Ejercicio17.Metodo17();
				break;

			case 18:
				Ejercicio18.Metodo18();
				break;

			case 19:
				Ejercicio19.Metodo19();
				break;

			case 20:
				Ejercicio20.Metodo20();
				break;

			case 21:
				Ejercicio21.Metodo21();
				break;

			case 23:
				Ejercicio23.Metodo23();
				break;

			case 24:
				Ejercicio24.Metodo24();
				break;

			case 25:
				Ejercicio25.Metodo25();
				break;

			case 26:
				Ejercicio26.Metodo26();
				break;

			case 27:
				Ejercicio27.Metodo27();
				break;

			case 28:
				Ejercicio28.Metodo28();
				break;

			case 29:
				Ejercicio29.Metodo29();
				break;

			case 30:
				Ejercicio30.Metodo30();
				break;

			case 31:
				Ejercicio31.Metodo31();
				break;

			case 32:
				Ejercicio32.Metodo32();
				break;

			case 33:
				Ejercicio33.Metodo33();
				break;

			case 34:
				Ejercicio34.Metodo34();
				break;

			case 35:
				Ejercicio35.Metodo35();
				break;
			case 36:
				Ejercicio36.Metodo36();
				break;
				
			case 37: 
				Ejercicio37.Metodo37();
				break;
			
			case 38: 
				Ejercicio38.Metodo38();
				break;
			
			case 39: 
				Ejercicio39.Metodo39();
				break;
			
			case 41: 
				Ejercicio41.Metodo41();
				break;
			
			case 42: 
				Ejercicio42.Metodo42();
				break;
			case 43: 
				Ejercicio43.Metodo43();
				break;
			case 44: 
				Ejercicio44.Metodo44();
				break;
			case 48: 
				Ejercicio48.Metodo48();
				break;
				
			
			case 50: 
				Ejercicio50.Metodo50();
				break;
				
				
			
			case 53: 
				Ejercicio53.Metodo53();
				break;
			case 54: 
				Ejercicio54.Metodo54();
				break;
			case 55: 
				Ejercicio55.Metodo55();
				break;
			case 56: 
				Ejercicio56.Metodo56();
				break;
			case 57: 
				Ejercicio57.Metodo57();
				break;
			case 58: 
				Ejercicio58.Metodo58();
				break;
			case 59: 
				Ejercicio59.Metodo59();
				break;
				
				
				default:
					System.out.println("No tengo ese ejercicio");

			}

			teclado.close();
		}
	}

}
