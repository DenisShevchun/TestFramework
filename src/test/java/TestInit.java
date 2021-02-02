import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestInit {
    WebDriver driver;

    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    public void openUrl(String site) {
        driver.get(site);
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }


    //when you need to push the "enter"
    public void pushBtnReturn() {
        Actions action = new Actions(driver);
        action.sendKeys(Keys.RETURN);
        action.perform();
    }
}
