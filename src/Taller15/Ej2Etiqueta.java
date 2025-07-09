package Taller15;

public class Ej2Etiqueta {
    public void generarEtiqueta(Ej2Producto producto){
        System.out.println("Etiqueta del producto:");
        System.out.println("Nombre: " + producto.getNombre());
        System.out.println("Precio: " + producto.getPrecio());
    }
}
