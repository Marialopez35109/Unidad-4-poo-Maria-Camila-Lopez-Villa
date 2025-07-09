package Taller14;

public class Ej1Circulo extends Ej1Figura{
    private double radio;

    public Ej1Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El área del círculo es: " + area);
    }
}
