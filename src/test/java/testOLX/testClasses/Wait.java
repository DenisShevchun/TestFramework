package testOLX.testClasses;

import org.openqa.selenium.WebElement;

public interface Wait {
    void wait(int sec);
    WebElement waitTillElementClickable(String locator);
}
