package tests.API;

import Utilis.TestBase;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class GetRandomAdvice extends TestBase {
    @Test
    public void getRandomAdvice() {
        RestAssured.baseURI = "https://api.adviceslip.com/advice";
        Response response = given()
                .get();
        response.then().assertThat().statusCode(200);
        response.then().assertThat().body("slip.id", notNullValue());
        response.then().assertThat().body("slip.advice", notNullValue());
    }
}
