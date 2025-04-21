package principal;

import modelos.Videojuego;
import utilities.PrimerExcelReader;

import java.util.Comparator;
import java.util.List;

public class EjercicioExcel5 {

    public static void main(String[] args) {

        final var listaOrdenada = obtenerListaVideojuegos();
        System.out.println(listaOrdenada);
    }

    public static List<Videojuego> obtenerListaVideojuegos() {
        return PrimerExcelReader
                .leerListaVideojuego()
                .stream()
                .sorted(Comparator.comparing(Videojuego::getNombre))
                .toList();

    }
}
