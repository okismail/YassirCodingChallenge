package Utilis;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;

public class BaseTestClass {
    @BeforeClass
    public void setup() {

        RestAssured.baseURI = "https://api.weatherstack.com/current";
    }

}
