package Taller10;

public class Ej1Estudiante extends Ej1Persona{
    protected String carrera;

    public Ej1Estudiante() {
        this.carrera = "Ingeniería de Sistemas";
    }
    @Override
    public void presentar() {
        System.out.println("Soy un estudiante.");
        System.out.println("Carrera: " + carrera);
    }
}
