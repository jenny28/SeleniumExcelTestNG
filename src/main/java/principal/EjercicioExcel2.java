package principal;

import modelos.Monstruo;
import utilities.PrimerExcelReader;

import java.util.Comparator;
import java.util.List;

public class EjercicioExcel2 {

    public static void main(String[] args) {
        // ordenado de mayor a menor por nivel
        final var listaMonstruoOrdenada = obtenerListaOrdenada();
        System.out.println("Lista monstruos ordenada: " + listaMonstruoOrdenada);
    }

    // 1. Excel en una lista y ordenarla
    public static List<Monstruo> obtenerListaOrdenada() {
        return PrimerExcelReader
                .leerListaMonstruo()
                .stream()
                .sorted(Comparator.comparingInt(Monstruo::getNivel).reversed())
                .toList();
    }

}
