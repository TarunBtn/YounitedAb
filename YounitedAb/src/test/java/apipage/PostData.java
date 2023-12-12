package apipage;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class PostData {

	@SuppressWarnings("unchecked")
	@Test(priority=1)
	public void completeNormalized() {
		
	RequestSpecification request=RestAssured.given();
	request.header("Content-Type", "application/json");
	request.header("Authorization", "Bearer  eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCIsImtpZCI6IlcwYXpDb2U3QjQ1MGszWnBUc2t0RSJ9.eyJuaWNrbmFtZSI6ImxiK2FjYy1hZG1pbiIsIm5hbWUiOiJsYithY2MtYWRtaW5Abm93b25saW5lLm5sIiwicGljdHVyZSI6Imh0dHBzOi8vcy5ncmF2YXRhci5jb20vYXZhdGFyLzM3NzNkMjg2MDA4ZTQzMzQ5ZDBmYjk3YzY4YjkzOGMzP3M9NDgwJnI9cGcmZD1odHRwcyUzQSUyRiUyRmNkbi5hdXRoMC5jb20lMkZhdmF0YXJzJTJGbGIucG5nIiwidXBkYXRlZF9hdCI6IjIwMjMtMTAtMjVUMDc6NDA6NDAuNzc1WiIsImVtYWlsIjoibGIrYWNjLWFkbWluQG5vd29ubGluZS5ubCIsImVtYWlsX3ZlcmlmaWVkIjpmYWxzZSwiaXNzIjoiaHR0cHM6Ly9hY2MteW91bml0ZWQuZXUuYXV0aDAuY29tLyIsImF1ZCI6ImY5UjFVZ2R5SXRKZ2M2NGozMldpZnRwNkRsbGE4WFZvIiwiaWF0IjoxNjk4MjE5NjQ1LCJleHAiOjE2OTgzOTI0NDUsInN1YiI6ImF1dGgwfDY0OWMyMDZlMTQwNTNmYWI1OGFkZmI0OSIsInNpZCI6Imc3N0c5dEFuQTIyV3dZRFNSMWFpMTB3VjBqT3JWY29BIiwibm9uY2UiOiJaRzFsWjA1TGZqVXVRVFpwVGt3dFVYRnhhSE5WWjBaUUxVZHlZMVY2YlVOcFlXNDVPVGxEZFhwMk5RPT0ifQ.fCtT8yyjulxvZYVD8R1EwD6mKwbp4yoAuvUEoZRTVIsqhtX6kZGcdMnv3sGsEDZ0lBQRFO0eHaZLWNxg1AnvwNFew3RJtlMY8MIvsjMe0k3bqH57OAFj6WPBBfPNRDxo3a5B2QttMOixoX07XyfIQJzjNu_DxkO01ftW42qKDOXgbUJBeHUh5EEXNH9rHEB7doQsUEByPHd0H3dJN8XvcjcLKnamx0CkX8HRLaP2FflmXSD_ZA1TD7c9hx2u2nGJpILGpGRdtwdabo-aco2NnxazdFYy2axOU-wR98KerY6yG08qKSIs0Bud9vhjbzh5oomnM4L8UlNYCa1CH1MhBw");
	
	JSONObject json=new JSONObject();
	json.put("categories", "all");
	json.put("prefix", "Postman");
	json.put("languages", "nl");
	json.put("output_language", "nl");
	
	request.body(json.toJSONString());
	
	Response response=request.post("https://younited-management-payment-acc.nowonline.nl/CompleteNormalized");
	int code=response.getStatusCode();
	System.out.println("CompleteNormalized APi Status code is: "+code);
	
	//String data=response.asString();
	//System.out.println("Response data is: "+data);
	
	Assert.assertEquals(code, 200);
		
	}
	
	
	@SuppressWarnings("unchecked")
	@Test(priority=2)
	public void professionsCompleteNormalized() {
		
		RequestSpecification request=RestAssured.given();	
		request.header("Content-Type", "application/json");
		request.header("Authorization", "Bearer  eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCIsImtpZCI6IlcwYXpDb2U3QjQ1MGszWnBUc2t0RSJ9.eyJuaWNrbmFtZSI6ImxiK2FjYy1hZG1pbiIsIm5hbWUiOiJsYithY2MtYWRtaW5Abm93b25saW5lLm5sIiwicGljdHVyZSI6Imh0dHBzOi8vcy5ncmF2YXRhci5jb20vYXZhdGFyLzM3NzNkMjg2MDA4ZTQzMzQ5ZDBmYjk3YzY4YjkzOGMzP3M9NDgwJnI9cGcmZD1odHRwcyUzQSUyRiUyRmNkbi5hdXRoMC5jb20lMkZhdmF0YXJzJTJGbGIucG5nIiwidXBkYXRlZF9hdCI6IjIwMjMtMTAtMjVUMDc6NDA6NDAuNzc1WiIsImVtYWlsIjoibGIrYWNjLWFkbWluQG5vd29ubGluZS5ubCIsImVtYWlsX3ZlcmlmaWVkIjpmYWxzZSwiaXNzIjoiaHR0cHM6Ly9hY2MteW91bml0ZWQuZXUuYXV0aDAuY29tLyIsImF1ZCI6ImY5UjFVZ2R5SXRKZ2M2NGozMldpZnRwNkRsbGE4WFZvIiwiaWF0IjoxNjk4MjE5NjQ1LCJleHAiOjE2OTgzOTI0NDUsInN1YiI6ImF1dGgwfDY0OWMyMDZlMTQwNTNmYWI1OGFkZmI0OSIsInNpZCI6Imc3N0c5dEFuQTIyV3dZRFNSMWFpMTB3VjBqT3JWY29BIiwibm9uY2UiOiJaRzFsWjA1TGZqVXVRVFpwVGt3dFVYRnhhSE5WWjBaUUxVZHlZMVY2YlVOcFlXNDVPVGxEZFhwMk5RPT0ifQ.fCtT8yyjulxvZYVD8R1EwD6mKwbp4yoAuvUEoZRTVIsqhtX6kZGcdMnv3sGsEDZ0lBQRFO0eHaZLWNxg1AnvwNFew3RJtlMY8MIvsjMe0k3bqH57OAFj6WPBBfPNRDxo3a5B2QttMOixoX07XyfIQJzjNu_DxkO01ftW42qKDOXgbUJBeHUh5EEXNH9rHEB7doQsUEByPHd0H3dJN8XvcjcLKnamx0CkX8HRLaP2FflmXSD_ZA1TD7c9hx2u2nGJpILGpGRdtwdabo-aco2NnxazdFYy2axOU-wR98KerY6yG08qKSIs0Bud9vhjbzh5oomnM4L8UlNYCa1CH1MhBw");
		
		JSONObject json=new JSONObject();
		json.put("categories", "all");
		json.put("prefix", "Front");
		json.put("languages", "nl");
		json.put("output_language", "nl");
		request.body(json.toJSONString());
		
		Response response=request.post("https://younited-management-payment-acc.nowonline.nl/CompleteNormalized");
		int code=response.getStatusCode();
		System.out.println("ProfessionsCompleteNormalized APi Status code is: "+code);
		
		//String data=response.asString();
		//System.out.println("Response data is: "+data);
		
		Assert.assertEquals(code, 200);
			
		}
	
	@SuppressWarnings("unchecked")
	@Test
	public void testdata() {
		
		RequestSpecification request=RestAssured.given();
		request.header("Content-Type", "application/json");
		request.header("Authorization", "token");
		
		JSONObject json=new JSONObject();
		json.put("", "");
		json.put("", "");
		json.put("", "");
		json.put("", "");
		
		request.body(json.toJSONString());
		
		Response response=request.post("https://younited-management-payment-acc.nowonline.nl/CompleteNormalized");
		int statusCode=response.getStatusCode();
		System.out.println("status code is-"+statusCode);
		Assert.assertEquals(statusCode, 200);
		
		String data=response.asString();
		System.out.println("data is-"+data);
			
	}
}
