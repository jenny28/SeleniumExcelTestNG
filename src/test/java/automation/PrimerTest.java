package automation;

import org.testng.annotations.Test;
import utilities.BaseTest;
import utilities.Logs;

public class PrimerTest extends BaseTest {

    private String currentURL;

    @Test
    public void primerTest() {
        final var url = "https://www.saucedemo.com/";
        Logs.info("Navegando a la página");
        driver.get(url);

        // verificar que la URL sea la misma
        currentURL = driver.getCurrentUrl();
        // softAssert.assertEquals(currentURL, url);
    }

    @Test
    public void segundoTest() {
        final var url1 = "https://the-internet.herokuapp.com/";
        final var url2 = "https://github.com/";

        Logs.info("navegar página 1");
        driver.get(url1);
        Logs.info("navegar pagina 2");
        driver.get(url2);

        Logs.info("regresando a la página anterior");
        driver.navigate().back();

        Logs.info("verificar la url original");
        //softAssert.assertEquals(currentURL, url1);


    }
}
