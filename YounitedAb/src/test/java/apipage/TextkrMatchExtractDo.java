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
	                  
	      request.header("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCIsImtpZCI6IlcwYXpDb2U3QjQ1MGszWnBUc2t0RSJ9.eyJuaWNrbmFtZSI6ImxiK2FjYy1hZG1pbiIsIm5hbWUiOiJsYithY2MtYWRtaW5Abm93b25saW5lLm5sIiwicGljdHVyZSI6Imh0dHBzOi8vcy5ncmF2YXRhci5jb20vYXZhdGFyLzM3NzNkMjg2MDA4ZTQzMzQ5ZDBmYjk3YzY4YjkzOGMzP3M9NDgwJnI9cGcmZD1odHRwcyUzQSUyRiUyRmNkbi5hdXRoMC5jb20lMkZhdmF0YXJzJTJGbGIucG5nIiwidXBkYXRlZF9hdCI6IjIwMjQtMDEtMDFUMDY6MjQ6NTUuNTk3WiIsImVtYWlsIjoibGIrYWNjLWFkbWluQG5vd29ubGluZS5ubCIsImVtYWlsX3ZlcmlmaWVkIjpmYWxzZSwiaXNzIjoiaHR0cHM6Ly9hY2MteW91bml0ZWQuZXUuYXV0aDAuY29tLyIsImF1ZCI6ImY5UjFVZ2R5SXRKZ2M2NGozMldpZnRwNkRsbGE4WFZvIiwiaWF0IjoxNzA0MDkwMzAwLCJleHAiOjE3MDQyNjMxMDAsInN1YiI6ImF1dGgwfDY0OWMyMDZlMTQwNTNmYWI1OGFkZmI0OSIsInNpZCI6IjZkTEc4a3BTYW5CX2hiTHFoZ3F1LVZzY2s0NnZmZWU3Iiwibm9uY2UiOiJXRkorYVhGUExuQjZkRW80Wkc5VlNtbGlMV0ZtVlRoT00wY3pjME5VTjJOeExXRTViWHBTYjI1RGVBPT0ifQ.CbDYTtmFCKGo26qqWKyhqlWhQBEciVUladBRMPDcQWZzPg8Ekz2LYJkWTiKhrHbUI_o3cbX9v9Gx7x9od0GRnoJs6uysX5OqUxfZYTBKXRgOCS3dZqz-5FBJQiUEzNz6HZZaBkPExBJwfiekiKdkUZOQZ_IpdWWa2f2xS1rGWLFScn1Vbm3A0DO43K7udZhd39_ju1MoukTlqbf9TBlwC0nQn5azoE7fKkKhsuEGFmT91nmBVmuhqxmO0tTMvSvltOMDSrTvHsUasDA0mvdswZs2rrdcJaiEU2wjAKYMgWG-nFu3K1WgJ2Xq9PZ4Z0ZbOC34Eyw_JPSAWAns9e9Bkw");
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
