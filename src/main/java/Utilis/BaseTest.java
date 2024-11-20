package Utilis;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    @BeforeClass
    public void setupWeather() {

        RestAssured.baseURI = "https://api.weatherstack.com/current";
    }

    protected void setBaseURI(String baseUri) {
        RestAssured.baseURI = baseUri;
    }

}
