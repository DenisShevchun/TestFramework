import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestAmazon extends TestInit{

    @Test
    public void testCart(){
        HomePageAmazon homePageAmazon = new HomePageAmazon(driver);
        openUrl("https://www.amazon.com/");
        homePageAmazon.tapToSearchField().sendKeys("caps");
        pushBtnReturn();
        homePageAmazon.chooseItem().get(0).click();
        moveMouseToElement(homePageAmazon.chooseSize());
        homePageAmazon.chooseSize().click();
        homePageAmazon.chooseSizeLargeX().click();
        moveMouseToElement(homePageAmazon.addItemToCard());
        sleep(3);
        homePageAmazon.addItemToCard().click();
        homePageAmazon.openCard();
    }
}
