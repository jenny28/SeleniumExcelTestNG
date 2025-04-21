package principal;

import utilities.PrimerExcelReader;

public class EjercicioExcel1 {

    public static void main(String[] args) {
        var listaVideojuegoFiltrada =
                PrimerExcelReader
                        .leerListaVideojuego()
                        .stream()
                        .filter(o -> o.getDuracion() > 50)
                        .toList();
        System.out.println(listaVideojuegoFiltrada);
        // Logs.debug("Lista: %s", listaVideojuego);
    }
}
