package semana_2;

import java.util.Scanner;

public class Vista {
	public static void mostrarPersona( ) {
		Persona per1 = new Persona("exequiel", "mayorga");
					
	}
	
	public static void entregarPersona( ) {
		String nom;
		String ape;
		
		Scanner entrada = new Scanner (System.in);
			System.out.println("ingrese el nombre de la persona: ");
				nom = entrada.next();
			System.out.println("ingrese el apellido de la pesona: ");
				ape = entrada.next();
						Persona per1 = new Persona (nom, ape);
				System.out.println("el nombre de la persona es: "+per1.getNombre());
				System.out.println("el apellido de la persona es: "+per1.getApellido());
	}
}

