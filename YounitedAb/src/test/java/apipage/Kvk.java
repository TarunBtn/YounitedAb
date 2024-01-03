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
		request.header("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCIsImtpZCI6IlcwYXpDb2U3QjQ1MGszWnBUc2t0RSJ9.eyJuaWNrbmFtZSI6ImxiK2FjYy1mcmVlbGFuY2VyIiwibmFtZSI6ImxiK2FjYy1mcmVlbGFuY2VyQG5vd29ubGluZS5ubCIsInBpY3R1cmUiOiJodHRwczovL3MuZ3JhdmF0YXIuY29tL2F2YXRhci82MTNkODkxZDZkMGNkYmY0NjhlZTdhYzNiYTY0ZjAxOT9zPTQ4MCZyPXBnJmQ9aHR0cHMlM0ElMkYlMkZjZG4uYXV0aDAuY29tJTJGYXZhdGFycyUyRmxiLnBuZyIsInVwZGF0ZWRfYXQiOiIyMDI0LTAxLTAyVDE0OjE1OjU1LjI5NVoiLCJlbWFpbCI6ImxiK2FjYy1mcmVlbGFuY2VyQG5vd29ubGluZS5ubCIsImVtYWlsX3ZlcmlmaWVkIjp0cnVlLCJpc3MiOiJodHRwczovL2FjYy15b3VuaXRlZC5ldS5hdXRoMC5jb20vIiwiYXVkIjoiZjlSMVVnZHlJdEpnYzY0ajMyV2lmdHA2RGxsYThYVm8iLCJpYXQiOjE3MDQyMDQ5NjEsImV4cCI6MTcwNDM3Nzc2MSwic3ViIjoiYXV0aDB8NjBjMWRkZmQ2YjFhZjkwMDY4ZTM0Yjg5IiwiYXV0aF90aW1lIjoxNzA0MjA0OTU1LCJzaWQiOiItYUdfX1BiRUFsN01QMDI2R1Izd3oxVG93X1ItTUwzcyJ9.k1EkHJUY1CrrjJy1KnB3YUpEmhOE7fFpYKB5jH-84wgQ61VbU1W29NebB-9VbAh_Uw2b9Dal17dkINPj_RIOeqBshlgVmIU1dBTKIn_PrjzCoJivnCGe-FmYG6ZIZA4LCm9rJEe8Ukv68Gxcg-sKgWvqNHx9_MJKGV2iLD462BiD5xIrORd7dTaZNpdHLxA6g_9wzOkplMMz_OGeeBX5S6wstqCCOMh54CNs8qapjiYpQ4LJBqnzuLJQ_Wp3l8-iXW9LZnBs3VGI4_EexUGved7N0DnushkprfjkZpJwDYKmWtDyy9yjx6aXw8lCMbx1y0dpSz1NA8BTdvCaetIeRg");
		
		JSONObject json=new JSONObject();
		json.put("key", "62153595");
		
		request.body(json.toJSONString());
		
		Response response=request.post("https://younited-management-payment-acc.nowonline.nl/ValidateKvknummer");
		
		//int code=response.getStatusCode();
		System.out.println("Kvk- Status code is: "+code);
		
		Assert.assertEquals(code, 200);
		
		//String data=response.getBody().asString();
		String data=response.asPrettyString();
		System.out.println("Response data is: "+data);	
		
		
	}

}
