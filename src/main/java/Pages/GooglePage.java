package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GooglePage {
    private final WebDriver driver;
    private static final String URL = "https://google.com/";
    private static final By SEARCH_FIELD = By.name("q");
    private static final By NO_RESULTS = By.xpath("//p/span/..");

    public GooglePage(WebDriver driver) {
        this.driver = driver;
    }

    public void loadPage() {
        driver.get(URL);
    }

    public void search(String value) {
        WebElement search = driver.findElement(SEARCH_FIELD);
        search.sendKeys(value);
        search.sendKeys(Keys.ENTER);
    }
}
