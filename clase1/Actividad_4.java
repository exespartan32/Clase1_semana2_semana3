package clase1;

import java.util.Scanner;

public class Actividad_4 {

	public static void main(String[] args) {
		int valor1, valor2;
		
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("ingrese un numero");
			valor1 = teclado.nextInt();
		System.out.println("ingrese otro numero");
			valor2 = teclado.nextInt();
		
	if (valor2 > valor1) {
		System.out.println("los numero enteros entre "+ valor1 + " y "+ valor2 + " son.");
		
			for (int i = valor1; i <= valor2 ; i++) {
					if (i%5==0) {					
					}else {
						System.out.println(i);
					}				
				
			}			
				}else {
					for (int i = valor2; i <= valor1 ; i++) {
							if (i%5==0) {					
							}else {
								System.out.println(i);
							}
					}
		}
		
	}
}
