package Taller4;

public class Estudiante {
    private String nombre;
    private int edad;
    private double notaPromedio;

    // Setters y getters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        if(nombre== null || nombre.isEmpty()) {
            System.out.println("Nombre no puede ser nulo o vacío");
            return;
        }else {
            this.nombre = nombre;
        }
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        if (edad>= 0 && edad <= 120){
            this.edad = edad;
        }else{
            System.out.println("Edad no valida");
        }
    }
    public double getNotaPromedio() {
        return notaPromedio;
    }
    public void setNotaPromedio(double notaPromedio) {
        if (notaPromedio >= 0.0 && notaPromedio <= 5.0) {
            this.notaPromedio = notaPromedio;
        } else {
            System.out.println("La nota promedio debe estar entre 0.0 y 5.0.");
        }
    }

}
