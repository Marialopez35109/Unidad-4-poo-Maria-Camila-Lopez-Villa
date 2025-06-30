package Taller1;

public class Estudiante {
    private String nombre;
    private int edad;
    private String curso;

    // CONSTRUCTORES

    public Estudiante(){
        nombre = "Sin nombre";
        edad = 0;
        curso = "Sin curso";
    }
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public Estudiante(String nombre, int edad, String curso) {
        this(nombre, edad);
        this.curso = curso;
    }
}
