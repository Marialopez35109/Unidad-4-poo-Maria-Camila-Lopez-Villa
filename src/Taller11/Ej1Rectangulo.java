package Taller11;

public class Ej1Rectangulo {
    private double base;
    private double altura;

    public Ej1Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return base * altura;
    }
}
