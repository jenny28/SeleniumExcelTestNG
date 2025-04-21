package utilities;

import com.poiji.bind.Poiji;
import models.Credencial;
import models.Items;

import java.io.File;
import java.util.List;

public class ExcelReader {

    private static final String excelPath = "src/test/resources/data/seleniumData.xlsx";

    // estático pq no deseo instanciar
    public static List<Credencial> obtenerListaCredencial() {
        return Poiji.fromExcel(new File(excelPath), Credencial.class);
    }

    public static List<Items> obtenerListaItems() {
        return Poiji.fromExcel(new File(excelPath), Items.class);
    }

}
