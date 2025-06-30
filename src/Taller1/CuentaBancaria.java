package Taller1;

public class CuentaBancaria {
    private String nrmCuenta;
    private double saldo;
    private String tipocuenta;

    // CONSTRUCTORES
    public CuentaBancaria(){
        nrmCuenta = "Nulo";
        saldo = 0.0;
        tipocuenta = "Nulo";
    }
    public CuentaBancaria(String nrmCuenta,String tipocuenta){
        this.nrmCuenta = nrmCuenta;
        this.tipocuenta = tipocuenta;
    }
    public CuentaBancaria(String nrmCuenta,double saldo, String tipocuenta){
        this.nrmCuenta = nrmCuenta;
        this.saldo = saldo;
        this.tipocuenta = tipocuenta;
    }
}
