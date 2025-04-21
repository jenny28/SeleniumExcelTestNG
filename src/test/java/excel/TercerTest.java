package excel;

import modelos.Producto;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import principal.EjercicioExcel3;
import utilities.BaseTest;

public class TercerTest extends BaseTest {

    private Producto producto;

    @BeforeMethod
    public void setUp() {
        producto = EjercicioExcel3.obtenerProducto("Salmon");
    }

    @Test
    public void primerTest() {
        System.out.println("Precio total del producto %.2f:" + producto.obtenerPrecioTotal());
        Assert.assertTrue(producto.obtenerPrecioTotal() > 1000);
    }

    @Test
    public void segundoTest() {
        System.out.println("Producto es perecible %b:" + producto.isPerecible());
        Assert.assertFalse(producto.isPerecible());
    }

    @Test
    public void tercerTest() {
        System.out.println("El volumen es %.2f:" + producto.getVolumen());
        Assert.assertTrue(producto.getVolumen() > 1.7);
    }

    @Test
    public void cuartoTest() {
        softAssert.assertEquals(producto.getNombre(), "Salmon");
        softAssert.assertFalse(producto.isPerecible());
        softAssert.assertEquals(producto.getStock(), 5);
        softAssert.assertTrue(producto.getPrecio() > 10);
        softAssert.assertAll();
    }

}
