package Taller13;

public class Ej1Rectangulo extends Ej1Firgura{
    private double base;
    private double altura;

    public Ej1Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        double area = base * altura;
        System.out.println("El área del rectángulo es: " + area);
    }
}
