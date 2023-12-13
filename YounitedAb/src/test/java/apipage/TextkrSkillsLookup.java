package apipage;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TextkrSkillsLookup {
	
	  @SuppressWarnings("unchecked")
	  @Test	
	  public void SkillsLookup() {
			
			RequestSpecification request=RestAssured.given();
			request.header("content-type", "application/json");
			request.header("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCIsImtpZCI6IlcwYXpDb2U3QjQ1MGszWnBUc2t0RSJ9.eyJuaWNrbmFtZSI6ImxiK2FjYy1hZG1pbiIsIm5hbWUiOiJsYithY2MtYWRtaW5Abm93b25saW5lLm5sIiwicGljdHVyZSI6Imh0dHBzOi8vcy5ncmF2YXRhci5jb20vYXZhdGFyLzM3NzNkMjg2MDA4ZTQzMzQ5ZDBmYjk3YzY4YjkzOGMzP3M9NDgwJnI9cGcmZD1odHRwcyUzQSUyRiUyRmNkbi5hdXRoMC5jb20lMkZhdmF0YXJzJTJGbGIucG5nIiwidXBkYXRlZF9hdCI6IjIwMjMtMTItMTNUMTM6MDE6NTUuMjM1WiIsImVtYWlsIjoibGIrYWNjLWFkbWluQG5vd29ubGluZS5ubCIsImVtYWlsX3ZlcmlmaWVkIjpmYWxzZSwiaXNzIjoiaHR0cHM6Ly9hY2MteW91bml0ZWQuZXUuYXV0aDAuY29tLyIsImF1ZCI6ImY5UjFVZ2R5SXRKZ2M2NGozMldpZnRwNkRsbGE4WFZvIiwiaWF0IjoxNzAyNDcyNTE4LCJleHAiOjE3MDI2NDUzMTgsInN1YiI6ImF1dGgwfDY0OWMyMDZlMTQwNTNmYWI1OGFkZmI0OSIsInNpZCI6ImZiRlFzZnBZUlJhTExMTEo1akZFYWNHeVo1MmcxdFBlIiwibm9uY2UiOiJSbWRFYTJGWU1tMVNlbXBGZVdjelFUTTVOSEU1T1dKclgyWkxjRGRYUTFsWlUwTjNaMUYzVjNGNWJ3PT0ifQ.VKYudIODkaYDnwlAH5hmyQtuEQVqb4WrZbI3TxR4xMKf3NenE8zHfH75Izkuc8cMqTNSZiN1es0VDeSkcNvV6lJsEON7IQKlHcRAJuTqo1yqLFl0Cw7wiCLrISulGPfh-s5fSg1x0SqhycO9i3nAFt9s-P_83VfEr0qGA3ERCQwenlCJC2Y__KQ1T9KuUyxzWvJZxVG843jizzr4Lv7wUSDEv-C1zKSDTy2zMVfFNOWsqOEU5yvhdswS7oEDeyIwN9zNdVToVjqS6hAciG-pzcSxslRomnq-W0T6VxQxl5h4TK52BDXeFnAmGJ0BwXYMLteNb4p_1W4aae_0do9vzw");
			
			JSONObject json=new JSONObject();
			json.put("code_ids", "KS1212F67PN955FY9QGR");
			json.put("code_ids", "KS4415Q7473P0DBBD5Y6");
			json.put("code_ids", "KS123K75YYK8VGH90NCS");
			json.put("code_ids", "KS1264H6GVR1FW7B62YZ");
			json.put("code_ids", "KS440FS71DJY51ZPZR0Q");
			json.put("code_ids", "KS120ST66K9HBSZ7MPS3");
			json.put("code_ids", "KS7YXWLEAKN8QOFDFVS2");
			json.put("code_ids", "KS441BJ6LNS1QCJHRMTW");
			json.put("code_ids", "KS0MUJGS1UTCN6QBYSB6");
			json.put("code_ids", "KS128HD6KJSZMPK72WSF");
			json.put("code_ids", "KSUOK8Y8NQ2YVBFO4IH5");
			json.put("code_ids", "KS125JW6MFF4MZ1QZNPP");
			json.put("code_ids", "KSA8049RVCG293NL3IY2");
			json.put("code_ids", "KS123RJ5XGVSRR6CH0MS");
			json.put("code_ids", "KSYD2ESJZLDF3EEES3UY");
			json.put("code_ids", "KS441BJ71ZQZRPLDVTMB");
			json.put("code_ids", "KS440W3640PNXPGB5MSW");
			json.put("code_ids", "KSVMYR5F3MF8ME0MBN3Q");
			json.put("categories", "all");
			json.put("language", "nl");
			json.put("output_language", "nl");
			json.put("threshold", "0");
			
			request.body(json.toJSONString());
			
			Response resp=request.post("https://younited-management-payment-acc.nowonline.nl/SkillsLookup");
			int scode=resp.getStatusCode();
			System.out.println("Status code: "+scode);
			
			String data=resp.asPrettyString();
			System.out.println("Response data: "+data);
			
		}

}
