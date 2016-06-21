package Sinoptik;

import Sinoptik.pages.Pages;
import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Sinoptik.pages.HomePage;

public class SampleTestNgTest extends TestNgTestBase {



  @Test
  public void testHomePageHasAHeader() {
    driver.get(baseUrl);
    Assert.assertFalse("Погода".equals(Pages.homePage(driver).header.getText()));
  }
}
