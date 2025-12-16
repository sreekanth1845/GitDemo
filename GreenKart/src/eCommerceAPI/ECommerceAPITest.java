package eCommerceAPI;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;
import pojo.LoginRequest;
import pojo.LoginResponse;
import pojo.OrderDetails;
import pojo.Orders;

import static io.restassured.RestAssured.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ECommerceAPITest {

	public static void main(String[] args) {

		//User login
		RequestSpecification req = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
				.setContentType(ContentType.JSON).build();

		LoginRequest loginRequest = new LoginRequest();
		loginRequest.setUserEmail("sreek@gmail.com");
		loginRequest.setUserPassword("Srikanth1$");

		RequestSpecification reqLogin = given().relaxedHTTPSValidation().log().all().spec(req).body(loginRequest);
		LoginResponse loginResponse = reqLogin.when().post("/api/ecom/auth/login").then().log().all().extract().as(LoginResponse.class);

		String token = loginResponse.getToken();
		String userId = loginResponse.getUserId();
		System.out.println(token);
		
		//Add Product		
		RequestSpecification addProduct = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com").addHeader("authorization", token).build();
		
		RequestSpecification reqAddProduct = given().log().all().spec(addProduct).param("productName", "qwerty").param("productAddedBy", userId).param("productCategory", "fashion")
											   .param("productSubCategory", "shirts")
											   .param("productPrice", "11500").param("productDescription", "Addias Originals").param("productFor", "women")
											   .multiPart("productImage", new File("C:\\Users\\sreek\\Downloads\\shirt-44112.jpg"));
		
		String addProductResponse = reqAddProduct.when().post("/api/ecom/product/add-product").then().log().all().extract().response().asString();
		
		JsonPath jsonPath = new JsonPath(addProductResponse);
		String productId = jsonPath.get("productId");
		System.out.println(productId);
		
		//Create Order
		RequestSpecification reqCreate = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com").addHeader("authorization", token).setContentType(ContentType.JSON).build();
		
		OrderDetails orderDetails = new OrderDetails();
		orderDetails.setCountry("India");
		orderDetails.setProductOrderedId(productId);
		
		List<OrderDetails> orderDetailsList = new ArrayList<OrderDetails>();
		orderDetailsList.add(orderDetails);
		
		Orders orders = new Orders();
		orders.setOrders(orderDetailsList);
		
		RequestSpecification reqCreateOrder = given().log().all().spec(reqCreate).body(orders);
		String orderResponse = reqCreateOrder.when().post("/api/ecom/order/create-order").then().log().all().extract().response().asString();
		System.out.println(orderResponse);
		
		//Delete Product
		RequestSpecification reqDelete = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com").addHeader("authorization", token).setContentType(ContentType.JSON).build();
		
		RequestSpecification reqDeleteProduct = given().log().all().spec(reqDelete).pathParam("productId", productId);
		String deleteResponse = reqDeleteProduct.when().delete("/api/ecom/product/delete-product/{productId}").then().log().all().extract().response().asString();
		System.out.println(deleteResponse);
		
	}

}
