package apipage;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class TextkrCompleteNormalized {
	
	@SuppressWarnings("unchecked")
	  @Test	
	  public void completeNormalized() {
			
			RequestSpecification request=RestAssured.given();
			
			request.header("Content-Type", "application/json");
			request.header("APIKey", "052dc90b-9620-4dee-b464-c39b46cc0de4");
			
			//JSONObject json=new JSONObject();
			//json.put("categories", "all");
			//json.put("prefix", "Postman");
			//json.put("languages", "nl");
			//json.put("output_language", "nl");
			
			//request.body(json.toJSONString());
			/*List<String> categories = new ArrayList<String>();
			// Create categories array
	        //JSONArray categoriesArray = new JSONArray();
			request.put("categories", categories);
			categories.add("all");
	        // Create languages array
	        //JSONArray languagesArray = new JSONArray();
	        
	        List<String> categorie = new ArrayList<String>();
	        categorie.add("nl");
	        // Create the request body JSON object
	        //JSONObject requestBody = new JSONObject();
	        
	        request.put("prefix", "Postman");
	        request.put("languages", categorie);
	        request.put("output_language", "nl");*/
			
			request.body("{ \"categories\": [ \"all\" ], \"prefix\": \"Postman\", \"languages\": [ \"nl\" ], \"output_language\": \"nl\" }");
			
			//request.body(json.toString());
			
			Response response=request.post("https://younited-management-payment-pro.nowonline.nl/CompleteNormalized");
			
			int code=response.getStatusCode();
			System.out.println("Textkernel- Status code is: "+code);
			
			Assert.assertEquals(code, 200);
			
			//String data=response.getBody().asString();
			String data=response.asPrettyString();
			System.out.println("Response data is: "+data);
			
					
		}

}
