package Taller13;

public class Ej2Pato implements Ej2Nadador,Ej2Volador{
    @Override
    public void volar() {
        System.out.println("El pato vuela");
    }

    @Override
    public void nadar() {
        System.out.println("El pato nada");
    }
}
