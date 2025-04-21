package principal;

import modelos.Producto;
import utilities.PrimerExcelReader;

public class EjercicioExcel3 {

    public static void main(String[] args) {
        final var salmon = obtenerProducto("salmon");

        final var precioTotal = salmon.obtenerPrecioTotal();
        System.out.println("Precio total: " + precioTotal);
    }

    public static Producto obtenerProducto(String nombre) {
        return PrimerExcelReader
                .leerListaProducto()
                .stream()
                .filter(o -> o.getNombre().equals(nombre))
                .findFirst()
                .orElseThrow();
    }


}
