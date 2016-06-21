package Sinoptik;

import Sinoptik.pages.Pages;
import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Sinoptik.pages.HomePage;

public class SampleTestNgTest extends TestNgTestBase {



    @Test(enabled = false)
    public void testHomePageHasAHeader() {
      driver.get(baseUrl);
      Assert.assertFalse("Погода".equals(Pages.homePage(driver).header.getText()));
    }
    @Test
    public void serchCity() throws InterruptedException {
        driver.get(baseUrl);
        Thread.sleep(2000);
        Pages.sinoptikMainPage(driver).searchCity("Маяки");
        Thread.sleep(2000);
        Assert.assertTrue(Pages.sinoptikMainPage(driver).getTitle().contains("Маяки"));
    }

}
