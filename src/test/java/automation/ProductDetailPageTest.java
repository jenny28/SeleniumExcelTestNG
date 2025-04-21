package automation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.ItemDetailPage;
import page.LoginPage;
import page.ShoppingPage;
import utilities.BaseTest;
import utilities.DataGiver;
import utilities.Logs;

public class ProductDetailPageTest extends BaseTest {

    //private static final Logger log = LoggerFactory.getLogger(ProductDetailPageTest.class);
    private final LoginPage loginpage = new LoginPage();
    private final ShoppingPage shoppingPage = new ShoppingPage();
    private final ItemDetailPage itemDetailPage = new ItemDetailPage();

    @BeforeMethod
    public void setUp() {
        final var credencialesValidas = DataGiver.obtenerCredencialesValidas();

        Logs.info("Navegando a la página");
        driver.get("https://www.saucedemo.com/");

        loginpage.fillData(credencialesValidas.getUsername(),
                credencialesValidas.getPassword());

        Logs.info("hacer clic en la priemra imagen para navegar al detalle del producto");
        shoppingPage.clickImage(0);
    }

    @Test
    public void verificarUIPDP() {
        itemDetailPage.verifyPage();
    }

    @Test
    public void clickBackShopping() {
        itemDetailPage.clicBackTOProducts();
        shoppingPage.verifyPage();
    }

}
