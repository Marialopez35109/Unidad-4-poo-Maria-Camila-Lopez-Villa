package Taller11;

public class Ej2Vendedor extends Ej2Empleado {
    private double salarioBase;
    private double comision;

    public Ej2Vendedor(double salarioBase, double comision) {
        this.salarioBase = salarioBase;
        this.comision = comision;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + comision;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Comisión: " + comision);
    }
}
