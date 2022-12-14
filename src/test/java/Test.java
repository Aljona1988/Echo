import io.restassured.mapper.ObjectMapper;
import io.restassured.specification.Argument;

import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;


class EchoTest {

    @Test
    void shouldSendReply() {

        given()
                .baseUri("https://postman-echo.com")
                .body("birthday : 12.06.1990")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("birthday : 12.06.1990"));
    }
}

