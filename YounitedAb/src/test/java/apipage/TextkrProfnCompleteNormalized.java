package apipage;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class TextkrProfnCompleteNormalized {
	
	  @Test	
	  public void professionsCompleteNormalized() {
			
		    String baseUrl="https://younited-management-payment-pro.nowonline.nl/ProfessionsCompleteNormalized";  
		  
	        RequestSpecification request=RestAssured.given();
			request.header("Content-Type", "application/json");
			request.header("APIKey", "052dc90b-9620-4dee-b464-c39b46cc0de4");
			
			//JSONObject json=new JSONObject();
			//json.put("categories", "all");
			//json.put("prefix", "Front");
			//json.put("languages", "nl");
			//json.put("output_language", "nl");
			
			request.body("{ \"categories\": [ \"all\" ], \"prefix\": \"Front\", \"languages\": [ \"nl\" ], \"output_language\": \"nl\" }");
			
			//request.body(json.toJSONString());
			
			Response response=request.post(baseUrl);
			int code=response.getStatusCode();
			System.out.println("TextKernel- Status code is: "+code);
			
			Assert.assertEquals(code, 200);
			
			//String data=response.asString();
			String data=response.asPrettyString();
			System.out.println("Response data is: "+data);
						
		}

}
