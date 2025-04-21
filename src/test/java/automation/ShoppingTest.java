package automation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.LoginPage;
import page.ShoppingPage;
import page.TopBar;
import utilities.BaseTest;
import utilities.CommonFlows;
import utilities.ExcelReader;
import utilities.Logs;

public class ShoppingTest extends BaseTest {
    private final LoginPage loginPage = new LoginPage();
    private final ShoppingPage shoppingPage = new ShoppingPage();
    private final TopBar topBar = new TopBar();
    private final CommonFlows commonflows = new CommonFlows();

    @BeforeMethod
    public void setUp() {
        commonflows.goToShoppingPage();
    }

    @Test
    public void addToCartTest() {
        shoppingPage.clicAllButtons();
        topBar.verifyItemCount(6);

    }

    @Test
    public void verificarUIShoppingTest() {
        Logs.info("Verificar el UI del shopping");
        shoppingPage.verifyPage();
    }

    @Test
    public void verifyItemsTest() {
        final var listaItems = ExcelReader.obtenerListaItems();

        shoppingPage.verifyItemsTest(listaItems);
    }
}
