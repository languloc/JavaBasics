package ej2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        agenda agenda = new agenda();
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("Menú:");
            System.out.println("1. Agregar contacto (nombre y teléfono)");
            System.out.println("2. Agregar contacto (nombre, teléfono y dirección)");
            System.out.println("3. Mostrar todos los contactos");
            System.out.println("4. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el salto de línea

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Teléfono: ");
                    String telefono = scanner.nextLine();
                    if (agenda.insertarContacto(nombre, telefono)) {
                        System.out.println("Contacto agregado con éxito.");
                    } else {
                        System.out.println("El contacto ya existe.");
                    }
                    break;

                case 2:
                    System.out.print("Nombre: ");
                    nombre = scanner.nextLine();
                    System.out.print("Teléfono: ");
                    telefono = scanner.nextLine();
                    System.out.print("Dirección: ");
                    String direccion = scanner.nextLine();
                    if (agenda.insertarContacto(nombre, telefono, direccion)) {
                        System.out.println("Contacto agregado con éxito.");
                    } else {
                        System.out.println("El contacto ya existe.");
                    }
                    break;

                case 3:
                    agenda.mostrarContactos();
                    break;

                case 4:
                    salir = true;
                    break;

                default:
                    System.out.println("Opción no válida. Introduce un número del 1 al 4.");
            }
        }

        scanner.close();
    }
}