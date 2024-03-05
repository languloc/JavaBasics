package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.println("Ingresa el número: ");
		 Double numero = scanner.nextDouble();
		 
		 String numero_texto = String.valueOf(numero);
		 
		int numdigitos = numero_texto.length();
		 
		System.out.println("La cantidad de digitos es: " + numdigitos);

        scanner.close();
	}
	
	public static double digitos(double numero) {
		return numero;
	}

}
