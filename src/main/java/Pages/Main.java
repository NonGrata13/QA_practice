package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Main {

//   public static void main(String... args){
//       WebDriverManager.chromedriver().setup();
//       ChromeDriver chromeDriver = null;
//       try {

//           chromeDriver = new ChromeDriver();
//           GooglePage googlePage = new GooglePage(chromeDriver);
//           googlePage.loadPage();
//           googlePage.acceptCookiesIfPresent();
//           googlePage.setSearchValue("test");
//           googlePage.search(true);

//   }   finally {
//           if (chromeDriver != null);
//           chromeDriver.quit();
//       }
//       }
public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();
    FindRandomUser searchPage = new FindRandomUser(driver);
    searchPage.open();
    searchPage.searchFor("Mark Montgomery");

    SearchResultsPage resultsPage = new SearchResultsPage(driver);
    List<String> results = resultsPage.getResults();

    System.out.println(results);
    driver.quit();
}

}
