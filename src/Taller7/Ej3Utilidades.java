package Taller7;

public class Ej3Utilidades {
    public static void suma(){
        int a = 5;
        int b = 10;
        int resultado = a+b;
        System.out.println("La suma entre " + a + " y " + b + " es: " + resultado);
    }
    public static void resta(){
        int a =20;
        int b= 15;
        int resultado = a-b;
        System.out.println("La resta entre "+a + " y " + b + " es: " + resultado);
    }
    public static void multiplicacion(){
        int a= 30;
        int b= 90;
        int resultado= a*b;
        System.out.println("La multiplicación entre " +a + "por " + b + "es: " + resultado);
    }
    public static void division(){
        int a = 100;
        int b = 5;
        if (b != 0) {
            int resultado = a / b;
            System.out.println("La división entre " + a + " y " + b + " es: " + resultado);
        } else {
            System.out.println("Error: División por cero no permitida.");
        }
    }
}
