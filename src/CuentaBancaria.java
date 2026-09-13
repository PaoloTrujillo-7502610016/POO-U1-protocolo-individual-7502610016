public class CuentaBancaria {
    String tipoCuenta;
    int numeroCuenta;
    double saldo;

    //Constructor por defecto
    public CuentaBancaria() {
        tipoCuenta = "Ahorros";
        numeroCuenta = 123456;
        saldo = 1750000;
    }

    //Contructor parametrizado
    public CuentaBancaria(int numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }


}
