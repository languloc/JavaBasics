package EJ_8;

import java.util.Scanner;

public class Ejercicio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime el número: ");
        int num = sc.nextInt();
        
        System.out.print("Dime la potencia: ");
        int potencia = sc.nextInt();
        
        Double pot = calcularpotencia(num, potencia);
        
        System.out.println("Resultado: " + pot);

        sc.close();

	}
	 public static double calcularpotencia(double num, double potencia) {
	        double pot = num *= potencia;
	        return pot;
	 }
}
