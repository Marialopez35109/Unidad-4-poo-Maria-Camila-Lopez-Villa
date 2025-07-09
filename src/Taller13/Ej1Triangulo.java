package Taller13;

public class Ej1Triangulo extends Ej1Firgura {
    private double base;
    private double altura;

    public Ej1Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        double area = (base * altura) / 2;
        System.out.println("El área del triángulo es: " + area);
    }
}
