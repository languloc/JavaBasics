package ej_11;

import java.util.Scanner;

public class Ejer_11 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingresa el número de mes: ");
            int num = sc.nextInt();

            if (num >= 1 && num <= 12) {
                int[] dias = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
                int cantidad_dias = dias[num];
                System.out.println("El mes " + num + " tiene " + cantidad_dias + " días.");
            } else {
                System.out.println("Número no válido. Debe estar entre 1 y 12.");
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Número entero.");
        }

        sc.close();
    }
}
