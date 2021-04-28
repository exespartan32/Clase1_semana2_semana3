package clase1;

import java.util.Scanner;

public class Actividad_8 {
	public static void main(String[] args) {
		String user;
		String pass;
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("por faver ingrese el usuario");
			user = teclado.next();
		System.out.println("porfavor ingrese la contraseña");
			pass = teclado.next();
			
		String usuario = "enzo";
		String contraseña = "4321";
		
		if (user.equals(usuario)) {
			if (pass.equals(contraseña)) {
				System.out.println("bienvendio al sistema");
				
				System.out.println("ingrese la nueva ccontraseña");
				contraseña = teclado.next();
				System.out.println("la contraseña contraseña se ha cambiado correctamente");
				
				
				
				
			}else {
				System.out.println("la contraseña ingresada no es valida");
			}
		}else {
			System.out.println("el usuario ingresado no es valido");
		}

	}
}
