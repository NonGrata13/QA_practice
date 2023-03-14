package TestJava;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class RestTest {
    @Test
    public void restTest(){
        HashMap<String, String> qeuryParams = new HashMap<>();
        qeuryParams.put("inc", "gender,name,nat");
        qeuryParams.put("noinfo", "true");
        qeuryParams.put("results", "20");
        RequestSpecification specification = RestAssured.given();
        specification.basePath("https://randomuser.me/api/");
        specification.queryParams(qeuryParams);
        ResponseSpecification response = specification.then();
        RestAssured.get("https://randomuser.me/api/?inc=gender,name,nat&results=20")
                .body()
                .prettyPrint();
    }
}
