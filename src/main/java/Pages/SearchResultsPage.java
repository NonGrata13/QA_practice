package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SearchResultsPage {
    private WebDriver driver;
    private By searchResults = By.xpath("//div[@class='g']//h3");

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
    }
    Duration timeout = Duration.ofSeconds(10);

    public List<String> getResults() {
        List<WebElement> searchResultElements = new WebDriverWait(driver, timeout)
                .until(ExpectedConditions.presenceOfAllElementsLocatedBy(searchResults));
        return searchResultElements.stream()
                .map(WebElement::getText)
                .filter(text -> text.contains("Mark Montgomery"))
                .collect(Collectors.toList());
    }
}
