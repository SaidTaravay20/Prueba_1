
package aplicaciontarea2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Almacen {
    private List<Producto> productos;
    private final String FILE_NAME = "src/aplicaciontarea2/stock.txt";;

    public Almacen() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
        guardarProductos();
    }

    private void guardarProductos() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            for (Producto producto : productos) {
                writer.write(producto.toString());
                writer.newLine();
            }
        } catch (IOException e) {
        }
    }
}
