package Taller9;

public class Ej1Empleado extends Ej1Persona{
    protected String departamento;

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Departamento: " + departamento);
    }
}
