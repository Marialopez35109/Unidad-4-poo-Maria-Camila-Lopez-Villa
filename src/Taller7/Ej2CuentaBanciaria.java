package Taller7;

public class Ej2CuentaBanciaria {
    private String nrmCuenta;
    private double saldo;
    public String tipoCuenta;

    //getters y setters

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        if (saldo < 0) {
            throw new IllegalArgumentException("Saldo no puede ser negativo.");
        }
        this.saldo = saldo;
    }

    //Metodo
    public void mostarDetallesCuenta(){
        System.out.println("Número de cuenta: " + nrmCuenta);
        System.out.println("Saldo: " + saldo);
        System.out.println("Tipo de cuenta: " + tipoCuenta);
    }
}
