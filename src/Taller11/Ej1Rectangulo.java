package Taller11;

public class Ej1Rectangulo extends Ej1Figura {
    private double base;
    private double altura;

    public Ej1Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }
}
