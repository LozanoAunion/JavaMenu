package Ejercicios;

import java.util.Scanner;

public class Ejercicio37 {
	
	public static int suma(int N,int S){
		
        for(int i=2; i<N; i++){
        	
            if(N % i==0){
            	
            	
            S=S+i;
          }
        }
        
        
    return S;
    
    } 
	
	
    public static void Metodo37() {
        Scanner sc =new Scanner(System.in);
        int num1; 
        int num2;
        
        int sum1=1,sum2=1;
        
        System.out.println("ingrese primer numero");
        num1=sc.nextInt();
        
        
        System.out.println("ingrese segundo numero");
        num2=sc.nextInt();
        
        
  sum1=suma(num1,sum1);
        
  sum2=suma(num2,sum2);
        
        
        
  				if((sum1==num2)&&(sum2==num1)){
  					
  						System.out.println("los numeros "+num1+" y "+num2+" Si son numeros amigos");
  											}
  				else{
  					
            System.out.println("los numeros "+num1+" y "+num2+" No son numeros amigos");
            
        }
  				sc.close();
     }
}