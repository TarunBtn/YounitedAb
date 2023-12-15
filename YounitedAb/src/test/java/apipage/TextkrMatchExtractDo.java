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
	      String baseURL = "https://younited-management-payment-acc.nowonline.nl/MatchExtractDo?Parsingtype=JobParsingtype";
	      // Form data
	      String publicURL = "https://usgmarcom.nl/vacature/data-driven-communicatiespecialist-haarlem-ai-(v2074905)";
	      
	      // Creating request specification
	      RequestSpecification request = RestAssured.given();
	                  
	      request.header("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCIsImtpZCI6IlcwYXpDb2U3QjQ1MGszWnBUc2t0RSJ9.eyJuaWNrbmFtZSI6ImxiK2FjYy1hZG1pbiIsIm5hbWUiOiJsYithY2MtYWRtaW5Abm93b25saW5lLm5sIiwicGljdHVyZSI6Imh0dHBzOi8vcy5ncmF2YXRhci5jb20vYXZhdGFyLzM3NzNkMjg2MDA4ZTQzMzQ5ZDBmYjk3YzY4YjkzOGMzP3M9NDgwJnI9cGcmZD1odHRwcyUzQSUyRiUyRmNkbi5hdXRoMC5jb20lMkZhdmF0YXJzJTJGbGIucG5nIiwidXBkYXRlZF9hdCI6IjIwMjMtMTItMTRUMTI6NTg6MzQuNTE2WiIsImVtYWlsIjoibGIrYWNjLWFkbWluQG5vd29ubGluZS5ubCIsImVtYWlsX3ZlcmlmaWVkIjpmYWxzZSwiaXNzIjoiaHR0cHM6Ly9hY2MteW91bml0ZWQuZXUuYXV0aDAuY29tLyIsImF1ZCI6ImY5UjFVZ2R5SXRKZ2M2NGozMldpZnRwNkRsbGE4WFZvIiwiaWF0IjoxNzAyNTU4NzE5LCJleHAiOjE3MDI3MzE1MTksInN1YiI6ImF1dGgwfDY0OWMyMDZlMTQwNTNmYWI1OGFkZmI0OSIsInNpZCI6Im9oV1dXWEJOSDJsM1Z6b0RTY3Z2R2lVN0YxN0tqN1VBIiwibm9uY2UiOiJNbFZWZGxseE5XdFRVbkppTVRsSVQzTmhXVEJDV2taUmVuVkVVbE5PYkc5WVRINW9kVU5OYWsxU1RnPT0ifQ.llAsmqylG4t_aA0QqP11swxlHBpI3NJIp1yjjG9vJblc27SX4QvhTVMec8ecxL2lVa3GKQ-6C3HpLGDXWWrqqe5E82RVElXDD2ACwCvEVeOPFzRWPMhkz-c5EaK0JI8bg4ckQYl262DWaSn8fAFcb7kFs5SWVxZO_olZV3lUFnnzT4namuQQjATMg46MSh5MVksIZsQ69Lhcqi9JzXxYFSbaykXEV9OgnrVetjjjmQwPaj0dXAujh-3o78ktXjr_cwTWTCUqPa52z8NSPD2g6XFsloEsCOs32Oc5OeF5bjSIx0bboW73UdYHntcFU4tN5v7iYe5ZS2rL176npkSlag");
	      //request.header("Content-Type", "application/json");
	      //Adding form data to the request
	      request.multiPart("publicURL", publicURL);
	      // Making POST request and capturing the response
	      Response response = request.post(baseURL);
	      int statusCode=response.getStatusCode();
	      System.out.println("status code :"+statusCode);
	      // Extracting and printing the response body
	      String responseBody = response.getBody().asString();
	      System.out.println("Response Body: " + responseBody);
			
			
		}
}
