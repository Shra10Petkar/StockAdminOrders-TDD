package CrudOperation;

import org.testng.annotations.Test;

import com.crm.generic_utility.BaseClass;

import static io.restassured.RestAssured.*;
public class GetMethod extends BaseClass{

	@Test
	
	public void getMethod()
	{
		baseURI ="http://localhost:8080";
		
		when()
		.get("/orders")
		
		.then()
		.assertThat().statusCode(200)
		.log().all();
	}
}
