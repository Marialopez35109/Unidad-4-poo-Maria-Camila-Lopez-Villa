package Taller11;

public class Ej2Gerente extends Ej2Empleado {
    private double salarioBase;
    private double bonificacion;

    public Ej2Gerente(double salarioBase, double bonificacion) {
        this.salarioBase = salarioBase;
        this.bonificacion = bonificacion;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bonificacion;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Bonificación: " + bonificacion);
    }
}
