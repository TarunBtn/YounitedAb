package apipage;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TextkrProfessionsSuggestSkills {
	
	   @Test	
	   public void ProfessionsSuggestSkills() {
			
		    String baseUrl="https://younited-management-payment-pro.nowonline.nl/ProfessionsSuggestSkills?limit=15";
		    
			RequestSpecification request=RestAssured.given();
			request.header("Content-Type", "application/json");
			request.header("APIKey", "052dc90b-9620-4dee-b464-c39b46cc0de4");
			//request.header("limit", "15");
			//request.param("limit", 15);
			
			//JSONObject json=new JSONObject();
			//json.put("code_ids", "'5298'");
			
			request.body("{\"code_ids\": [\"5298\"]}");
			
			request.queryParams("limit", "15");
			
			//request.body(json.toJSONString()); 
			//request.param("limit", 15);
		
	        // Specify the content type as JSON
	        //request.contentType("application/json");
			
			Response response=request.post(baseUrl);
			int scode=response.getStatusCode();
			System.out.println("Status code: "+scode);
			Assert.assertEquals(scode, 200);
			
			String data=response.asPrettyString();
			System.out.println("Response data: "+data);
			

		}

}
