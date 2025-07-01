package Taller4;

public class Coche {
    private String marca;
    private String modelo;
    private double velocidadMaxima=0;

    public Coche(String marca) {
        this.marca = marca;

    }
    public void acelerar(double incremento) {
        if (incremento>0){
            velocidadMaxima += incremento;
        }
    }
}
