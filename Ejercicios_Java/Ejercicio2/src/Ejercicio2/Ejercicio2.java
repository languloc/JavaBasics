package Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
	
	public static final double PI = 3.14;

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
		
        System.out.print("Por favor, ingresa el radio: ");
        Double radio = scanner.nextDouble();
        
        Double area = calculararea(radio);
        
        System.out.println("El área del círculo es: " + area);

        scanner.close();
    }

    public static double calculararea(double radio) {
        double area = PI * Math.pow(radio, 2);
        return area;
    }
		
}
