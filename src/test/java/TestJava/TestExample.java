package TestJava;

import Pages.GooglePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.jetbrains.annotations.TestOnly;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestExample {
   private static WebDriver driver;
   private static GooglePage googlePage;
    @BeforeAll
    public static void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        googlePage = new GooglePage(driver);
    }
    @AfterAll
    public static void tearDown(){
        driver.quit();
    }
    @Test
    public void myBaseTest(){
        googlePage.loadPage();
        googlePage.setSearchValue("test01");
        googlePage.search(true);
    }
    @Test
    public void anotherBeseTest(){
        System.out.println("Hell to another test");
    }
}
