package Taller12;

public class Ej2Pez implements Ej2Nadador, Ej2Respirador {
    @Override
    public void nadar() {
        System.out.println("El pez nada en el agua.");
    }

    @Override
    public void respirar() {
        System.out.println("El pez respira a través de las branquias.");
    }
}
