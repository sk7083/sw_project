
package com.kh.sw.Controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.mysql.cj.xdevapi.JsonArray;
import com.mysql.cj.xdevapi.JsonParser;

public class ApiExplorer {
	public static void main(String[] args) throws IOException, ParseException {
		
        		
		StringBuilder urlBuilder = new StringBuilder("http://openapi.seoul.go.kr:8088/795744595a736b3739386e45524543/json/LOCALDATA_031101/1/5/"); /*URL*/
		urlBuilder.append("/" +  URLEncoder.encode("795744595a736b3739386e45524543","UTF-8") ); /*�씤利앺궎 (sample�궗�슜�떆�뿉�뒗 �샇異쒖떆 �젣�븳�맗�땲�떎.)*/
		urlBuilder.append("/" +  URLEncoder.encode("json","UTF-8") ); /*�슂泥��뙆�씪���엯 (xml,xmlf,xls,json) */
		urlBuilder.append("/" + URLEncoder.encode("LOCALDATA_031101","UTF-8")); /*�꽌鍮꾩뒪紐� (���냼臾몄옄 援щ텇 �븘�닔�엯�땲�떎.)*/
		urlBuilder.append("/" + URLEncoder.encode("1","UTF-8")); /*�슂泥��떆�옉�쐞移� (sample�씤利앺궎 �궗�슜�떆 5�씠�궡 �닽�옄)*/
		urlBuilder.append("/" + URLEncoder.encode("5","UTF-8")); /*�슂泥�醫낅즺�쐞移�(sample�씤利앺궎 �궗�슜�떆 5�씠�긽 �닽�옄 �꽑�깮 �븞 �맖)*/
		// �긽�쐞 5媛쒕뒗 �븘�닔�쟻�쑝濡� �닚�꽌諛붽씀吏� �븡怨� �샇異쒗빐�빞 �빀�땲�떎.
		
		// �꽌鍮꾩뒪蹂� 異붽� �슂泥� �씤�옄�씠硫� �옄�꽭�븳 �궡�슜�� 媛� �꽌鍮꾩뒪蹂� '�슂泥��씤�옄'遺�遺꾩뿉 �옄�꽭�엳 �굹�� �엳�뒿�땲�떎.
//		urlBuilder.append("/" + URLEncoder.encode("20220301","UTF-8")); /* �꽌鍮꾩뒪蹂� 異붽� �슂泥��씤�옄�뱾*/
		
		URL url = new URL(urlBuilder.toString());
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Content-type", "application/json");
		System.out.println("Response code: " + conn.getResponseCode()); /* �뿰寃� �옄泥댁뿉 ���븳 �솗�씤�씠 �븘�슂�븯誘�濡� 異붽��빀�땲�떎.*/
		BufferedReader rd;

		// �꽌鍮꾩뒪肄붾뱶媛� �젙�긽�씠硫� 200~300�궗�씠�쓽 �닽�옄媛� �굹�샃�땲�떎.
		if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
				rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		} else {
				rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
		}
		StringBuilder sb = new StringBuilder();
		String line;
		while ((line = rd.readLine()) != null) {
				sb.append(line);
		}
		rd.close();
		conn.disconnect();
		 System.out.println(sb.toString());
		 System.out.println("=================================");
		 
		 
		 JSONParser parser = new JSONParser();
		 
		 Object obj =  parser.parse(sb.toString());


		 
//		 JSONObject obj = (JSONObject) parser.parse(sb);
		 
//		 System.out.println("�솗�씤 : "+obj.get("BPLCNM"));
		 
//		 JSONArray jsonarray = (JSONArray) parser.parse(rd);
//		 for(int i =0; i<jsonarray.size(); i++) {
//			 JSONObject obj = (JSONObject) jsonarray.get(i);
//			 String BPLCNM = (String) obj.get("BPLCNM");
//			 sb.append(BPLCNM+"");
//		 }
//		 System.out.println(sb.toString());
		 

		 
		 
//		 JsonParser parser = new JsonParser();
//		 
//		  JSONParser parser = new JSONParser();
//		  System.out.println("parser �솗�씤 : "+parser);
//	       Object obj = parser.parse(sb.toString()); 
	       
//	       System.out.println("obj �솗�씤 : "+obj);
//	       // obj瑜� JsonArray濡� cast
//	        JSONArray jsonArr = (JSONArray)obj;
//	        System.out.println("jsonArr �솗�씤 : "+jsonArr);
//	        if (jsonArr.size() > 0){
//	            for(int i=0; i<jsonArr.size(); i++){
//	                JSONObject jsonObj = (JSONObject)jsonArr.get(i);
//	                
//	                
//	                System.out.println((String)jsonObj.get("BPLCNM")); 
//	            }
//	            // StudyingAzae, Soodal 異쒕젰
//	        }     
//		 JSONObject jsonMain = (JSONObject)obj;
//		 
//		 System.out.println("�솗�씤" + jsonMain.get(jsonMain));
	}
}