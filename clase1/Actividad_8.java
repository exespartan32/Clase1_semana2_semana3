package clase1;

import java.util.Scanner;

public class Actividad_8 {
	public static void main(String[] args) {
		String user;
		String pass;
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("por faver ingrese el usuario");
			user = teclado.next();
		System.out.println("porfavor ingrese la contrase�a");
			pass = teclado.next();
			
		String usuario = "enzo";
		String contrase�a = "4321";
		
		if (user.equals(usuario)) {
			if (pass.equals(contrase�a)) {
				System.out.println("bienvendio al sistema");
				
				System.out.println("ingrese la nueva ccontrase�a");
				contrase�a = teclado.next();
				System.out.println("la contrase�a contrase�a se ha cambiado correctamente");
				
				
				
				
			}else {
				System.out.println("la contrase�a ingresada no es valida");
			}
		}else {
			System.out.println("el usuario ingresado no es valido");
		}

	}
}
