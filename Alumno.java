package Ejercicios;




public class Alumno {

	// Se establecen los atributos
	int Idalu;
	String nombre;	
	int nota1;
	int nota2;
	int nota3;
	float promedio;
	float promediotri;

static float media(int valor1, int valor2, int valor3) {
	
	float promedio = (valor1+valor2+valor3)/3 ;
	return promedio;
	
	
}	

static float promedio(float valor) {
	
	float promediotri = (valor)/5 ;
	return promediotri;
	
	
}	

	//Se establecen parametros
	public Alumno(int id, String nom, int not1, int not2, int not3, float prom, float promtri) {
		
		Idalu=id;
		nombre=nom;
		nota1=not1;
		nota2=not2;	
		nota3=not3;
		promedio=media(nota1,nota2,nota3);
		promediotri=promedio(prom);
		
		Alumno.promedio(promtri);
		
	}
	
	public String toString() {
		
		return "ID del Alumno: "+Idalu+" 	Nombre del Alumno: "+nombre+" 	Nota 1º Trimestre: "+nota1+" 	Nota 2º Trimestre: "+nota2+" 	Nota 3º Trimestre: "+nota3+" 	Nota Promedio Alumno: "+promedio;
		
		
		
		
		
		
	}
}
