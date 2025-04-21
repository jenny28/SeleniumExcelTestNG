package page;

import org.openqa.selenium.By;
import utilities.BasePage;
import utilities.Logs;

public class LoginPage extends BasePage {

    private final By usernameInput = By.id("user-name");
    private final By passwordInput = By.id("password");
    private final By loginButton = By.id("login-button");
    private final By logoButton = By.className("login_logo");
    private final By errormessagelocator = By.cssSelector("h3[data-test='error']");


    @Override
    public void verifyPage() {
        softAssert.assertTrue(find(usernameInput).isDisplayed());
        softAssert.assertTrue(find(passwordInput).isDisplayed());
        softAssert.assertTrue(find(loginButton).isDisplayed());
        softAssert.assertTrue(find(logoButton).isDisplayed());
        softAssert.assertAll();
    }

    public void fillData(String username, String password) {
        Logs.info("digitar username : %s ", username);
        find(usernameInput).sendKeys(username);
        Logs.info("digitar password : %s", password);
        find(passwordInput).sendKeys(password);
        Logs.info("clic");
        find(loginButton).click();
    }

    public void verifyErrorMessage(String errorMessage) {
        final var errorMsgElement = find(errormessagelocator);

        Logs.info("Verificar el mensaje de error");
        softAssert.assertTrue(errorMsgElement.isDisplayed());
        softAssert.assertEquals(errorMsgElement.getText(), errorMessage);
        softAssert.assertAll();
    }
}
