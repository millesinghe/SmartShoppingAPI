package com.genesislab.webservice.handle;

import org.json.JSONObject;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.genesislab.smart.utility.JSONHandler;

public class WSModel {

	public JSONObject doJSONResponse() throws JsonProcessingException {
		JSONHandler jsonHandler = new JSONHandler();
		jsonHandler.objectTostrJSON(this);
		return null;
		
	}
}
