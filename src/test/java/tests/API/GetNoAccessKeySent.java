package tests.API;

import Utilis.TestBase;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class GetNoAccessKeySent extends TestBase {
    @Test
    public void getNoAccessKeySent() {
        RestAssured.baseURI = "https://api.weatherstack.com/current";
        Response response = given()
                .queryParam("query", "New%20Delhi")
                .get();
        response.then().assertThat().body("error.code", equalTo(101));
        response.then().assertThat().body("error.type", equalTo("missing_access_key"));
    }
}
