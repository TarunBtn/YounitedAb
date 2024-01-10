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
			request.header("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCIsImtpZCI6IlcwYXpDb2U3QjQ1MGszWnBUc2t0RSJ9.eyJuaWNrbmFtZSI6ImxiK2FjYy1hZG1pbiIsIm5hbWUiOiJsYithY2MtYWRtaW5Abm93b25saW5lLm5sIiwicGljdHVyZSI6Imh0dHBzOi8vcy5ncmF2YXRhci5jb20vYXZhdGFyLzM3NzNkMjg2MDA4ZTQzMzQ5ZDBmYjk3YzY4YjkzOGMzP3M9NDgwJnI9cGcmZD1odHRwcyUzQSUyRiUyRmNkbi5hdXRoMC5jb20lMkZhdmF0YXJzJTJGbGIucG5nIiwidXBkYXRlZF9hdCI6IjIwMjQtMDEtMTBUMDc6MjQ6MzkuODU1WiIsImVtYWlsIjoibGIrYWNjLWFkbWluQG5vd29ubGluZS5ubCIsImVtYWlsX3ZlcmlmaWVkIjpmYWxzZSwiaXNzIjoiaHR0cHM6Ly9hY2MteW91bml0ZWQuZXUuYXV0aDAuY29tLyIsImF1ZCI6ImY5UjFVZ2R5SXRKZ2M2NGozMldpZnRwNkRsbGE4WFZvIiwiaWF0IjoxNzA0ODcxNDg2LCJleHAiOjE3MDUwNDQyODYsInN1YiI6ImF1dGgwfDY0OWMyMDZlMTQwNTNmYWI1OGFkZmI0OSIsImF1dGhfdGltZSI6MTcwNDg3MTQ3OSwic2lkIjoiLWFHX19QYkVBbDdNUDAyNkdSM3d6MVRvd19SLU1MM3MifQ.kBqDUd13tCGzRrIC2xmIvjpICXv34AW8ui0-sy4M6loRWx6Ak595-gdkw0BOifDTct2VHb6NyY_M-eMC26J7fYtrXSR6UpsxPzGXMOFuSmb7_e26JwjlrnU6UxMXZpWUX_6PzbuZRXcPK_yBr-RDKfuizyxmx9WTJBS0Z3MSzW6H8_GeDvYbIBP9grO25FDUgHWAhC5Fe2Qsu9rfZiyKMv5C4W6F-z1p6Nv9Qapr2GK99K5qj4MNN7mBA6DJECy_xwf77f_WzIAKIerSUEbaBJpaSGW2IOn5D7vwO50HSdOpkqD2PBUIL9HJp4Bs2W9Yi0VHm6vaEXf2ce46ALXdKA");
			
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
			
			Response response=request.post("https://younited-management-payment-acc.nowonline.nl/CompleteNormalized");
			
			int code=response.getStatusCode();
			System.out.println("Textkernel- Status code is: "+code);
			
			Assert.assertEquals(code, 200);
			
			//String data=response.getBody().asString();
			String data=response.asPrettyString();
			System.out.println("Response data is: "+data);
			
					
		}

}
