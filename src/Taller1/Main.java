package Taller1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Libros
        Libro libro0 = new Libro();
        Libro libro1 = new Libro("El Principito", "Antoine de Saint-Exupéry", 96);

        // Cuentas Bancarias
        CuentaBancaria cuenta0 = new CuentaBancaria();
        CuentaBancaria cuenta1 = new CuentaBancaria();

        // Estudiantes
        Estudiante estudiante0 = new Estudiante();
        System.out.println("Ingrese el nombre del estudiante:");
        String nombre = teclado.nextLine();
        Estudiante estudiante1 = new Estudiante( nombre, 20);


        System.out.println(estudiante0);
        System.out.println(estudiante1);
        System.out.println(libro0);
        System.out.println(libro1);
        System.out.println(cuenta0);
        System.out.println(cuenta1);
        libro0.mostrarDetallesLibro();
        libro1.mostrarDetallesLibro();






    }
}
