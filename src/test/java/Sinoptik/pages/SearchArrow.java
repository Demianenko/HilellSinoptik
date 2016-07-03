package Sinoptik.pages;

import Sinoptik.util.Log;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import ru.yandex.qatools.htmlelements.annotations.Block;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.TextInput;

/**
 * Created by Sega on 24.06.2016.
 */
    @Name("Search form")
    @Block(@FindBy(xpath = "//*[@id=\"form-search\"]"))
    public class SearchArrow extends HtmlElement {
        @Name("Search request input")
        @FindBy(xpath = "//*[@id=\"search_city\"]")
        private TextInput requestInput;

        @Name("Search button")
        @FindBy(xpath = "//*[@class=\"search_city-submit\"]")
        private Button searchButton;

        public void search(String request) {
            Log.info("Set city " + request);
            requestInput.sendKeys(request);
            Log.info("Click button");
            searchButton.click();
        }

}
