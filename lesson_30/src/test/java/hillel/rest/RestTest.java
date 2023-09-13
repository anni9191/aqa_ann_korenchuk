package hillel.rest;

import hillel.rest.dto.FullUserInfo;
import hillel.rest.dto.ResponceData;
import hillel.rest.dto.User;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RestTest {

    private static RequestSpecification requestSpecification;

    @BeforeAll
    public static void init() {
        requestSpecification = new RequestSpecBuilder()
                .setBaseUri("https://reqres.in/")
                .setContentType(ContentType.JSON)
//                .addFilter(new RequestLoggingFilter())
//                .addFilter(new ResponseLoggingFilter())
                .build();
    }

    @Test
    public void getUser() {
        Response response = RestAssured.given()
                .spec(requestSpecification)
                .get("api/users?page=2")
                .thenReturn();
        response.then().statusCode(200);
    }


    @Test
    public void deleteUser() {
        Response response = RestAssured.given()
                .spec(requestSpecification)
                .delete("api/users/2")
                .thenReturn();
        response.then().statusCode(204);
    }

    @Test
    public void registerUser() {

        User expected = new User();
        expected.setId ("4");
        expected.setToken("QpwL5tke4Pnpja7X4");

        User user2 = RestAssured.given()
                .spec(requestSpecification)
                .when()
                .body(expected)
                .post("api/register")
                .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .extract()
                .as(User.class);
        assertThat(user2).isEqualToIgnoringGivenFields(expected, "name", "job", "createdAt");

        Assertions.assertEquals(user2.getId(), "4");
    }

    @Test
    public void updateUser() {

        User expected = new User();
        expected.setName("morpheus");
        expected.setJob("zion resident");
        expected.setUpdatedAt("2023-09-13T12:57:22.019Z");

        User user3 = RestAssured.given()
                .spec(requestSpecification)
                .when()
                .body(expected)
                .put("api/users/2")
                .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .extract()
                .as(User.class);
        assertThat(user3).isEqualToIgnoringGivenFields(expected, "id", "token", "createdAt");

        Assertions.assertEquals(user3.getUpdatedAt(), "2023-09-13T12:57:22.019Z");
    }

    @Test
    public void getUsers() {

        Response response = RestAssured.given()
                .spec(requestSpecification)
                .when()
                .param("page", 2)
                .get("api/users")
                .thenReturn();
        response.then().statusCode(200);
    }

    @Test
    public void createUser() {

        User expected = new User();
        expected.setName("morpheus");
        expected.setJob("lid");

//        User
//                .builder()
//                .name("morpheus")
//                .job("lid")
//                .build();
        User user1 = RestAssured.given()
                .spec(requestSpecification)
                .when()
                .body(expected)
                .post("api/users")
                .then()
                .statusCode(201)
                .contentType(ContentType.JSON)
                .extract()
                .as(User.class);
        assertThat(user1).isEqualToIgnoringGivenFields(expected, "id", "createdAt");

        Assertions.assertEquals(user1.getName(), "morpheus");
    }

    @Test
    public void getUser2() {
        Response response = RestAssured.given()
                .spec(requestSpecification)
                .get("api/users?page=2")
                .thenReturn();
        response.then().statusCode(200);
        ResponceData data = response.then()
                .extract()
                .body()
                .jsonPath()
                .getObject("data", ResponceData.class);
        String id = response.then()
                .extract()
                .body()
                .jsonPath()
                .getString("data.id");
        System.out.println(id);
        System.out.println(data);
    }

    @Test
    public void getUsers1() {

        String id = RestAssured.given()
                .spec(requestSpecification)
                .when()
                .param("page", 2)
                .get("api/users")
                .then()
                .extract()
                .body()
                .jsonPath()
                .getString("data[0],id");
        System.out.println(id);
    }

    @Test
    public void getUsers2() {

        FullUserInfo id = RestAssured.given()
                .spec(requestSpecification)
                .when()
                .get("api/users/2")
                .then()
                .extract()
                .as(FullUserInfo.class)
        System.out.println(id);

    }
}
