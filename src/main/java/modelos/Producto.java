package modelos;

import com.poiji.annotation.ExcelCellName;
import com.poiji.annotation.ExcelSheet;

@ExcelSheet("productos")
public class Producto {

    @ExcelCellName("Nombre")
    private String nombre;
    @ExcelCellName("Precio")
    private double precio;
    @ExcelCellName("Stock")
    private int stock;
    @ExcelCellName("Peso")
    private double peso;
    @ExcelCellName("Perecible")
    private boolean perecible;
    @ExcelCellName("Volumen")
    private double volumen;

    public String getNombre() {
        return nombre;
    }

    public double obtenerPrecioTotal() {
        return precio * stock;
    }

    public boolean isPerecible() {
        return perecible;
    }

    public double getVolumen() {
        return volumen;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }


}
