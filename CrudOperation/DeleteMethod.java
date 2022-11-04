package CrudOperation;

import org.testng.annotations.Test;

import com.crm.generic_utility.BaseClass;

import static io.restassured.RestAssured.*;
public class DeleteMethod extends BaseClass {

	@Test
	
	public void deleteMethod()
	{
		baseURI = "http://localhost:8080";
		
		when()
		.delete("/orders?id=15")
		
		.then()
		.assertThat().statusCode(200)
		.log().all();
	}
}
