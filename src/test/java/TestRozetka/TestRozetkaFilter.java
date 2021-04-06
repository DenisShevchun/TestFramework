package TestRozetka;

import ClasesToAllUs.TestInit;
import TestRozetka.Pages.HomePageRozetka;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.LinkedList;
import java.util.List;

public class TestRozetkaFilter extends TestInit {
    @Test
    public void testRozetkaFilter() {
        HomePageRozetka homePageRozetka = new HomePageRozetka(driver);
        openUrl("https://rozetka.com.ua");
        homePageRozetka.searchFild().click();
        homePageRozetka.searchFild().sendKeys("холодильник\n");
        homePageRozetka.catalogSettingzSorting().click();
        homePageRozetka.catalogSettingzSortingChildren().stream().skip(1).findFirst().get().click();
        List<String> list = new LinkedList<>();
        sleep(4);
        for (WebElement element : homePageRozetka.allGoolsCost()) {
            list.add(element.getText());
        }
        System.out.println(list);
    }
}