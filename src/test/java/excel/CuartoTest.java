package excel;

import modelos.Videojuego;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import principal.EjercicioExcel5;
import utilities.BaseTest;
import utilities.Logs;

import java.util.List;

public class CuartoTest extends BaseTest {

    private List<Videojuego> listaVidegojuego;
    final SoftAssert softAssert = new SoftAssert();

    @BeforeMethod
    public void setUp() {
        Logs.info("soy la precondicion");
        listaVidegojuego = EjercicioExcel5.obtenerListaVideojuegos();
    }

    @Test
    public void primerTest() {
        final var primerElemento = listaVidegojuego.get(0);
        System.out.println("el primer elemento es %s:" + primerElemento.getNombre());
        Assert.assertEquals(primerElemento.getNombre(), "Beyond Good & Evil 2");
    }

    @Test
    public void segundoTest() {
        final var ultimoElemento = listaVidegojuego.get(listaVidegojuego.size() - 1);
        System.out.println("el último elemento es %s:" + ultimoElemento.getNombre());
        Assert.assertEquals(ultimoElemento.getNombre(), "Star Citizen");
    }

    @Test
    public void tercerTest() {
        final var videojuego = listaVidegojuego.get(listaVidegojuego.size() - 1);
        System.out.println("el último monstruo es %s:" + videojuego);
        softAssert.assertEquals(videojuego.getNombre(), "Star Citizen");
        softAssert.assertEquals(videojuego.getEpoca(), 2017);
        softAssert.assertEquals(videojuego.getGenero(), "Comedia");
        softAssert.assertAll();
    }
}
