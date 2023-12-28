package dev.jba;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

@QuarkusTest
class ProfileResourceTest {
    @Test
    void testHelloEndpoint() {
        given().when().get("/hello").then().statusCode(200).body("count", equalTo(0));
    }

}
