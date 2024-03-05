package Ej_7;

import java.util.Scanner;

public class Ejercicio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime su DNI sin letra: ");
        int dni = sc.nextInt();
        
        char letra = calculardni(dni);
        
        System.out.println("Dni completo: " + dni + letra);
        
        sc.close();
	}
	
	public static char calculardni(int dni) {
		char[] letra = "TRWAGMYFPDXBNJZSQVHLCKE".toCharArray();
		
		int resto = dni % 23;
		return letra[resto];
	}

}
