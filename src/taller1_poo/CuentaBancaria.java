package taller1_poo;

public class CuentaBancaria {
    private String tipoCuenta;
    private int numeroCuenta;
    private double saldo;

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

    //Getters & Setters
    public String getTipoCuenta() {//Metodo get para leer el valor de un atributo
        return tipoCuenta;
    }
    public void setTipoCuenta(String tipoCuenta) {//Metodo set para modificar el valor de un atributo
        this.tipoCuenta = tipoCuenta;
    }
    public int getNumeroCuenta() {
        return numeroCuenta;
    }
    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    @Override//Notacion override para identificar que se esta escribiendo este metodo de una clase padre
    public String toString() {//Este metodo manda a imprimir los valores de los atributos de la clase
        return "Tipo de Cuenta: " +this.tipoCuenta+ ", Numero de cuenta: " +this.numeroCuenta+ ", Saldo: $" +this.saldo;
    }

}
