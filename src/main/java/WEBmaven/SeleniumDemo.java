package WEBmaven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {
    public  static void main(String... args){
        WebDriverManager.chromedriver().setup();
        ChromeDriver chromeDriver = null;
        try {
            chromeDriver = new ChromeDriver();
            chromeDriver.get("https://www.google.com");
            WebElement search = chromeDriver.findElement(By.name("q"));
            search.sendKeys("test");
            search.sendKeys(Keys.RETURN);
        } finally {
            if (chromeDriver != null);
            chromeDriver.quit();


        }
}}
