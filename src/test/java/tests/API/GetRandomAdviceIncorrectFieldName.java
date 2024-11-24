package tests.API;

import Utilis.TestBase;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetRandomAdviceIncorrectFieldName extends TestBase {
    @Test
    public void GetRandomAdviceIncorrectFieldName() {
        RestAssured.baseURI = "https://api.adviceslip.com/advice";
        Response response = given()
                .get();
        response.then().assertThat().statusCode(404);
        response.then().assertThat().statusLine("HTTP/1.1 404 Not Found");
    }
}
