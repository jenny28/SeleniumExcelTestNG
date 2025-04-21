package automation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.ItemDetailPage;
import page.ShoppingPage;
import utilities.BaseTest;
import utilities.CommonFlows;

public class ProductDetailPageTest extends BaseTest {

    //private static final Logger log = LoggerFactory.getLogger(ProductDetailPageTest.class);
    private final ShoppingPage shoppingPage = new ShoppingPage();
    private final ItemDetailPage itemDetailPage = new ItemDetailPage();
    private final CommonFlows commonflows = new CommonFlows();

    @BeforeMethod
    public void setUp() {
        commonflows.goToItemDetail(0);
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
