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
			request.header("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCIsImtpZCI6IlcwYXpDb2U3QjQ1MGszWnBUc2t0RSJ9.eyJuaWNrbmFtZSI6ImxiK2FjYy1hZG1pbiIsIm5hbWUiOiJsYithY2MtYWRtaW5Abm93b25saW5lLm5sIiwicGljdHVyZSI6Imh0dHBzOi8vcy5ncmF2YXRhci5jb20vYXZhdGFyLzM3NzNkMjg2MDA4ZTQzMzQ5ZDBmYjk3YzY4YjkzOGMzP3M9NDgwJnI9cGcmZD1odHRwcyUzQSUyRiUyRmNkbi5hdXRoMC5jb20lMkZhdmF0YXJzJTJGbGIucG5nIiwidXBkYXRlZF9hdCI6IjIwMjMtMTItMjZUMDY6NDE6MjkuNjIxWiIsImVtYWlsIjoibGIrYWNjLWFkbWluQG5vd29ubGluZS5ubCIsImVtYWlsX3ZlcmlmaWVkIjpmYWxzZSwiaXNzIjoiaHR0cHM6Ly9hY2MteW91bml0ZWQuZXUuYXV0aDAuY29tLyIsImF1ZCI6ImY5UjFVZ2R5SXRKZ2M2NGozMldpZnRwNkRsbGE4WFZvIiwiaWF0IjoxNzAzNTcyODk0LCJleHAiOjE3MDM3NDU2OTQsInN1YiI6ImF1dGgwfDY0OWMyMDZlMTQwNTNmYWI1OGFkZmI0OSIsInNpZCI6ImNCd2pXai1tSjh0dTh0VlJaOUlmRnBCVUV4bVI2RGYzIiwibm9uY2UiOiJiRUp5U2xwSlRsOHdVMlo0UjJKSE1VSkRhMWRYU1RSbGNUQlVTSEV5WjBsM2RXZFVZemRpTVRac1lRPT0ifQ.SR3EcSMf63C1YPTk_IrpU3DlAG2B_KS3A5_0VY0pLcNvaup5wjEqNAHhnXRQaf2olDFyXQZR4afnu6rE-rnRaFe2QsXOW4TSmjuQB-8Iio5IvCVJEY4yxTsecsjrgfVoTxQT5C2A8fOPdI5KNGuPScGkeQWj84tIzr7pMCR76lCVhSASMsg1Tqs8JwoBGoZD0tMjN00_b8e7YFNC1kVoNgSGwqVfDYpW9s5tKiarEsk1vRWaoPO9-N0fU2b9nNe53RhR9fsTG5FzY5SG-bIPidq_MW4Vzwx8Et6J_sQqK1SpKmsvZ298f9z5EfA-1j729hS6ZCXvUNvzfP-L1spp1w");
			
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
