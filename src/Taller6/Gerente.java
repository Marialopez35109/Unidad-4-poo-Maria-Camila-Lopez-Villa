package Taller6;

public class Gerente extends Empleado {
    protected String departamento;

    @Override
    protected void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Departamento: " + departamento);
    }

}
