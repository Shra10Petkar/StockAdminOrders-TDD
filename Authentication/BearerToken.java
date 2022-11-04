package Authentication;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class BearerToken {

	@Test
	
	public void bearerToken()
	{
		baseURI = "https://api.github.com";
		
		JSONObject obj = new JSONObject();
		obj.put("name", "StockAdminOrders-TDD");
		
		given().auth().oauth2("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")
		.body(obj).contentType(ContentType.JSON)
		.when().post("/user/repos")
		.then().log().all();
		
		
		
		
	}
	
}
