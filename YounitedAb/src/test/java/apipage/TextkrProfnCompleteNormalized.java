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
			request.header("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCIsImtpZCI6IlcwYXpDb2U3QjQ1MGszWnBUc2t0RSJ9.eyJuaWNrbmFtZSI6ImxiK2FjYy1hZG1pbiIsIm5hbWUiOiJsYithY2MtYWRtaW5Abm93b25saW5lLm5sIiwicGljdHVyZSI6Imh0dHBzOi8vcy5ncmF2YXRhci5jb20vYXZhdGFyLzM3NzNkMjg2MDA4ZTQzMzQ5ZDBmYjk3YzY4YjkzOGMzP3M9NDgwJnI9cGcmZD1odHRwcyUzQSUyRiUyRmNkbi5hdXRoMC5jb20lMkZhdmF0YXJzJTJGbGIucG5nIiwidXBkYXRlZF9hdCI6IjIwMjQtMDEtMDRUMTQ6NDg6NDQuOTk3WiIsImVtYWlsIjoibGIrYWNjLWFkbWluQG5vd29ubGluZS5ubCIsImVtYWlsX3ZlcmlmaWVkIjpmYWxzZSwiaXNzIjoiaHR0cHM6Ly9hY2MteW91bml0ZWQuZXUuYXV0aDAuY29tLyIsImF1ZCI6ImY5UjFVZ2R5SXRKZ2M2NGozMldpZnRwNkRsbGE4WFZvIiwiaWF0IjoxNzA0Mzc5NzI5LCJleHAiOjE3MDQ1NTI1MjksInN1YiI6ImF1dGgwfDY0OWMyMDZlMTQwNTNmYWI1OGFkZmI0OSIsImF1dGhfdGltZSI6MTcwNDM3OTcyNSwic2lkIjoiLWFHX19QYkVBbDdNUDAyNkdSM3d6MVRvd19SLU1MM3MifQ.YSJI37m-bkk_D_FrmcFijmVUUkdCiZ5Fp16WiXfI_ybq7LcBY20J0GZXBq1gvEdM3Rzcu6hFeyt5bKD7oWpld-hKzJhNsLx2RKob62xX_2U-n3N-6h5zhCDbxbVPC1uqN1PHmXidxpMANG2SIQFeonbsyp_icFAO4QD_u7XVc-yFV6tml6UMXYmsj4-LQd22P-AoemtuadNSfqtTGUq77Y-ZVkUHloGRwFaz8jPCCGfiQBCgkIwFtgZhoOhzOWqd1iLs3kdvo7pbhW9yOErtTWCleLLG3L23awiM8_JmltmTnXXsJqg38idTapH0ARQRKZNFhvBwJfguRzojjCULOQ");
			
			//JSONObject json=new JSONObject();
			//json.put("categories", "all");
			//json.put("prefix", "Front");
			//json.put("languages", "nl");
			//json.put("output_language", "nl");
			
			request.body("{ \"categories\": [ \"all\" ], \"prefix\": \"Front\", \"languages\": [ \"nl\" ], \"output_language\": \"nl\" }");
			
			//request.body(json.toJSONString());
			
			Response response=request.post("https://younited-management-payment-acc.nowonline.nl/CompleteNormalized");
			
			int code=response.getStatusCode();
			System.out.println("TextKernel- Status code is: "+code);
			
			Assert.assertEquals(code, 200);
			
			//String data=response.asString();
			String data=response.asPrettyString();
			System.out.println("Response data is: "+data);
						
		}

}
