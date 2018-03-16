import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APItest {

    @Test
    public void testAPI() {
        System.out.println("Test started");
        RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.request(Method.GET, "/Hyderabad");
        String responseBody = response.getBody().asString();
        System.out.println("Response Body is =>  " + responseBody);
    }
}
