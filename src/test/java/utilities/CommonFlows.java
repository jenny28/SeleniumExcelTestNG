package utilities;

import org.openqa.selenium.WebDriver;
import page.LoginPage;
import page.ShoppingPage;

public class CommonFlows {

    private WebDriver getDriver() {
        return new WebDriverProvider().get();
    }

    public void goToLoginPage() {
        Logs.info("Navegando a la página");
        getDriver().get("https://www.saucedemo.com/");
    }

    public void goToShoppingPage() {
        goToLoginPage();
        final var credencialesValidas = DataGiver.obtenerCredencialesValidas();

        new LoginPage().fillData(credencialesValidas.getUsername()
                , credencialesValidas.getPassword()
        );
    }


    public void goToItemDetail(int index) {
        goToShoppingPage();
        new ShoppingPage().clickImage(index);
    }
}
