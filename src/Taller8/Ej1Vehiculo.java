package Taller8;

public class Ej1Vehiculo {
    protected String marca;
    protected double velocidadMaxima;

    //Metodo para mostrar detalles del vehículo
    public void mostrarDetalles() {
        System.out.println("Marca: " + marca);
        System.out.println("Velocidad máxima: " + velocidadMaxima + " km/h");
    }
}
