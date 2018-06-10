package com.genesislab.smart.utility;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
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

    public Object strJSONToObject(String strJson, Class<?> clz) throws JsonParseException, JsonMappingException, IOException{
    	ObjectMapper objectMapper = new ObjectMapper();
    	Object retrunObj = objectMapper.readValue(strJson, clz);
    	return retrunObj;
    }
    
    public String objectTostrJSON(WSModel wsReponseHandler) throws JsonProcessingException{
    	ObjectMapper objectMapper = new ObjectMapper();
    	String objJson = objectMapper.writeValueAsString(wsReponseHandler);
    	return objJson;
    }
    
    public String resolveDateTimeStrJSON( Class<?> obj) throws JsonProcessingException{
    	ObjectMapper objectMapper = new ObjectMapper();
    	DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm a z");
    	objectMapper.setDateFormat(df);
    	String objJson = objectMapper.writeValueAsString(obj);
    	return objJson;
    }
}