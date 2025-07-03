package Taller8;

public class Ej1Coche extends Ej1Vehiculo {
    protected int numeroDePuertas;

    //Meotodo para mostrar detalles del coche
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Número de puertas: " + numeroDePuertas);
    }

}
