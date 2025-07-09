package Taller15;

public class Ej2Producto {
    private String nombre;
    private double precio;

    //Constructor
    public Ej2Producto(String nombre, double precio) {
        this.nombre=nombre;
        this.precio=precio;
    }
    //getters y setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //Metodos
    public void detallesProducto() {
        System.out.println("Nombre del producto: " + getNombre());
        System.out.println("Precio del producto: " + getPrecio());
    }
}
