package apipage;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class Kvk {

	@SuppressWarnings("unchecked")
	@Test
    public void validateKvkNumber() {
		
		RequestSpecification request=RestAssured.given();
		
		request.header("Content-Type", "application/json");
		request.header("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCIsImtpZCI6IlcwYXpDb2U3QjQ1MGszWnBUc2t0RSJ9.eyJuaWNrbmFtZSI6ImxiK2FjYy1hZG1pbiIsIm5hbWUiOiJsYithY2MtYWRtaW5Abm93b25saW5lLm5sIiwicGljdHVyZSI6Imh0dHBzOi8vcy5ncmF2YXRhci5jb20vYXZhdGFyLzM3NzNkMjg2MDA4ZTQzMzQ5ZDBmYjk3YzY4YjkzOGMzP3M9NDgwJnI9cGcmZD1odHRwcyUzQSUyRiUyRmNkbi5hdXRoMC5jb20lMkZhdmF0YXJzJTJGbGIucG5nIiwidXBkYXRlZF9hdCI6IjIwMjMtMTItMjBUMDY6MjQ6NTcuMTA2WiIsImVtYWlsIjoibGIrYWNjLWFkbWluQG5vd29ubGluZS5ubCIsImVtYWlsX3ZlcmlmaWVkIjpmYWxzZSwiaXNzIjoiaHR0cHM6Ly9hY2MteW91bml0ZWQuZXUuYXV0aDAuY29tLyIsImF1ZCI6ImY5UjFVZ2R5SXRKZ2M2NGozMldpZnRwNkRsbGE4WFZvIiwiaWF0IjoxNzAzMDUzNTAyLCJleHAiOjE3MDMyMjYzMDIsInN1YiI6ImF1dGgwfDY0OWMyMDZlMTQwNTNmYWI1OGFkZmI0OSIsInNpZCI6IjZIT01Xa1p5R0ZXN0NZQVlEVjE0dkdoakRxX2lLTDFDIiwibm9uY2UiOiJORFJvYkZBdGRtd3RNWFUwYlVWemIycE1OMWRwUzBaR1VFMXFMbmhYVjFwVWFYaFNWek5XWW1SdlJRPT0ifQ.pMRZ3uy5ABlu_kx_fuWm6enQSPS5C9AYN-pGxippZX-wzCTszUAG1W_HLC9HqdkPeNygLIIoQc-teQ6zBQBBue8T_DMbsn8xCMXMYBRkKN4zqc35HgCH4kw0qeawI8RNP8lrT_amspfwtoqYP-edfHgm6p4zY3CN8Zh6OUrx72EnkRIgBwfUTcEswQXgFXkrhfSCeTZwoChVTgF70HtpUACj65yPcSX4go71iyFr0CaAKkN1M--iZmkYMzf8dDmYKo7fYxyNCPcsS3owceMX6CY396y4zHwuQcVPbEaMCIL5x6jgikZeBugZlat4AffA7GbTjTm6Mbmxp4gB73PtrA");
		
		JSONObject json=new JSONObject();
		json.put("key", "62153595");
		
		request.body(json.toJSONString());
		
		Response response=request.post("https://younited-management-payment-acc.nowonline.nl/ValidateKvknummer");
		
		int code=response.getStatusCode();
		System.out.println("Kvk- Status code is: "+code);
		
		Assert.assertEquals(code, 200);
		
		//String data=response.getBody().asString();
		String data=response.asPrettyString();
		System.out.println("Response data is: "+data);	
		
		
	}

}
