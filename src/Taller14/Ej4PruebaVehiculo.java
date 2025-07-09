package Taller14;

public class Ej4PruebaVehiculo {
    public static void main(String[] args) {
        Ej4Vehiculo vehiculo = new Ej4Vehiculo();
        Ej4Vehiculo coche =new Ej4Coche();
        Ej4Vehiculo bicicleta =new Ej4Bicicleta();

        vehiculo.mover();
        coche.mover();
        bicicleta.mover();
    }
}
