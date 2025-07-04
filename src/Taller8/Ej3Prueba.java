package Taller8;

public class Ej3Prueba {
    public static void main(String[] args) {
        //Empleado
        Ej3Empleado empleado = new Ej3Empleado();
        empleado.nombre = "Ana Gómez";
        empleado.setSalario(3000000);
        empleado.mostrarDetalles();

        //Gerente
        Ej3Gerente gerente = new Ej3Gerente();
        gerente.nombre = "Carlos López";
        gerente.setSalario(5000000);
        gerente.departamento = "Recursos Humanos";
        gerente.mostrarDetalles();
    }
}
