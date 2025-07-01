package Taller2;

public class Producto {
    private String nombre;
    private int precio;

    // CONSTRUCTOR
    public Producto(String nombre, int precio) {
    this.nombre=nombre;
    this.precio=precio;
    }

    // GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    // METODO PARA MOSTRAR DETALLES DEL PRODUCTO
    public void mostrarDetallesProducto() {
        System.out.println("Nombre del Producto: " + getNombre());
        System.out.println("Precio del Producto: " + getPrecio());
    }
}
