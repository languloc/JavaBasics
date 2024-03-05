package Ej_5;

import java.util.Scanner;

public class Ejercicio {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		
		double numero;
		
		do {
			System.out.println("Dime un número positivo: ");
			numero = sc.nextDouble();
			
			if (numero <= 0) {
		        System.out.println("El número no es positivo. Intenta de nuevo.");
			} 
			} while(numero >= 0); 
		sc.close();
	}
}
