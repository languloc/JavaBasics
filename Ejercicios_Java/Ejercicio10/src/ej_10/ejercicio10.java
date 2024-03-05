package ej_10;

import java.util.Scanner;

public class ejercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime tu nota: ");
        int nota = sc.nextInt();
        
        String notas_letra;
        
        switch (nota) {
        case 1:
        case 2:
        case 3:
        case 4:
        	notas_letra = "INSUFICIENTE";
            break;
        case 5:
        	notas_letra = "SUFICIENTE";
            break;
        case 6:
        	notas_letra = "BIEN";
            break;
        case 7:
        case 8:
        	notas_letra = "NOTABLE";
            break;
        case 9:
        	notas_letra = "SOBRESALIENTE";
            break;
        case 10:
        	notas_letra = "MATRÍCULA";
            break;
        default:
        	notas_letra = "No válido. Debe estar entre 1 y 10.";
            break;
    }

    System.out.println("Tu calificación es: " + notas_letra);

    sc.close();
}
}
       
        

