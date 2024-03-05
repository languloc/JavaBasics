package ej1;

public class Ejercicio1 {

    public static void main(String[] args) {
        int tamanoTablero = 10;
        String[][] tablero = new String[tamanoTablero][tamanoTablero];

        for (int fila = 0; fila < tamanoTablero; fila++) {
            for (int columna = 0; columna < tamanoTablero; columna++) {
                if ((fila + columna) % 2 == 0) {
                    tablero[fila][columna] = "x";
                } else {
                    tablero[fila][columna] = "o";
                }
            }
        }

        for (int fila = 0; fila < tamanoTablero; fila++) {
            for (int columna = 0; columna < tamanoTablero; columna++) {
                System.out.print(tablero[fila][columna] + " ");
            }
            System.out.println();
        }
    }
}