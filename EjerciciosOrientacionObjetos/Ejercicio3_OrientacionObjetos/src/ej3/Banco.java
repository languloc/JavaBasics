package ej3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Banco {
    private String nombre;
    private List<Cuenta> cuentas;

    public Banco(String nombre) {
        this.nombre = nombre;
        cuentas = new ArrayList<>();
    }

    public int abrirCuenta(String titular, double saldoInicial) {
        int numeroCuenta = generarNumeroCuenta();
        Cuenta nuevaCuenta = new Cuenta(titular, numeroCuenta, saldoInicial);
        cuentas.add(nuevaCuenta);
        return numeroCuenta;
    }

    public int abrirCuenta(String titular) {
        return abrirCuenta(titular, 0.0);
    }

    public void cerrarCuenta(int numeroCuenta) {
        for (Cuenta cuenta : cuentas) {
            if (cuenta.cuenta() == numeroCuenta) {
                cuentas.remove(cuenta);
                break;
            }
        }
    }

    public void ingreso(int numeroCuenta, double cantidad) {
        for (Cuenta cuenta : cuentas) {
            if (cuenta.cuenta() == numeroCuenta) {
                cuenta.ingreso(cantidad);
                break;
            }
        }
    }

    public double debito(int numeroCuenta, double cantidad) {
        for (Cuenta cuenta : cuentas) {
            if (cuenta.cuenta() == numeroCuenta) {
                return cuenta.debito(cantidad);
            }
        }
        return 0.0;
    }

    public double saldo(int numeroCuenta) {
        for (Cuenta cuenta : cuentas) {
            if (cuenta.cuenta() == numeroCuenta) {
                return cuenta.saldo();
            }
        }
        return 0.0;
    }

    public void transferencia(int cuentaOrigen, int cuentaDestino, double cantidad) {
        double saldoOrigen = saldo(cuentaOrigen);
        if (saldoOrigen >= cantidad) {
            debito(cuentaOrigen, cantidad);
            ingreso(cuentaDestino, cantidad);
        }
    }

    public int numCuentas() {
        return cuentas.size();
    }

    @Override
    public String toString() {
        return "Banco " + nombre + " - Número de cuentas: " + numCuentas();
    }

    private int generarNumeroCuenta() {
        Random random = new Random();
        return random.nextInt(100000);  // Número de cuenta aleatorio
    }
}