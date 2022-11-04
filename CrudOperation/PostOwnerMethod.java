package CrudOperation;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PostOwnerMethod {

	@Test
	
	public void postOwnerMethod()
	{
		JSONObject obj=new JSONObject();
		
		obj.put("address", "Nashik");
		obj.put("comapnyName", "Cognizant");
		obj.put("department", "IT");
		obj.put("email", "aartipatne13@gmail.com");
		obj.put("name", "Aarti");
		obj.put("password", "Aarti@806");
		obj.put("phone","7564290517");
		
		
		given()
		.contentType(ContentType.JSON)
		.body(obj)
		.when()
		.post("/owner")
		.then()
		.assertThat().statusCode(200)
		.log().all();
	}
	
}
