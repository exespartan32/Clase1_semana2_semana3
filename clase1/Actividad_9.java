package clase1;

import java.util.Scanner;

public class Actividad_9 {

	public static void main(String[] args) {
		String palabra;
		int consonante = 0;
		
		Scanner teclado = new Scanner (System.in);
			System.out.println("por favor ingrese una frase");
				palabra = teclado.next();
			
			
for(int x=0; x<palabra.length(); x++) {
		if ((palabra.charAt(x)=='a') || (palabra.charAt(x)=='A') || 
			(palabra.charAt(x)=='e') || (palabra.charAt(x)=='E') || 
			(palabra.charAt(x)=='i') || (palabra.charAt(x)=='I') || 
			(palabra.charAt(x)=='o') || (palabra.charAt(x)=='O') || 
			(palabra.charAt(x)=='u') || (palabra.charAt(x)=='U')){ 
		consonante++;
		}
	}
				
System.out.println("La palabra " + palabra + " contiene " + consonante + " vocales");			
				
	}

}
