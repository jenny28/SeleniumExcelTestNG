package models;

import com.poiji.annotation.ExcelCellName;
import com.poiji.annotation.ExcelSheet;

@ExcelSheet("credenciales")
public class Credencial {

    @ExcelCellName("NOMBRE")
    private String nombre;
    @ExcelCellName("USERNAME")
    private String username;
    @ExcelCellName("PASSWORD")
    private String password;
    @ExcelCellName("MENSAJE_ERROR")
    private String mensaje;

    public String getNombre() {
        return nombre;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getMensaje() {
        return mensaje;
    }
}
