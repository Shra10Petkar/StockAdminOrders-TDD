package CrudOperation;


import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.crm.generic_utility.BaseClass;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PostMethod extends BaseClass {

	
	@Test
	
	public void postMethod()
	{
		JSONObject obj=new JSONObject();
		
		obj.put("orderId", 13);
		obj.put("productName", "Laptop");
		obj.put("qtyOrder", 11);
		obj.put("qtyRecived", 11);
		obj.put("totalOrderCost", 95000);
		obj.put("totalOrderRecived", 11);
		
		given()
		.contentType(ContentType.JSON)
		.body(obj)
		.when()
		.post("/orders")
		.then()
		.assertThat().statusCode(200)
		.log().all();
	}
}
