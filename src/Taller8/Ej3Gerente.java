package Taller8;

public class Ej3Gerente extends Ej3Empleado {
    protected String departamento;

    //Metodo para mostrar detalles
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Departamento: " + departamento);
    }

}
