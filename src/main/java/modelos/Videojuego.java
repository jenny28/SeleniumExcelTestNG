package modelos;

import com.poiji.annotation.ExcelCellName;
import com.poiji.annotation.ExcelSheet;

@ExcelSheet("videojuegos")
public class Videojuego {

    @ExcelCellName("Nombre")
    private String nombre;
    @ExcelCellName("Epoca")
    private int epoca;
    @ExcelCellName("Precio")
    private double precio;
    @ExcelCellName("Duración")
    private int duracion;
    @ExcelCellName("Genero")
    private String genero;
    @ExcelCellName("Empresa")
    private String empresa;

    public int getDuracion() {
        return duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEpoca() {
        return epoca;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        final var multilinea = """
                {
                nombre: %s
                epoca: %s
                precio: %.2f
                duracion: %d
                genero: %s
                empresa: %s
                }
                """;
        return String.format(multilinea, nombre, epoca, precio, duracion, genero, empresa);
    }
}
