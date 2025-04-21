package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class BaseTest {

    protected SoftAssert softAssert;
    protected WebDriver driver;

    @BeforeMethod
    public void setUpMaster() {
        softAssert = new SoftAssert();
        Logs.info("soy la precondición del padre");

        Logs.debug("Inicializando el driver");
        driver = new ChromeDriver();

        Logs.debug("Maximizar el driver");
        driver.manage().window().maximize();

        Logs.debug("Borrar cookies");
        driver.manage().deleteAllCookies();

        Logs.info("Asignando implicit wait");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        Logs.debug("Guardando el driver");
        new WebDriverProvider().set(driver);
    }

    @AfterMethod
    public void tearDownMaster() {
        Logs.debug("Cerrar el padre");
        driver.quit();
    }
}
