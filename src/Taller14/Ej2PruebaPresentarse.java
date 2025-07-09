package Taller14;

public class Ej2PruebaPresentarse {
    public static void main(String[] args) {
        Ej2Persona profesor = new Ej2Profesor();
        Ej2Persona estudiante = new Ej2Estudiante();
        Ej2Persona persona = new Ej2Persona();

        profesor.presentarse();
        estudiante.presentarse();
        persona.presentarse();
    }
}
