package apipage;

import org.json.simple.JSONArray;
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
			request.header("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCIsImtpZCI6IlcwYXpDb2U3QjQ1MGszWnBUc2t0RSJ9.eyJuaWNrbmFtZSI6ImxiK2FjYy1hZG1pbiIsIm5hbWUiOiJsYithY2MtYWRtaW5Abm93b25saW5lLm5sIiwicGljdHVyZSI6Imh0dHBzOi8vcy5ncmF2YXRhci5jb20vYXZhdGFyLzM3NzNkMjg2MDA4ZTQzMzQ5ZDBmYjk3YzY4YjkzOGMzP3M9NDgwJnI9cGcmZD1odHRwcyUzQSUyRiUyRmNkbi5hdXRoMC5jb20lMkZhdmF0YXJzJTJGbGIucG5nIiwidXBkYXRlZF9hdCI6IjIwMjQtMDEtMDRUMTQ6NDg6NDQuOTk3WiIsImVtYWlsIjoibGIrYWNjLWFkbWluQG5vd29ubGluZS5ubCIsImVtYWlsX3ZlcmlmaWVkIjpmYWxzZSwiaXNzIjoiaHR0cHM6Ly9hY2MteW91bml0ZWQuZXUuYXV0aDAuY29tLyIsImF1ZCI6ImY5UjFVZ2R5SXRKZ2M2NGozMldpZnRwNkRsbGE4WFZvIiwiaWF0IjoxNzA0Mzc5NzI5LCJleHAiOjE3MDQ1NTI1MjksInN1YiI6ImF1dGgwfDY0OWMyMDZlMTQwNTNmYWI1OGFkZmI0OSIsImF1dGhfdGltZSI6MTcwNDM3OTcyNSwic2lkIjoiLWFHX19QYkVBbDdNUDAyNkdSM3d6MVRvd19SLU1MM3MifQ.YSJI37m-bkk_D_FrmcFijmVUUkdCiZ5Fp16WiXfI_ybq7LcBY20J0GZXBq1gvEdM3Rzcu6hFeyt5bKD7oWpld-hKzJhNsLx2RKob62xX_2U-n3N-6h5zhCDbxbVPC1uqN1PHmXidxpMANG2SIQFeonbsyp_icFAO4QD_u7XVc-yFV6tml6UMXYmsj4-LQd22P-AoemtuadNSfqtTGUq77Y-ZVkUHloGRwFaz8jPCCGfiQBCgkIwFtgZhoOhzOWqd1iLs3kdvo7pbhW9yOErtTWCleLLG3L23awiM8_JmltmTnXXsJqg38idTapH0ARQRKZNFhvBwJfguRzojjCULOQ");
			
			JSONObject json=new JSONObject();
			/*json.put("code_ids", "KS1212F67PN955FY9QGR");
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
			json.put("threshold", "0");*/
			
			/*JSONArray codeIdsArray = new JSONArray();
	        codeIdsArray.add("KS1212F67PN955FY9QGR");
	        codeIdsArray.add("KS4415Q7473P0DBBD5Y6");
	        codeIdsArray.add("KS123K75YYK8VGH90NCS");
	        codeIdsArray.add("KS1264H6GVR1FW7B62YZ");
	        codeIdsArray.add("KS440FS71DJY51ZPZR0Q");
	        codeIdsArray.add("KS120ST66K9HBSZ7MPS3");	        
	        codeIdsArray.add("KS7YXWLEAKN8QOFDFVS2");	        
	        codeIdsArray.add("KS441BJ6LNS1QCJHRMTW");	        
	        codeIdsArray.add("KS0MUJGS1UTCN6QBYSB6");	        
	        codeIdsArray.add("KS128HD6KJSZMPK72WSF");
	        codeIdsArray.add("KSUOK8Y8NQ2YVBFO4IH5");	        
	        codeIdsArray.add("KS125JW6MFF4MZ1QZNPP");	        
	        codeIdsArray.add("KSA8049RVCG293NL3IY2");	        
	        codeIdsArray.add("KS123RJ5XGVSRR6CH0MS");	        
	        codeIdsArray.add("KSYD2ESJZLDF3EEES3UY");	        
	        codeIdsArray.add("KS441BJ71ZQZRPLDVTMB");	        
	        codeIdsArray.add("KS440W3640PNXPGB5MSW");
	        codeIdsArray.add("KSVMYR5F3MF8ME0MBN3Q");*/
			//request.body("{ \"categories\": \"all\", \"languages\": [ \"nl\" ], \"output_language\": \"nl\", \"threshold\": \"0\" }");
			
	        String jsonString = "{\"code_ids\": [\"KS1212F67PN955FY9QGR\", \"KS4415Q7473P0DBBD5Y6\", \"KS123K75YYK8VGH90NCS\", \"KS1264H6GVR1FW7B62YZ\", \"KS440FS71DJY51ZPZR0Q\", \"KS120ST66K9HBSZ7MPS3\", \"KS7YXWLEAKN8QOFDFVS2\", \"KS441BJ6LNS1QCJHRMTW\", \"KS0MUJGS1UTCN6QBYSB6\", \"KS128HD6KJSZMPK72WSF\", \"KSUOK8Y8NQ2YVBFO4IH5\", \"KS125JW6MFF4MZ1QZNPP\", \"KSA8049RVCG293NL3IY2\", \"KS123RJ5XGVSRR6CH0MS\", \"KSYD2ESJZLDF3EEES3UY\", \"KS441BJ71ZQZRPLDVTMB\", \"KS440W3640PNXPGB5MSW\", \"KSVMYR5F3MF8ME0MBN3Q\"], \"categories\": [\"all\"], \"language\": \"nl\", \"output_language\": \"nl\", \"threshold\": 0}";
	        
	        
			/*json.put("code_ids", codeIdsArray);
	        json.put("categories", "Front");
	        json.put("languages", "nl");
	        json.put("output_language", "nl");
	        json.put("threshold", "0");
	        
	        String body=json.toJSONString();*/
			
	        //System.out.println(body);
	        
			request.body(jsonString);
			
			Response resp=request.post("https://younited-management-payment-acc.nowonline.nl/SkillsLookup");
			int scode=resp.getStatusCode();
			System.out.println("Status code: "+scode);
			
			String data=resp.asPrettyString();
			System.out.println("Response data: "+data);
			
		}

}
