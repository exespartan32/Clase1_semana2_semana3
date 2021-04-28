package clase1;

import java.util.Scanner;

public class Actividad_1 {

	public static void main(String[] args) {
		int n1 = 0, n2 = 0, suma;
		
		Scanner entrada = new Scanner (System.in);
			System.out.println("ingrese un numero");
				n1 = entrada.nextInt();
			System.out.println("ingrese otro numero");
				n2 = entrada.nextInt();
				
		suma = n1 + n2;
		
			System.out.println("la suma de "+ n1 +" + "+ n2 + " es: "+suma);
		
			
	}

}
