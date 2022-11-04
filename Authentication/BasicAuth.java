package Authentication;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class BasicAuth {

	
	@Test
	
	public void basicAuth()
	{
		baseURI = "https://github.com/";
		
		given().auth().basic("Shra10Petkar", "Shraddha@1308")
		.when().get("/login")
		.then().log().all();
	}
	
}
