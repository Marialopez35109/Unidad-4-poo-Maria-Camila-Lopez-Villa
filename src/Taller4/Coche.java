package Taller4;

public class Coche {
    private String marca;
    private String modelo;
    private double velocidadMaxima=0;

    //Constructor
    public Coche(String marca) {
        this.marca = marca;
    }

    //Metodo
    public void acelerar(double incremento) {
        if (incremento>0){
            velocidadMaxima += incremento;
        }
    }
}
