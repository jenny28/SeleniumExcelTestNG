package page;

import org.openqa.selenium.By;
import utilities.BasePage;
import utilities.Logs;

public class ItemDetailPage extends BasePage {

    private final By itemDetail = By.cssSelector("div[data-test='inventory-item-name']");
    private final By itemDescription = By.cssSelector("div[data-test='inventory-item-desc']");
    private final By itemPrice = By.cssSelector("div[data-test='inventory-item-price']");
    private final By btnAddToCart = By.id("add-to-cart");
    private final By imageDetail = By.className("inventory_details_img");
    private final By backToProduct = By.id("back-to-products");

    @Override
    public void verifyPage() {
        Logs.info("Verificar la página PDP");
        softAssert.assertTrue(find(itemDetail).isDisplayed());
        softAssert.assertTrue(find(itemDescription).isDisplayed());
        softAssert.assertTrue(find(itemPrice).isDisplayed());
        softAssert.assertEquals(find(itemPrice).getText(), "$29.99");
        softAssert.assertTrue(find(btnAddToCart).isDisplayed());
        softAssert.assertTrue(find(imageDetail).isDisplayed());
        softAssert.assertTrue(find(backToProduct).isDisplayed());
        softAssert.assertEquals(find(backToProduct).getText(), "Back to products");
        softAssert.assertAll();
    }

    public void clicBackTOProducts() {
        Logs.info("Hacer clic en back to products");
        find(backToProduct).click();
    }
}
