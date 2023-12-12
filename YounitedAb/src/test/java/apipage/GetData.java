package apipage;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetData {
	
	@Test
	public void testResponseCode() {
		
        Response resp=RestAssured.get("https://rahulshettyacademy.com/maps/api/place/get/json?key=qaclick123&place_id=246c793922866c26b389052697b58ec6");	
		int code=resp.getStatusCode();	
		System.out.println("Status code is: "+code);	
		Assert.assertEquals(code, 200);
				
	}
	
	public void testdataone() {
		Response resp=RestAssured.get("https://rahulshettyacademy.com/maps/api/place/get/json?key=qaclick123&place_id=246c793922866c26b389052697b58ec6");
		int scode=resp.getStatusCode();
		String data=resp.asString();
		System.out.println("status code is-"+scode);
		System.out.println("response data is-"+data);
		Assert.assertEquals(scode, 200);
		
	}
	
	@Test
	public void testBody() {
		
        Response resp=RestAssured.get("https://rahulshettyacademy.com/maps/api/place/get/json?key=qaclick123&place_id=246c793922866c26b389052697b58ec6");		
		String data=resp.asString();		
		System.out.println("Status code is: "+data);	
		System.out.println("Response Time: "+resp.getTime());		
			
	}
	
	@Test
	public void testdata() {
		Response resp=RestAssured.get("https://rahulshettyacademy.com/maps/api/place/get/json?key=qaclick123&place_id=246c793922866c26b389052697b58ec6");
		int statuscode=resp.getStatusCode();
		String data=resp.asString();
		System.out.println("Status code is: "+statuscode);
		System.out.println("Response data is: "+data);
		System.out.println("Response time: "+resp.getTime());
		
	}
	
	

}
