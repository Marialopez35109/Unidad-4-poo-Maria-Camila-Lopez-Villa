package Taller4;

public class PruebaEstudiante {
    public static void main(String[]args){
        Estudiante estudiante1= new Estudiante();
        estudiante1.setNombre("Juan Perez");
        estudiante1.setEdad(20);
        estudiante1.setNotaPromedio(4.5);
        System.out.println("Nombre: " + estudiante1.getNombre());
        System.out.println("Edad: " + estudiante1.getEdad());
        System.out.println("Nota Promedio: " + estudiante1.getNotaPromedio());
    }
}
