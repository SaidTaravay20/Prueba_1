
package aplicaciontarea2;

public class Producto {
    private String nombreProducto;
    private int cantidad;

    // Constructor
    public Producto(String nombreProducto, int cantidad) {
        this.nombreProducto = nombreProducto;
        this.cantidad = cantidad;
    }

    // Getters y Setters
    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    // Método toString para mostrar el producto
    @Override
    public String toString() {
        return nombreProducto + ", " + cantidad;
    }
}


