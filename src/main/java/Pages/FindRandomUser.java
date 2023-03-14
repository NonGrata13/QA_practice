package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class FindRandomUser {
    private WebDriver driver;
    private By searchBox = By.name("q");
    private By searchButton = By.name("btnK");
    Duration timeout = Duration.ofSeconds(10);


    public FindRandomUser(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://www.google.com");
    }

    public void searchFor(String keyword) {
        WebElement searchInput = new WebDriverWait(driver, timeout)
                .until(ExpectedConditions.presenceOfElementLocated(searchBox));
        searchInput.clear();
        searchInput.sendKeys(keyword);
        WebElement searchButton = new WebDriverWait(driver, timeout)
                .until(ExpectedConditions.elementToBeClickable(this.searchButton));
        searchButton.click();
    }
}


