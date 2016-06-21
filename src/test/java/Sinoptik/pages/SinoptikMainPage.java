package Sinoptik.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by sega on 21.06.16.
 */
public class SinoptikMainPage extends Page {

    @FindBy(how = How.XPATH, using = "//*[@id=\"search_city\"]")
    @CacheLookup
    public WebElement searchField;


    @FindBy(how = How.XPATH, using = "//*[@class=\"search_city-submit\"]")
    @CacheLookup
    public WebElement searchButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"next\"]")
    @CacheLookup
    public WebElement nexButton;

    public void searchCity(String city) {
        searchField.clear();
        searchField.sendKeys(city);
        searchButton.click();
    }

    public SinoptikMainPage(WebDriver driver) {
        super(driver);
    }
}
