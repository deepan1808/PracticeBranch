package com.deeps.Prac;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class URLPrac {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		try {
			URL url = new URL("https://jsonplaceholder.typicode.com/po");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			int rescode=connection.getResponseCode();
			System.out.println(rescode);
			if (rescode==HttpURLConnection.HTTP_OK) {
				System.out.println(connection.getInputStream());
				BufferedReader reader =new BufferedReader(new InputStreamReader(connection.getInputStream()));
				System.out.println(reader);
				StringBuilder response = new StringBuilder();
				String inpLine;
				while((inpLine=reader.readLine()) !=null) {
					response.append(inpLine);
				}
				reader.close();
				System.out.println(response.toString());
				String Resppp=response.toString();
				//JSONObject jj = new JSONObject();
			}
			
			else {
				throw new Exception("Error in Response "+rescode);
			}
		}catch(Exception e) {
			throw new Exception("OverallException"+e.getMessage());
		}
		
		

	}

}
