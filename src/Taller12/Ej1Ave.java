package Taller12;

public class Ej1Ave implements Ej1Cantante, Ej1Volador{
    private String nombre;

    public Ej1Ave(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void cantar() {
        System.out.println(nombre + " está cantando.");
    }

    @Override
    public void volar() {
        System.out.println(nombre + " está volando.");
    }
}
