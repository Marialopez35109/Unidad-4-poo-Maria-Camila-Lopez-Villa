package Taller13;

public class Ej1PruebaArea {
    public static void main(String[] args) {
        Ej1Firgura figura;

        figura = new Ej1Triangulo(3, 6);
        figura.calcularArea();
        figura = new Ej1Rectangulo(4, 5);
        figura.calcularArea();
    }
}
