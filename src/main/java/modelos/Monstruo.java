package modelos;


import com.poiji.annotation.ExcelCellName;
import com.poiji.annotation.ExcelSheet;

@ExcelSheet("monstruos")
public class Monstruo {
    @ExcelCellName("NOMBRE")
    private String nombre;
    @ExcelCellName("EDAD")
    private int edad;
    @ExcelCellName("PESO")
    private double peso;
    @ExcelCellName("GENERO")
    private String genero;
    @ExcelCellName("TIPO")
    private String tipo;
    @ExcelCellName("NIVEL")
    private int nivel;


    public int getNivel() {
        return nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    @Override
    public String toString() {
        final var multilinea = """
                {
                nombre: %s
                edad: %d
                peso: %.2f
                genero: %s
                tipo: %s
                nivel: %d
                }
                """;
        return String.format(multilinea, nombre, edad, peso, genero, tipo, nivel);
    }
}
