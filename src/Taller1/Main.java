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
        CuentaBancaria cuenta1 = new CuentaBancaria("123456789", 1500.0, "Ahorros");

        // Estudiantes
        System.out.println("Estudiantes\n");
        System.out.println("Ingrese el nombre del estudiante:");
        String nombre = teclado.nextLine();
        Estudiante estudiante1 = new Estudiante( nombre, 20);


        System.out.println(estudiante1);
        System.out.println("\nCuentas Bancarias");
        System.out.println(cuenta0);
        System.out.println(cuenta1);
        System.out.println("\nLibros");
        libro0.mostrarDetallesLibro();
        libro1.mostrarDetallesLibro();

    }
}
