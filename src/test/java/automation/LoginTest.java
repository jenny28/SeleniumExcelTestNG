package automation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.LoginPage;
import utilities.BaseTest;
import utilities.DataGiver;
import utilities.Logs;

public class LoginTest extends BaseTest {

    private final LoginPage loginPage = new LoginPage();

    @BeforeMethod
    public void setUp() {
        Logs.info("Navegando a la página");
        driver.get("https://www.saucedemo.com/");
    }

    @Test
    public void usuarioBloqueadoTest() {
        final var credencialesBloqueadas = DataGiver.obtenerCredencialesBloqueadas();

        loginPage.fillData(
                credencialesBloqueadas.getUsername(),
                credencialesBloqueadas.getPassword()
        );

        loginPage.verifyErrorMessage(credencialesBloqueadas.getMensaje());
    }

    @Test
    public void usuarioInvalidoTest() {
        final var credencialesInvalidadas = DataGiver.obtenerCredencialesInValidas();
        loginPage.fillData(
                credencialesInvalidadas.getUsername(),
                credencialesInvalidadas.getPassword()
        );

        loginPage.verifyErrorMessage(credencialesInvalidadas.getMensaje());
    }

    @Test
    public void verificarUITest() {
        loginPage.verifyPage();
    }

}
