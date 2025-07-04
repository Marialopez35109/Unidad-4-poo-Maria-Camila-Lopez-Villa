package Taller8;

public class Ej3Empleado {
    protected String nombre;
    protected double salario;

    // Setters y getters
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    //Metodo para mostrar detalles
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + getSalario() + " COP");
    }
}
