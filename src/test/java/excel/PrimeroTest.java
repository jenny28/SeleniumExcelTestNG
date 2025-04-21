package excel;

import modelos.Monstruo;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.BaseTest;
import utilities.Logs;
import utilities.PrimerExcelReader;

import java.util.List;

public class PrimeroTest extends BaseTest {

    private List<Monstruo> listamonstruo;

    @BeforeMethod
    public void setUp() {
        Logs.info("soy la precondicion");
        listamonstruo = PrimerExcelReader.leerListaMonstruo();
    }

    @Test
    public void primerTest() {
        Logs.info("primer nombre");
        final var monstruo = listamonstruo.get(0);
        System.out.println("el nombre del primer elemento %s: " + monstruo.getNombre());
        Assert.assertEquals(monstruo.getNombre(), "Tolosa");
    }

    @Test
    public void segundoTest() {
        Logs.info("La longitud de la lista");
        final var sizelista = listamonstruo.size();
        System.out.println("El tamaño de la lista %d:" + sizelista);
        Assert.assertEquals(sizelista, 2);
    }

    @Test
    public void tercerTest() {
        Logs.info("imprimir el terce elemento");
        final var tercerElemento = listamonstruo.get(1);
        System.out.println("El tercer elemento es : " + tercerElemento.getNivel());
        Assert.assertEquals(tercerElemento.getNivel(), 74);
    }

    @Test
    public void cuartoTest() {
        final var monstruo = listamonstruo.get(listamonstruo.size() - 1);

        Assert.assertEquals(monstruo.getNombre(), "Corominas");
        Assert.assertEquals(monstruo.getEdad(), 1);
        Assert.assertEquals(monstruo.getPeso(), 3.308595455);
        softAssert.assertAll();// aca termina el bloque
    }

    @AfterMethod
    public void tearDown() {
        Logs.info("soy la postcondicion");
    }
}
