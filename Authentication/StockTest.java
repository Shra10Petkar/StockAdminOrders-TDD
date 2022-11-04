package Authentication;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.generic_utility.EndPoints;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojoClass.ProjectLibrary;

import static io.restassured.RestAssured.*;
public class StockTest {     

	@Test(dataProvider="fetchDataProvider")
	
	public void stockTest(int orderId,String productName,int qtyOrder,
			double qtyRecived,double totalOrderCost,double totalOrderRecived)
	{
		baseURI = "http://localhost:8080";
		
		ProjectLibrary plib = new ProjectLibrary(orderId,productName,qtyOrder,
				qtyRecived,totalOrderCost,totalOrderRecived);
		Response res1=given().body(plib).contentType(ContentType.JSON)
				.when().post(EndPoints.postcreateorder);
		res1.then().log().all();
		
//		
//		Response res2 = when().get(EndPoints.getcreate);
//		res2.then().log().all();
//		
//		Response res3 = when().get(EndPoints.getbyid);
//		res3.then().log().all();
		
//		Response res4 = when().delete(EndPoints.deletecreate);
//		res4.then().log().all();
		
	}
	
	@DataProvider
	
	public Object[][] fetchDataProvider()
	{
		Object[][] obj = new Object[2][6];
		obj[0][0] = 13;
		obj[0][1] = "Laptop";
		obj[0][2] = 11;
		obj[0][3] = 11;
		obj[0][4] = 95000;
		obj[0][5] = 11;
		
		obj[1][0] = 12;
		obj[1][1] = "TShirt";
		obj[1][2] = 100;
		obj[1][3] = 100;
		obj[1][4] = 20000;
		obj[1][5] = 100;
		
		return obj;
		
		
		
	}
	
}
