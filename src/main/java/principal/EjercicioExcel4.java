package principal;

import utilities.PrimerExcelReader;

public class EjercicioExcel4 {

    public static void main(String[] args) {
        var listaVideoJuegoEmpiezaB =
                PrimerExcelReader
                        .leerListaVideojuego()
                        .stream()
                        .filter(o -> o.getNombre().startsWith("B"))
                        .toList();

        System.out.println(listaVideoJuegoEmpiezaB);
    }
}
