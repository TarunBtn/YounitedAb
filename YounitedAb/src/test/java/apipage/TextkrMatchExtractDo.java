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
	                  
	      request.header("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCIsImtpZCI6IlcwYXpDb2U3QjQ1MGszWnBUc2t0RSJ9.eyJuaWNrbmFtZSI6ImxiK2FjYy1hZG1pbiIsIm5hbWUiOiJsYithY2MtYWRtaW5Abm93b25saW5lLm5sIiwicGljdHVyZSI6Imh0dHBzOi8vcy5ncmF2YXRhci5jb20vYXZhdGFyLzM3NzNkMjg2MDA4ZTQzMzQ5ZDBmYjk3YzY4YjkzOGMzP3M9NDgwJnI9cGcmZD1odHRwcyUzQSUyRiUyRmNkbi5hdXRoMC5jb20lMkZhdmF0YXJzJTJGbGIucG5nIiwidXBkYXRlZF9hdCI6IjIwMjMtMTItMjBUMDY6MjQ6NTcuMTA2WiIsImVtYWlsIjoibGIrYWNjLWFkbWluQG5vd29ubGluZS5ubCIsImVtYWlsX3ZlcmlmaWVkIjpmYWxzZSwiaXNzIjoiaHR0cHM6Ly9hY2MteW91bml0ZWQuZXUuYXV0aDAuY29tLyIsImF1ZCI6ImY5UjFVZ2R5SXRKZ2M2NGozMldpZnRwNkRsbGE4WFZvIiwiaWF0IjoxNzAzMDUzNTAyLCJleHAiOjE3MDMyMjYzMDIsInN1YiI6ImF1dGgwfDY0OWMyMDZlMTQwNTNmYWI1OGFkZmI0OSIsInNpZCI6IjZIT01Xa1p5R0ZXN0NZQVlEVjE0dkdoakRxX2lLTDFDIiwibm9uY2UiOiJORFJvYkZBdGRtd3RNWFUwYlVWemIycE1OMWRwUzBaR1VFMXFMbmhYVjFwVWFYaFNWek5XWW1SdlJRPT0ifQ.pMRZ3uy5ABlu_kx_fuWm6enQSPS5C9AYN-pGxippZX-wzCTszUAG1W_HLC9HqdkPeNygLIIoQc-teQ6zBQBBue8T_DMbsn8xCMXMYBRkKN4zqc35HgCH4kw0qeawI8RNP8lrT_amspfwtoqYP-edfHgm6p4zY3CN8Zh6OUrx72EnkRIgBwfUTcEswQXgFXkrhfSCeTZwoChVTgF70HtpUACj65yPcSX4go71iyFr0CaAKkN1M--iZmkYMzf8dDmYKo7fYxyNCPcsS3owceMX6CY396y4zHwuQcVPbEaMCIL5x6jgikZeBugZlat4AffA7GbTjTm6Mbmxp4gB73PtrA");
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
