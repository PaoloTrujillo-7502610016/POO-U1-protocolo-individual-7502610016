package taller1_poo;

public class CuentaBancaria {
    String tipoCuenta;
    int numeroCuenta;
    double saldo;

    //Constructor por defecto
    public CuentaBancaria() {
        tipoCuenta = "Ahorros";
        numeroCuenta = 123456;
        saldo = 1750023.54;
    }

    //Contructor parametrizado
    public CuentaBancaria(String tipoCuenta, int numeroCuenta) {
        this.tipoCuenta = tipoCuenta;
        this.numeroCuenta = numeroCuenta;
    }

    //Contructor sobrecargado
    public CuentaBancaria(String tipoCuenta, int numeroCuenta, double saldo) {
        this.tipoCuenta = tipoCuenta;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    @Override//Notacion override para identificar que se esta escribiendo este metodo de una clase padre
    public String toString() {
        return "Tipo de Cuenta: " +this.tipoCuenta+ ", Numero de cuenta: " +this.numeroCuenta+ ", Saldo: $" +this.saldo;
    }

}
