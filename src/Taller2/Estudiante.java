package Taller2;

public class Estudiante {
    private String nombre;
    private int edad;

    // CONSTRUCTORES
    public Estudiante(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }
    public Estudiante(){
        this("Camila", 19);
    }
    // GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    // METODO PARA MOSTRAR DETALLES DEL ESTUDIANTE
    public void mostrarDetallesEstudiante() {
        System.out.println("Nombre del Estudiante: " + getNombre());
        System.out.println("Edad del Estudiante: " + getEdad());
    }
}
