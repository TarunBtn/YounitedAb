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
	                  
	      request.header("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCIsImtpZCI6IlcwYXpDb2U3QjQ1MGszWnBUc2t0RSJ9.eyJuaWNrbmFtZSI6ImxiK2FjYy1mcmVlbGFuY2VyIiwibmFtZSI6ImxiK2FjYy1mcmVlbGFuY2VyQG5vd29ubGluZS5ubCIsInBpY3R1cmUiOiJodHRwczovL3MuZ3JhdmF0YXIuY29tL2F2YXRhci82MTNkODkxZDZkMGNkYmY0NjhlZTdhYzNiYTY0ZjAxOT9zPTQ4MCZyPXBnJmQ9aHR0cHMlM0ElMkYlMkZjZG4uYXV0aDAuY29tJTJGYXZhdGFycyUyRmxiLnBuZyIsInVwZGF0ZWRfYXQiOiIyMDI0LTAxLTAyVDE0OjE1OjU1LjI5NVoiLCJlbWFpbCI6ImxiK2FjYy1mcmVlbGFuY2VyQG5vd29ubGluZS5ubCIsImVtYWlsX3ZlcmlmaWVkIjp0cnVlLCJpc3MiOiJodHRwczovL2FjYy15b3VuaXRlZC5ldS5hdXRoMC5jb20vIiwiYXVkIjoiZjlSMVVnZHlJdEpnYzY0ajMyV2lmdHA2RGxsYThYVm8iLCJpYXQiOjE3MDQyMDQ5NjEsImV4cCI6MTcwNDM3Nzc2MSwic3ViIjoiYXV0aDB8NjBjMWRkZmQ2YjFhZjkwMDY4ZTM0Yjg5IiwiYXV0aF90aW1lIjoxNzA0MjA0OTU1LCJzaWQiOiItYUdfX1BiRUFsN01QMDI2R1Izd3oxVG93X1ItTUwzcyJ9.k1EkHJUY1CrrjJy1KnB3YUpEmhOE7fFpYKB5jH-84wgQ61VbU1W29NebB-9VbAh_Uw2b9Dal17dkINPj_RIOeqBshlgVmIU1dBTKIn_PrjzCoJivnCGe-FmYG6ZIZA4LCm9rJEe8Ukv68Gxcg-sKgWvqNHx9_MJKGV2iLD462BiD5xIrORd7dTaZNpdHLxA6g_9wzOkplMMz_OGeeBX5S6wstqCCOMh54CNs8qapjiYpQ4LJBqnzuLJQ_Wp3l8-iXW9LZnBs3VGI4_EexUGved7N0DnushkprfjkZpJwDYKmWtDyy9yjx6aXw8lCMbx1y0dpSz1NA8BTdvCaetIeRg");
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
