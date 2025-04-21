package excel;

import modelos.Monstruo;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import principal.EjercicioExcel2;
import utilities.BaseTest;
import utilities.Logs;

import java.util.List;

public class SegundoTest extends BaseTest {

    private List<Monstruo> listaMonstruo;

    @BeforeMethod
    public void setUp() {
        Logs.info("soy la precondición");
        listaMonstruo = EjercicioExcel2.obtenerListaOrdenada(); // llamando la implementación
    }

    // se obtiene el primer elemento
    @Test
    public void primerTest() {
        final var monstruo = listaMonstruo.get(0);
        System.out.println("el primer monstruo es %s:" + monstruo);
    }

    // obtiene el último elemento
    @Test
    public void segundoTest() {
        final var monstruo = listaMonstruo.get(listaMonstruo.size() - 1);
        System.out.println("el último monstruo es %s:" + monstruo);
    }

}
