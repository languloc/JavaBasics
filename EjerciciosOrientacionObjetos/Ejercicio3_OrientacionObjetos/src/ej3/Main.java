package ej3;

public class Main {
    public static void main(String[] args) {
        Banco miBanco = new Banco("Mi Banco");

        int cuenta1 = miBanco.abrirCuenta("Juan", 1000);
        int cuenta2 = miBanco.abrirCuenta("Maria", 500);
        int cuenta3 = miBanco.abrirCuenta("Luis");
        int cuenta4 = miBanco.abrirCuenta("Ana", 2000);

        miBanco.ingreso(cuenta1, 500);
        miBanco.transferencia(cuenta1, cuenta2, 300);

        double saldoCuenta2 = miBanco.saldo(cuenta2);
        System.out.println("Saldo de la cuenta 2: $" + saldoCuenta2);

        System.out.println("Extracto de la cuenta 3: " + miBanco.saldo(cuenta3));

        miBanco.cerrarCuenta(cuenta4);

        System.out.println(miBanco);
    }
}