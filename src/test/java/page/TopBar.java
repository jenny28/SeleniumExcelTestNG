package page;

import org.openqa.selenium.By;
import utilities.BasePage;
import utilities.Logs;

public class TopBar extends BasePage {
    private final By checkoutButton = By.className("shopping_cart_badge");

    @Override
    public void verifyPage() {

    }

    public void verifyItemCount(int expectedCount) {
        Logs.info("verificar 6 elementos en el carrito");
        final var cantidad = Integer.parseInt(find(checkoutButton).getText());
        softAssert.assertEquals(find(checkoutButton).getText(), 6);
    }
}
