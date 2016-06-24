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
    }
    @Test(enabled = false)
    public void testHomePageHasAHeader() {
        Assert.assertFalse("Погода".equals(Pages.homePage(driver).header.getText()));
    }
    @Test(enabled = false)
    public void serchCity() throws InterruptedException {
        Pages.sinoptikMainPage(driver).htmlInit(driver);
        Pages.sinoptikMainPage(driver).searchCity("Маяки");
        Assert.assertTrue(Pages.sinoptikMainPage(driver).getTitle().contains("Маяки"));
    }
    @Test(enabled = true)
    public void serchCityNew() throws InterruptedException {
        sinoptikMainPage.htmlInit(driver);
        sinoptikMainPage.searchCity("Маяки");
        Thread.sleep(2000);
        Assert.assertTrue(sinoptikMainPage.header.getText().contains("Маяки"));
    }
    @AfterTest
    public void closeDriver() {
        driver.quit();
    }

}
