package clase1;

import java.util.Scanner;

public class Actividad_2 {

	public static void main(String[] args) {
		int valor1, valor2;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("ingrese un numero");
			valor1 = teclado.nextInt();
		System.out.println("ingrese otro numero, mayor que el anterior");
			valor2 = teclado.nextInt();
		
	if (valor2 > valor1) {
		System.out.println("los numero enteros entre "+ valor1 + " y "+ valor2 + " son.");
		
			for (int i = valor1; i <= valor2 ; i++) {
				
				
				
				
				
				
				System.out.println(i);
			}			
				}else {
				System.out.println("el segundo numero ingresado deve ser mayor que el primero");
		}
		
	}

}
