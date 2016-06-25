package Sinoptik;

import Sinoptik.pages.Pages;
import Sinoptik.pages.SinoptikMainPage;
import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Sinoptik.pages.HomePage;

public class SampleTestNgTest extends TestNgTestBase {

    private SinoptikMainPage sinoptikMainPage = new SinoptikMainPage(driver);

    @BeforeMethod
    public void loadPage() {
        driver.get(baseUrl);
        System.out.println("No No");
    }

    /*@Test(enabled = false)
    public void testHomePageHasAHeader() {
        Assert.assertFalse("Погода".equals(Pages.homePage(driver).header.getText()));
    }
    @Test(description = "good",enabled = false) //не работает
    public void serchCity() throws InterruptedException {
        Pages.sinoptikMainPage(driver).htmlInit(driver);
        Pages.sinoptikMainPage(driver).searchCity("Маяки");
        Assert.assertTrue(Pages.sinoptikMainPage(driver).getTitle().contains("Маяки"));
    }*/
    @Test(description = "bad",enabled = true) //работает
    public void serchCityNew() throws InterruptedException {
        sinoptikMainPage.htmlInit(driver); // -- в примере делают этот этап через конструктор, у меня через канструктор
        // не выходит, только так
        sinoptikMainPage.searchCity("Kiev");
        Thread.sleep(2000);
        Assert.assertTrue(sinoptikMainPage.header.getText().contains("Киев"));
    }
    @AfterTest
    public void closeDriver() {
        driver.quit();
    }

}
