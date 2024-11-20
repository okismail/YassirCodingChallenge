package tests;

import Utilis.BaseTest;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetRandomAdviceIncorrectFieldName extends BaseTest {
    @BeforeClass
    public void init() {
        setBaseURI("https://api.adviceslip.com/adviceasd");
    }

    @Test
    public void GetRandomAdviceIncorrectFieldName() {
        Response response = given()
                .get();
        response.then().assertThat().statusCode(404);
        response.then().assertThat().statusLine("HTTP/1.1 404 Not Found");
    }
}
