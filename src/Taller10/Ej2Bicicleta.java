package Taller10;

public class Ej2Bicicleta extends Ej2Vehiculo{
    private String tipo;

    public Ej2Bicicleta() {
        this.tipo = "Montaña";
    }

    @Override
    public void moverse() {
        System.out.println("La bicicleta de tipo " + tipo + " se está moviendo.");
    }
}
