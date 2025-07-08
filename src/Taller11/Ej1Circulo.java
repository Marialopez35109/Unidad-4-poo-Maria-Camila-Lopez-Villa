package Taller11;

public class Ej1Circulo {
    private double radio;

    public Ej1Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}
