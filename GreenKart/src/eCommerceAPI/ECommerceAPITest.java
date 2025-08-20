package eCommerceAPI;

import org.apache.http.client.methods.RequestBuilder;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;

public class ECommerceAPITest {

	public static void main(String[] args) {
		
		RequestSpecification requestSpecification = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com").build();
		
		given().spec(requestSpecification).body("");
	}

}
