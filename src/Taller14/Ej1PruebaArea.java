package Taller14;

public class Ej1PruebaArea {
    public static void main(String[] args) {
        Ej1Figura figura1 = new Ej1Circulo(5);
        figura1.calcularArea();

        Ej1Figura figura2 = new Ej1Rectangulo(4, 6);
        figura2.calcularArea();
    }
}
