package Ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ingresa un día de la semana: ");
        String diaSemana = scanner.nextLine();
		
			String dia_laborable = diaSemana.toLowerCase();;
			switch(dia_laborable.toLowerCase()) {
		
		case "lunes":
		case "martes":
		case "miercoles":
		case "jueves":
		case "viernes":
			System.out.println(dia_laborable + " es laborable");
		break;
			
		case "sabado":
		case "domingo":
			System.out.println(dia_laborable + " no es laborable");
		break;
		
		default:
			System.out.println("Día no válido");
		
		}	
		scanner.close();
		}
		
	}

