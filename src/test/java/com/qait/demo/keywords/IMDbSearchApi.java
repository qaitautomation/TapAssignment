package com.qait.demo.keywords;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONException;
import org.json.JSONObject;

public class IMDbSearchApi {

	public JSONObject searchForMovie(String movie) throws IOException {

		URL url = new URL("http://www.omdbapi.com/?s="+movie.replace(" ","%20"));
		HttpURLConnection conn = (HttpURLConnection)url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Accept", "application/json");
		if (conn.getResponseCode() != 200) {
			throw new RuntimeException("Failed : HTTP error code : "
					+ conn.getResponseCode());
		}

		BufferedReader br = new BufferedReader(new InputStreamReader(
			(conn.getInputStream())));

		String output=null;
		StringBuffer out=new StringBuffer();
		
		
		while ((output=br.readLine()) != null) {
			   out.append(output); 
			
		}
     
		conn.disconnect();
		JSONObject jsonObject=null;
		 try {
			 jsonObject=new JSONObject(out.toString());
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jsonObject;
	}

}
