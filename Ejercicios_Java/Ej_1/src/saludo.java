

import java.util.Scanner;

public class saludo {

    public static void main(String[] args) {
  
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        String saludo = "Hola " + nombre + ", es un placer saludarte.";

        System.out.println(saludo);

        scanner.close();
    }
}