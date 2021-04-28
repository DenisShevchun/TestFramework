package TestEpicentrByLynn;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class HomePage extends BasePage {
public HomePage(WebDriver driver) {super(driver);}
    public WebElement popupWindow() {
        return  getElement("//span[@class='_2qGxAC']"); }
    public WebElement searchField() {
        return getElement("//input[@class='field-container__field']");}
    public List<WebElement> buyBtns() {
        return getElements("//button[@class='add-product card__button " +
                "btn btn--yellow  js-btn--buy ']");}
    public WebElement continueShopping() {
        return getElement("//button[@class='btn btn--3 btn--white ']");}
    public List<WebElement> priceList() {
        return getElements("//p[@class='basket-product__price-main']");}
    public WebElement cartBtn() {
        return getElement("//span[@class='header__cart-icon']");}
}
