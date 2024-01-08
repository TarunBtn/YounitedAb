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
	      String publicURL = "https://usgmarcom.nl/vacature/externe-communicatieadviseur-vwm-rws-ai-(v2075970)";
	      
	      // Creating request specification
	      RequestSpecification request = RestAssured.given();
	                  
	      request.header("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCIsImtpZCI6IlcwYXpDb2U3QjQ1MGszWnBUc2t0RSJ9.eyJuaWNrbmFtZSI6ImxiK2FjYy1hZG1pbiIsIm5hbWUiOiJsYithY2MtYWRtaW5Abm93b25saW5lLm5sIiwicGljdHVyZSI6Imh0dHBzOi8vcy5ncmF2YXRhci5jb20vYXZhdGFyLzM3NzNkMjg2MDA4ZTQzMzQ5ZDBmYjk3YzY4YjkzOGMzP3M9NDgwJnI9cGcmZD1odHRwcyUzQSUyRiUyRmNkbi5hdXRoMC5jb20lMkZhdmF0YXJzJTJGbGIucG5nIiwidXBkYXRlZF9hdCI6IjIwMjQtMDEtMDhUMDc6MDg6MzguOTE5WiIsImVtYWlsIjoibGIrYWNjLWFkbWluQG5vd29ubGluZS5ubCIsImVtYWlsX3ZlcmlmaWVkIjpmYWxzZSwiaXNzIjoiaHR0cHM6Ly9hY2MteW91bml0ZWQuZXUuYXV0aDAuY29tLyIsImF1ZCI6ImY5UjFVZ2R5SXRKZ2M2NGozMldpZnRwNkRsbGE4WFZvIiwiaWF0IjoxNzA0Njk3NzI1LCJleHAiOjE3MDQ4NzA1MjUsInN1YiI6ImF1dGgwfDY0OWMyMDZlMTQwNTNmYWI1OGFkZmI0OSIsImF1dGhfdGltZSI6MTcwNDY5NzcxOCwic2lkIjoiLWFHX19QYkVBbDdNUDAyNkdSM3d6MVRvd19SLU1MM3MifQ.t071rp8rZEMbfG0uDdQQXsqeCtqDSWJ2XlqCjqZ_fVaGVPpVH7_loDLfeNy5dF8Why2dqDRVspAYWa72oYjX1ih52ISiYyeONvYAdHRHq50pepyDb58d5IRLNIUxsYgkNGWmdMvpKpBsM4i2iQ6G0ALPiDBYtE3DvXgqDiezhEby_YieqlhGluDrtevdbCsQ62lp5JDYlW7DM7l0PSbbFAM8W5N8zit8TLctO8TtadLHho21RhO6nf4_YKYoEPVOKSSKaCV3xmZbqlhGzYfY7uWU4U2W4Z6nZDHCrC4chys2SmqM4cu5FJn0Q7kqDkvRhUouAdwsonIqH9gZr-hrUw");
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
