package tests.API;

import Utilis.TestBase;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class GetNoQuerySent extends TestBase {
    @Test
    public void getNoQuerySent() {
        RestAssured.baseURI = "https://api.weatherstack.com/current";
        Response response = given()
                .queryParam("access_key", "cf9956ef6aa96e1a50e4dfc14dca1d2f")
                .get();
        response.then().assertThat().body("error.code", equalTo(601));
        response.then().assertThat().body("error.type", equalTo("missing_query"));
    }
}
