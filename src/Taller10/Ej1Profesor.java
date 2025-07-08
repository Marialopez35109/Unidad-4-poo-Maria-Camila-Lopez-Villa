package Taller10;

public class Ej1Profesor extends Ej1Persona {

    private String asignatura;

    public Ej1Profesor() {
        this.asignatura = "Matemáticas";
    }
    @Override
    public void presentar() {
        System.out.println("Soy un profesor.");
        System.out.println("Asignatura: " + asignatura);
    }

}
