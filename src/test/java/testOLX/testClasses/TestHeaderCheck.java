package testOLX.testClasses;

import ClasesToAllUs.TestInit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testOLX.pages.HomePage;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestHeaderCheck extends TestInit implements Wait {

    @Test
    public void header() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://www.olx.ua/");
        if(homePage.olxLogo().isDisplayed()) {
            System.out.println("Logo displayed.");
            homePage.olxLogo().click();
        }
        if(homePage.changeLang().isDisplayed()) {
            System.out.println("Language change buttons are displayed.");
            homePage.changeLang().click();
        }
        if(homePage.favorite().isDisplayed()) {
            System.out.println("'Favorite products' button is displayed.");
            homePage.favorite().click();
        }
        if(homePage.olxLogin().isDisplayed()) {
            System.out.println("Login button is displayed.");
            homePage.olxLogin().click();
        }
        if(homePage.newPost().isDisplayed()) {
            System.out.println("'Add new post' button is displayed.");
            homePage.newPost().click();
        }
    }

    @Override
    public void wait(int sec) {
        driver.manage().timeouts().pageLoadTimeout(sec, TimeUnit.SECONDS);
    }

    @Override
    public WebElement waitTillElementClickable(String locator) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
    }
}
