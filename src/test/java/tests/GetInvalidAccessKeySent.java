package tests;

import Utilis.BaseTest;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class GetInvalidAccessKeySent extends BaseTest {
    public void getInvalidAccessKeySent() {
        Response response = given()
                .queryParam("access_key", "cf9956ef6aa96e1a50e4dfc14dca1d2fa")
                .queryParam("query", "New%20Delhi")
                .get();
        response.then().assertThat().body("error.code", equalTo(101));
        response.then().assertThat().body("error.type", equalTo("invalid_access_key"));
    }
}
