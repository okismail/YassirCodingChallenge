package tests;

import Utilis.BaseTest;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class GetRandomAdvice extends BaseTest {
    @BeforeClass
    public void init() {
        setBaseURI("https://api.adviceslip.com/advice");
    }

    @Test
    public void getRandomAdvice() {
        Response response = given()
                .get();
        response.then().assertThat().statusCode(200);
        response.then().assertThat().body("slip.id", notNullValue());
        response.then().assertThat().body("slip.advice", notNullValue());
    }
}
