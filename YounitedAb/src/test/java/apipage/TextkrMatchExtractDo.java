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
	                  
	      request.header("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCIsImtpZCI6IlcwYXpDb2U3QjQ1MGszWnBUc2t0RSJ9.eyJuaWNrbmFtZSI6ImxiK2FjYy1hZG1pbiIsIm5hbWUiOiJsYithY2MtYWRtaW5Abm93b25saW5lLm5sIiwicGljdHVyZSI6Imh0dHBzOi8vcy5ncmF2YXRhci5jb20vYXZhdGFyLzM3NzNkMjg2MDA4ZTQzMzQ5ZDBmYjk3YzY4YjkzOGMzP3M9NDgwJnI9cGcmZD1odHRwcyUzQSUyRiUyRmNkbi5hdXRoMC5jb20lMkZhdmF0YXJzJTJGbGIucG5nIiwidXBkYXRlZF9hdCI6IjIwMjMtMTItMjhUMDk6MjA6MzQuMjIwWiIsImVtYWlsIjoibGIrYWNjLWFkbWluQG5vd29ubGluZS5ubCIsImVtYWlsX3ZlcmlmaWVkIjpmYWxzZSwiaXNzIjoiaHR0cHM6Ly9hY2MteW91bml0ZWQuZXUuYXV0aDAuY29tLyIsImF1ZCI6ImY5UjFVZ2R5SXRKZ2M2NGozMldpZnRwNkRsbGE4WFZvIiwiaWF0IjoxNzAzNzU1MjM5LCJleHAiOjE3MDM5MjgwMzksInN1YiI6ImF1dGgwfDY0OWMyMDZlMTQwNTNmYWI1OGFkZmI0OSIsInNpZCI6InBuR2ZVUlM2ci1NcTBUTVcxUFluYk1QWk5xLVNueHV1Iiwibm9uY2UiOiJNbEpwUWtaTVkzSk9VekZ0WmxkMFlVVnVlVmRoWlZjMFMwcDBkRzluYlhSSFExODJWVzh6U0RCbFZnPT0ifQ.QJOWv98AYL1FtDO4EQiRlRADuF6QwKmhaYYpg-FMnn9PhZDB3Mw-J85UxALHYRhoApQS7GuAgU5yzhIaMRs_N8KXrzNs80hIxhstaM3l5hG5KL5xQE9O5XzB-id9fbOS0kP-xLDVvHbZUdpxWD-miSAGeb_8a4m2aVLKLs1qSMHf3Nq75cJVEv5kciaL3ZUM9cvC8q_8yxoSPknN280FAoBzNw7AfpTfyZHr_Uhzl336ApV8TQ7SUnjyNE_XXTd6n1uTK7wV8FmK3IfD6aS4u4Kl5SyEN3SPapIdg8eQt7x3u7_aDUJLz0Z4XjbX2mvF3ypNiIxHrPqk1vCJarnAmw");
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
