package test.java;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import dto.PersonDto;
import dto.RootDto;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GooglePage;

import java.util.List;
import java.util.stream.Collectors;

public class TestPerson {
    private static WebDriver driver;
    private static GooglePage googlePage;
    private String person;

    @BeforeAll
    public static void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        googlePage = new GooglePage(driver);
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }

    @Test
    public void restTest() throws JsonProcessingException {
        Response response = RestAssured.get("https://randomuser.me/api/?inc=gender,name,nat&results=20");
        RootDto rootDto = response.body().as(RootDto.class);

        List<PersonDto> persons = rootDto.getResults();
        System.out.println(objectToString(rootDto));

        List<PersonDto> femaleGender = persons.stream().filter(personDto -> personDto.getGender().equals("female")).collect(Collectors.toList());
        System.out.println(femaleGender.size() + " persons found with gender 'female'");
        System.out.println("SEED: " + rootDto.getInfo().getSeed());

        person = femaleGender.get(0).getName().getFirst() + " " + femaleGender.get(0).getName().getLast();
        System.out.println("PERSON: " + person);

        googlePage.loadPage();

        // Test must be failed
//        googlePage.search("оппдырпжяловпржлоаржду");

        // Test must be passed
        googlePage.search((person));

        Assertions.assertNotEquals("", driver.findElement(By.id("search")).getText(), "No results found for request");

        System.out.println("==================================");
        System.out.println("Search results for '" + person + "' in Google:" );
        System.out.println(driver.findElement(By.xpath("//div/nobr/..")).getText());
    }

    private String objectToString(Object dto) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(dto);
    }

}
