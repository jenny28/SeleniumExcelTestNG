package utilities;

import com.poiji.bind.Poiji;
import modelos.Monstruo;
import modelos.Producto;
import modelos.Videojuego;

import java.io.File;
import java.util.List;

public class PrimerExcelReader {

    private static final String excelPath = "src/main/resources/data/dataExcel.xlsx";

    // estático pq no deseo instanciar
    public static List<Videojuego> leerListaVideojuego() {
        return Poiji.fromExcel(new File(excelPath), Videojuego.class);
    }

    public static List<Monstruo> leerListaMonstruo() {
        return Poiji.fromExcel(new File(excelPath), Monstruo.class);
    }

    public static List<Producto> leerListaProducto() {
        return Poiji.fromExcel(new File(excelPath), Producto.class);
    }

}
