package tests;

import Utilis.BaseTest;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class GetInvalidLocationWeather extends BaseTest {
    @Test
    public void getInvalidLocationWeather() {
        Response response = given()
                .queryParam("access_key", "cf9956ef6aa96e1a50e4dfc14dca1d2f")
                .queryParam("query", "asdasdasd123")
                .get();
        response.then().assertThat().body("error.code", equalTo(615));
        response.then().assertThat().body("error.type", equalTo("request_failed"));
    }
}
