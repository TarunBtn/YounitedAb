package apipage;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TextkrMatchExtractDo {

	  @SuppressWarnings("unchecked")
	  @Test	
	  public void MatchExtractDo()throws Exception {
			  
		  // Base URL
	      String baseURL = "https://younited-management-payment-pro.nowonline.nl/MatchExtractDo?Parsingtype=JobParsingtype";
	      // Form data
	      String publicURL = "https://usgmarcom.nl/vacature/adviseur-marketingcommunicatie-medior-(v2075654)";
	      
	      // Creating request specification
	      RequestSpecification request = RestAssured.given();
	                  
	      request.header("APIKey", "052dc90b-9620-4dee-b464-c39b46cc0de4");
	      //request.header("Content-Type", "application/json");
	      //Adding form data to the request
	      request.multiPart("publicURL", publicURL);
	      
	      Response response = request.post(baseURL);
	      int statusCode=response.getStatusCode();
	      System.out.println("status code :"+statusCode);
	      
	      String responseBody = response.getBody().asString();
	      System.out.println("Response Body: " + responseBody);
			
			
		}
}
