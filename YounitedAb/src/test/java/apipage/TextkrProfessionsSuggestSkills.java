package apipage;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TextkrProfessionsSuggestSkills {
	
	   @SuppressWarnings("unchecked")
	   @Test	
	   public void ProfessionsSuggestSkills() {
			
			RequestSpecification request=RestAssured.given();
			request.header("Content-Type", "application/json");
			request.header("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCIsImtpZCI6IlcwYXpDb2U3QjQ1MGszWnBUc2t0RSJ9.eyJuaWNrbmFtZSI6ImxiK2FjYy1hZG1pbiIsIm5hbWUiOiJsYithY2MtYWRtaW5Abm93b25saW5lLm5sIiwicGljdHVyZSI6Imh0dHBzOi8vcy5ncmF2YXRhci5jb20vYXZhdGFyLzM3NzNkMjg2MDA4ZTQzMzQ5ZDBmYjk3YzY4YjkzOGMzP3M9NDgwJnI9cGcmZD1odHRwcyUzQSUyRiUyRmNkbi5hdXRoMC5jb20lMkZhdmF0YXJzJTJGbGIucG5nIiwidXBkYXRlZF9hdCI6IjIwMjMtMTItMThUMDY6MTA6NDAuNTQ2WiIsImVtYWlsIjoibGIrYWNjLWFkbWluQG5vd29ubGluZS5ubCIsImVtYWlsX3ZlcmlmaWVkIjpmYWxzZSwiaXNzIjoiaHR0cHM6Ly9hY2MteW91bml0ZWQuZXUuYXV0aDAuY29tLyIsImF1ZCI6ImY5UjFVZ2R5SXRKZ2M2NGozMldpZnRwNkRsbGE4WFZvIiwiaWF0IjoxNzAyODc5ODQ0LCJleHAiOjE3MDMwNTI2NDQsInN1YiI6ImF1dGgwfDY0OWMyMDZlMTQwNTNmYWI1OGFkZmI0OSIsInNpZCI6Ikp3NVRjb1lXdk1adG9nVmRERjdPTGZPSUc2ZVZmWXNyIiwibm9uY2UiOiJmbmhOTUZaaFkxTm1ZVzVVWDJaSE1FZG1jVVZTUVRCVU5sUmFPSEExTjJWQ01FaENWSFV6Y21STWR3PT0ifQ.NyayG539XDDBqqTjAJ1zlZaYenbg5EQM7Tb-1Qw5TCc8K4HnvvhtbajkfvAv08qBoAzM1-DZs5wcLDDMuALhxCBAo3GjT9XRIm1WgIhAbLazsseHIFuY0HRhitYSVcYBD1MYKDVJXlZgr16rqRV1_mq9OjUHMdP3jLhaqhcXm_SgMGGKufwypNkMvtp4nFBNPYj3LDgOGuw_0Nul4M2R885TJIKDA3n5E6gJfJwoUqzk7Ht0avcyF2ayw6hc063nh13yyl5UhjSGxu8DfcLCb-86uR1-njAAzVkISM9wVCFeuBPDvF-_yv8hELjSSAIRxQ8qG29cucQUP3K_8_kvRg");
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
			
			Response response=request.post("https://younited-management-payment-acc.nowonline.nl/ProfessionsSuggestSkills?limit=15");
			int scode=response.getStatusCode();
			System.out.println("Status code: "+scode);
			Assert.assertEquals(scode, 200);
			
			String data=response.asPrettyString();
			System.out.println("Response data: "+data);
			

		}

}
