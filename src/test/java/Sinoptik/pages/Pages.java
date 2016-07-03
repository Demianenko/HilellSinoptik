package Sinoptik.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Sega on 21.06.2016.
 */
public class Pages {
    public static HomePage homePage(WebDriver driver){
        return PageFactory.initElements(driver,HomePage.class);
    }
    public static SinoptikMainPage sinoptikMainPage (WebDriver driver){
        return PageFactory.initElements(driver,SinoptikMainPage.class);
    }
    public static SinoptikMainPage sinoptikMainPage1 (WebDriver driver){
        return new SinoptikMainPage(driver);
    }
}
