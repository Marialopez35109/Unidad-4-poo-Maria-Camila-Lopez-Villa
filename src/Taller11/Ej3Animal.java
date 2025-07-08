package Taller11;

public abstract class Ej3Animal {
    public abstract void hacerSonido();

    public void mostrarSonido() {
        System.out.print("El sonido del animal es: ");
        hacerSonido();
    }

}
