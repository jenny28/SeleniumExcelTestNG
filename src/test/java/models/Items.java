package models;


import com.poiji.annotation.ExcelCellName;
import com.poiji.annotation.ExcelSheet;

@ExcelSheet("items")
public class Items {

    @ExcelCellName("Nombre")
    private String nombre;
    @ExcelCellName("Precio")
    private double precio;

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
}
