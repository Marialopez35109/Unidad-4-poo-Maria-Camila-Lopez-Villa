package Taller3;

public class Coche {
    private String marca;
    private String modelo;
    private static int contadorCoches=0;

    // Constructor
    public Coche (){
        contadorCoches++;
    }

    // Getters y Setters
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public static int getContadorCoches() {
        return contadorCoches;
    }
    public static void setContadorCoches(int contadorCoches) {
        Coche.contadorCoches = contadorCoches;
    }

}
