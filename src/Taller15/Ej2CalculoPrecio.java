package Taller15;

public class Ej2CalculoPrecio {
    public void calculoPrecios(Ej2Producto producto) {
        double precio = producto.getPrecio();
        double iva = precio * 0.21; // 21% de IVA
        double precioFinal = precio + iva;

        System.out.println("Precio original: " + precio);
        System.out.println("IVA (21%): " + iva);
        System.out.println("Precio final con IVA: " + precioFinal);
    }
}
