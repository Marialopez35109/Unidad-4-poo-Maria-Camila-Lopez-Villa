package Taller11;

public class Ej1Circulo extends Ej1Figura {
    private double radio;

    public Ej1Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}
