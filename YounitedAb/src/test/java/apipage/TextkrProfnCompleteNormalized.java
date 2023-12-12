package apipage;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class TextkrProfnCompleteNormalized {
	
	  @SuppressWarnings("unchecked")
	  @Test	
	  public void professionsCompleteNormalized() {
			
	        RequestSpecification request=RestAssured.given();
			
			request.header("Content-Type", "application/json");
			request.header("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCIsImtpZCI6IlcwYXpDb2U3QjQ1MGszWnBUc2t0RSJ9.eyJuaWNrbmFtZSI6ImxiK2FjYy1hZG1pbiIsIm5hbWUiOiJsYithY2MtYWRtaW5Abm93b25saW5lLm5sIiwicGljdHVyZSI6Imh0dHBzOi8vcy5ncmF2YXRhci5jb20vYXZhdGFyLzM3NzNkMjg2MDA4ZTQzMzQ5ZDBmYjk3YzY4YjkzOGMzP3M9NDgwJnI9cGcmZD1odHRwcyUzQSUyRiUyRmNkbi5hdXRoMC5jb20lMkZhdmF0YXJzJTJGbGIucG5nIiwidXBkYXRlZF9hdCI6IjIwMjMtMTItMTFUMDc6MTE6MzUuODUyWiIsImVtYWlsIjoibGIrYWNjLWFkbWluQG5vd29ubGluZS5ubCIsImVtYWlsX3ZlcmlmaWVkIjpmYWxzZSwiaXNzIjoiaHR0cHM6Ly9hY2MteW91bml0ZWQuZXUuYXV0aDAuY29tLyIsImF1ZCI6ImY5UjFVZ2R5SXRKZ2M2NGozMldpZnRwNkRsbGE4WFZvIiwiaWF0IjoxNzAyMjc4Njk4LCJleHAiOjE3MDI0NTE0OTgsInN1YiI6ImF1dGgwfDY0OWMyMDZlMTQwNTNmYWI1OGFkZmI0OSIsInNpZCI6ImpGM1diYll5MEJxOXpQbnZHU1FITEg4b2E5VG5WY3dQIiwibm9uY2UiOiJVemRUTkVWbFZEUllUVU5NTGtKUmJVdHVOemhzWkhseWNWQnFVams0ZFV0UFJWaGZaa2gxUjNKRmNRPT0ifQ.fNfi4CclQBASAfT3QHwVcMMAIY-_Uh6k5zqUOlkEBFvG8PiIGgzMTr-DXPRL9tzo_cH8GmbzM4u-cbvlJb4H6xS7wiQxb46yeMV7hFX4Ank5ByYWJ0sbAgPzQjU59e5UcOEZBOlNqHhBfKTfIWlMlhaOV32MNHLafQygiA1kQAOTirPq9kY_joTj9bn2TZFrxA11JaNXFn57IcJml7DqHH_m2jdK4NXJhaKRhWch4jxlLeEO_bVA78u8ubqd87SE5Lj4LSPE0NakHuI72CsXnh82e1hv66WEXvmfYXUFbXfHksI27q1UykEEGBghmuzRXCDWJVJfYs7RR1l9JTGP7g");
			
			JSONObject json=new JSONObject();
			json.put("categories", "all");
			json.put("prefix", "Front");
			json.put("languages", "nl");
			json.put("output_language", "nl");
			
			request.body(json.toJSONString());
			
			Response response=request.post("https://younited-management-payment-acc.nowonline.nl/CompleteNormalized");
			
			int code=response.getStatusCode();
			System.out.println("TextKernel- Status code is: "+code);
			
			Assert.assertEquals(code, 200);
			
			//String data=response.asString();
			String data=response.asPrettyString();
			System.out.println("Response data is: "+data);
						
		}

}
