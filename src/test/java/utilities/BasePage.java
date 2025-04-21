package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import java.util.List;

public abstract class BasePage {

    protected final SoftAssert softAssert;

    public BasePage() {
        softAssert = new SoftAssert();
    }

    protected WebDriver getDriver() {
        return new WebDriverProvider().get();
    }

    protected WebElement find(By locator) {
        return getDriver().findElement(locator);
    }

    protected List<WebElement> findAll(By locator) {
        return getDriver().findElements(locator);
    }

    public abstract void verifyPage();
}
