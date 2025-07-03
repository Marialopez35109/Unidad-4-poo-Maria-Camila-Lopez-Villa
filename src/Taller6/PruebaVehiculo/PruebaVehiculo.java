package Taller6.PruebaVehiculo;

import Taller6.Moto;
import Taller6.Vehiculo;

public class PruebaVehiculo {
    public static void main (String[]args){
        Vehiculo vehiculo = new Vehiculo();
        Moto moto = new Moto();
        vehiculo.tipo = "Sedán";
        moto.tipo = "Deportiva";
    }
}
