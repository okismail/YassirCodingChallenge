package tests;

import Utilis.BaseTestClass;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class GetValidLocationWeather extends BaseTestClass {
    @Test
    public void getValidLocationWeather() {
        Response response = given()
                .queryParam("access_key", "cf9956ef6aa96e1a50e4dfc14dca1d2f")
                .queryParam("query", "New%20Delhi")
                .get();
        response.then().assertThat().statusCode(200);
        response.then().assertThat().body("location.name", equalTo("New Delhi"));
    }
}
