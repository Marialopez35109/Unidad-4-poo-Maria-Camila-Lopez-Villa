package Taller9;

public class Ej2Empleado extends Ej1Persona{
    protected String departamento;

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Departamento: " + departamento);
    }
}
