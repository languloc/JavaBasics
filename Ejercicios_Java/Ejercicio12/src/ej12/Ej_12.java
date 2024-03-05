package ej12;

import java.util.Scanner;

public class Ej_12 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Dame una frase: ");
            String frase = sc.nextLine();

            int contar = contar_letras(frase);
            System.out.println("Número de vocales en la frase: " + contar);
        } catch (java.util.InputMismatchException e) {
            System.out.println("No válido");
        }

        sc.close();
    }

    public static int contar_letras(String frase) {
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            char caracter = Character.toLowerCase(frase.charAt(i));
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                contador++;
            }
        }
        return contador;
    }
}

