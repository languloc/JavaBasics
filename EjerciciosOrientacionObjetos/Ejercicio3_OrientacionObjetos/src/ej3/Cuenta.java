package ej3;

public class Cuenta {
    private String titular;
    private int cuenta;
    private double saldo;

    public Cuenta(String titular, int cuenta) {
        this.titular = titular;
        this.cuenta = cuenta;
        this.saldo = 0.0;
    }

    public Cuenta(String titular, int cuenta, double saldo) {
        this.titular = titular;
        this.cuenta = cuenta;
        this.saldo = saldo;
    }

    public void ingreso(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        }
    }

    public double debito(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            return cantidad;
        } else {
            double cantidadRetirada = saldo;
            saldo = 0;
            return cantidadRetirada;
        }
    }

    public String titular() {
        return titular;
    }

    public double saldo() {
        return saldo;
    }

    public int cuenta() {
        return cuenta;
    }

    public String toString() {
        return "Cuenta de " + titular + " - Saldo: $" + saldo;
    }
}