package Ejercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ejercicio50 {
public static void Metodo50() {
	
	
    List<Integer> Tabla1 = new ArrayList<Integer>();
    Tabla1.add(1);
    Tabla1.add(3);
    Tabla1.add(5);
    Tabla1.add(7);
    Tabla1.add(9);

    List<Integer> Tabla2 = new ArrayList<Integer>();
    Tabla2.add(2);
    Tabla2.add(4);
    Tabla2.add(6);
    Tabla2.add(8);
    Tabla2.add(10);

    	Tabla1.addAll(Tabla2);
    			Collections.sort(Tabla1);
    					System.out.println(Tabla1);
	
	
}
}
