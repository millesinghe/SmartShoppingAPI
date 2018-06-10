package com.genesislab.smart.utility;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.json.JSONObject;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.genesislab.webserivce.model.AvailableItems;
import com.genesislab.webservice.handle.WSModel;

/**
 * 
 */
public class JSONHandler {

	/**
	 * Default constructor
	 */
	public JSONHandler() {
	}

	public Object strJSONToObject(String strJson, Class<?> clz)
			throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper objectMapper = null;
		try {
			objectMapper = new ObjectMapper();
		} catch (Exception e) {
			e.printStackTrace();
		}
		Object retrunObj = objectMapper.readValue(strJson, clz);
		return retrunObj;
	}

	public String objectTostrJSON(Object cls) throws JsonProcessingException {
		ObjectMapper objectMapper = new ObjectMapper();
		String objJson = objectMapper.writeValueAsString(cls);
		return objJson;
	}

	public String resolveDateTimeStrJSON(Class<?> obj) throws JsonProcessingException {
		ObjectMapper objectMapper = new ObjectMapper();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm a z");
		objectMapper.setDateFormat(df);
		String objJson = objectMapper.writeValueAsString(obj);
		return objJson;
	}
	
	public String decodeRequest(String req) {
		String decodeRequest = null;
		try {
			decodeRequest = URLDecoder.decode (req,"UTF-8").replace("data=", "");
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return decodeRequest;
	}
	
	public String encodeResponse(String req) {
		String encodeRequest = null;
		try {
			encodeRequest = URLEncoder.encode (req,"UTF-8");
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return encodeRequest;
	}
}