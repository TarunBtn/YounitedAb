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
		request.header("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCIsImtpZCI6IlcwYXpDb2U3QjQ1MGszWnBUc2t0RSJ9.eyJuaWNrbmFtZSI6ImxiK2FjYy1hZG1pbiIsIm5hbWUiOiJsYithY2MtYWRtaW5Abm93b25saW5lLm5sIiwicGljdHVyZSI6Imh0dHBzOi8vcy5ncmF2YXRhci5jb20vYXZhdGFyLzM3NzNkMjg2MDA4ZTQzMzQ5ZDBmYjk3YzY4YjkzOGMzP3M9NDgwJnI9cGcmZD1odHRwcyUzQSUyRiUyRmNkbi5hdXRoMC5jb20lMkZhdmF0YXJzJTJGbGIucG5nIiwidXBkYXRlZF9hdCI6IjIwMjMtMTItMTNUMTM6MDE6NTUuMjM1WiIsImVtYWlsIjoibGIrYWNjLWFkbWluQG5vd29ubGluZS5ubCIsImVtYWlsX3ZlcmlmaWVkIjpmYWxzZSwiaXNzIjoiaHR0cHM6Ly9hY2MteW91bml0ZWQuZXUuYXV0aDAuY29tLyIsImF1ZCI6ImY5UjFVZ2R5SXRKZ2M2NGozMldpZnRwNkRsbGE4WFZvIiwiaWF0IjoxNzAyNDcyNTE4LCJleHAiOjE3MDI2NDUzMTgsInN1YiI6ImF1dGgwfDY0OWMyMDZlMTQwNTNmYWI1OGFkZmI0OSIsInNpZCI6ImZiRlFzZnBZUlJhTExMTEo1akZFYWNHeVo1MmcxdFBlIiwibm9uY2UiOiJSbWRFYTJGWU1tMVNlbXBGZVdjelFUTTVOSEU1T1dKclgyWkxjRGRYUTFsWlUwTjNaMUYzVjNGNWJ3PT0ifQ.VKYudIODkaYDnwlAH5hmyQtuEQVqb4WrZbI3TxR4xMKf3NenE8zHfH75Izkuc8cMqTNSZiN1es0VDeSkcNvV6lJsEON7IQKlHcRAJuTqo1yqLFl0Cw7wiCLrISulGPfh-s5fSg1x0SqhycO9i3nAFt9s-P_83VfEr0qGA3ERCQwenlCJC2Y__KQ1T9KuUyxzWvJZxVG843jizzr4Lv7wUSDEv-C1zKSDTy2zMVfFNOWsqOEU5yvhdswS7oEDeyIwN9zNdVToVjqS6hAciG-pzcSxslRomnq-W0T6VxQxl5h4TK52BDXeFnAmGJ0BwXYMLteNb4p_1W4aae_0do9vzw");
		
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
