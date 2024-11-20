package tests;

import Utilis.BaseTest;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class GetNoAccessKeySent extends BaseTest {
    @Test
    public void getNoAccessKeySent() {
        Response response = given()
                .queryParam("query", "New%20Delhi")
                .get();
        response.then().assertThat().body("error.code", equalTo(101));
        response.then().assertThat().body("error.type", equalTo("missing_access_key"));
    }
}
