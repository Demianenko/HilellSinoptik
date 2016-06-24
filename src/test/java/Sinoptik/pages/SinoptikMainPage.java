package Sinoptik.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;

/**
 * Created by sega on 21.06.16.
 */
public class SinoptikMainPage extends Page {
    private SearchArrow searchArrow;
    public void searchCity(String city) {
       searchArrow.search(city);
    }
    @FindBy(how = How.TAG_NAME, using = "h1")
    @CacheLookup
    public WebElement header;

    public void htmlInit(WebDriver driver){
        HtmlElementLoader.populatePageObject(this, driver);
    }

    public SinoptikMainPage(WebDriver driver) {
        super(driver);

    }

}
