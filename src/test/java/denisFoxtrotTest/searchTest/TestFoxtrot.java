package denisFoxtrotTest.searchTest;

import ClasesToAllUs.TestInit;
import denisFoxtrotTest.foxPages.HomePageFoxtrot;
import org.junit.Assert;
import org.testng.annotations.Test;

public class TestFoxtrot extends TestInit {

    @Test
    public void testSearch() {
        HomePageFoxtrot homePageFoxtrot = new HomePageFoxtrot(driver);
        openUrl("https://www.foxtrot.com.ua/");
        homePageFoxtrot.getSearch().sendKeys("Холодильник\n");
    }
}