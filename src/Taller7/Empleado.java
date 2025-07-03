package Taller7;

public class Empleado {
    public String nombre;
    public double salario;

    //getters y setters

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        if (salario <= 0 || salario > 100000) {
            throw new IllegalArgumentException("Salario inválido.");
        }
        this.salario = salario;
    }
}
