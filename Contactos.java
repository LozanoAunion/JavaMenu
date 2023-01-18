package Ejercicios;

public class Contactos {
	// Se establecen los atributos
	
	@SuppressWarnings("unused")
	
	 String name;
	
    @SuppressWarnings("unused")
    
    
	 String numero;

	//Se establecen parametros
	
	public Contactos (String nom, String num) {
		
		numero=num;
		name=nom;
		
		
	}
	
public String toString() {
		
		return "Nombre del Contacto: " +name+ "	Numero del contacto: " +numero;
		
		
		
		
		
		
	}


}		
		
		

	
