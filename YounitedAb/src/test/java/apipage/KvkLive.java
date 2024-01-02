package apipage;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class KvkLive {
	
	@SuppressWarnings("unchecked")
	@Test
	public void validateKvkNumber() {
		
		RequestSpecification request=RestAssured.given();
		
		request.header("Content-Type", "application/json");
		request.header("APIKey", "052dc90b-9620-4dee-b464-c39b46cc0de4");
		
		JSONObject json=new JSONObject();
		json.put("key", "62153595");
		
		request.body(json.toJSONString());
		
		Response response=request.post("https://younited-management-payment-pro.nowonline.nl/ValidateKvknummer");
		int statusCode=response.getStatusCode();
		Assert.assertEquals(statusCode, 200);
		System.out.println("Kvk Status Code is-" +statusCode);
		
		String data=response.asPrettyString();
		System.out.println("Response data is-"+data);
		
			
	}

}
