package page;

import models.Items;
import org.openqa.selenium.By;
import utilities.BasePage;
import utilities.Logs;

import java.util.List;

public class ShoppingPage extends BasePage {

    private final By btnInventory = By.className("btn_inventory");
    private final By titlesp = By.className("title");
    private final By productContainer = By.className("product_sort_container");
    private final By itemList = By.className("inventory_list");
    private final By listNombres = By.className("inventory_item_name");
    private final By listprecios = By.className("inventory_item_price");
    private final By imageList = By.cssSelector("img[class='inventory_item_img']");

    @Override
    public void verifyPage() {
        softAssert.assertTrue(find(titlesp).isDisplayed());
        softAssert.assertTrue(find(productContainer).isDisplayed());
        softAssert.assertTrue(find(itemList).isDisplayed());
        softAssert.assertAll();
    }


    public void verifyItemsTest(List<Items> list) {
        final var webNombreElementTest = findAll(listNombres);
        final var webPrecioeElementTest = findAll(listprecios);

        final var n = list.size();

        for (var i = 0; i < n; i++) {
            final var item = list.get(i);

            final var nombre = webNombreElementTest.get(i).getText();
            final var precio = webPrecioeElementTest.get(i).getText();

            softAssert.assertEquals(item.getNombre(), nombre);
            final var precioSinDolar = Double.parseDouble(precio.replace("$", ""));
            softAssert.assertEquals(item.getPrecio(), precioSinDolar);
        }
        softAssert.assertAll();
    }

    public void clicAllButtons() {
        final var webElementList = findAll(btnInventory);

        for (var webElement : webElementList) {
            webElement.click();
        }

    }

    public void clickImage(int index) {
        Logs.info("haciendo clic en la imagen con index : %d", index);
        findAll(imageList).get(index).click();
    }
}
