package Taller11;

public abstract class Ej2Empleado {
    public abstract double calcularSalario();
    public void mostrarDetalles() {
        System.out.println("Salario: " + calcularSalario());
    }


}
