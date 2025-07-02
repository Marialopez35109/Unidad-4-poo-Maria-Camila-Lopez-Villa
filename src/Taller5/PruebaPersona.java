package Taller5;

public class PruebaPersona {
    public static void main(String[] args) {
    Persona persona = new Persona();
        persona.setNombre("Juan Perez");
        persona.edad = 30;

        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.edad);
    }
}
