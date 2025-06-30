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
    // GETTERS Y SETTERS
    public String getNrmCuenta() {
        return nrmCuenta;
    }
    public void setNrmCuenta(String nrmCuenta) {
        this.nrmCuenta = nrmCuenta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public String getTipocuenta() {
        return tipocuenta;
    }

}
