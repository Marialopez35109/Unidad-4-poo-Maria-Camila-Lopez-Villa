package Taller7;

public class PruebaEmpleado {
    public static void main(String[] args) {
        Empleado empleado = new Empleado();
        empleado.setSalario(5000.0);

        System.out.println("El salario del empleado es: " + empleado.getSalario());
    }
}
