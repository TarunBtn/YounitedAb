package apipage;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class TextkrCompleteNormalizedLive {
	
	@Test
	public void completeNormalized() {
		
		String baseUrl="https://younited-management-payment-pro.nowonline.nl/CompleteNormalized";
		
		RequestSpecification request=RestAssured.given();
		request.header("Content-Type", "application/json");
		request.header("APIKey", "052dc90b-9620-4dee-b464-c39b46cc0de4");
		
		//JSONObject json=new JSONObject();
		//json.put("", "")
		
		request.body("{\"categories\": [\"all\"], \"prefix\": \"Postman\", \"languages\": [\"nl\"], \"output_language\": \"nl\" }");
		
		//request.body(json.toJSONString());
		
		Response response=request.post(baseUrl);
		int statusCode=response.getStatusCode();
		Assert.assertEquals(statusCode, 200);
		System.out.println("Textkr-Status code is-" +statusCode);
		
		String data=response.asPrettyString();
		System.out.println("Response data is- "+data);
		
		
		
		
		
	}

}
