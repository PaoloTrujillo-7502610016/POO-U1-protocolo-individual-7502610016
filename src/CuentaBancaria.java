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

}
