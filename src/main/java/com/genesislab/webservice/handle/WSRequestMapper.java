package com.genesislab.webservice.handle;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.json.JSONObject;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.genesislab.webserivce.model.AvailableItems;

@Path("smartshopping")
public class WSRequestMapper {

	@GET
	@Path("getAvailabeItems/{shopId}/{date}")
	@Produces(MediaType.APPLICATION_JSON)
    public JSONObject getAvailabeItems(@PathParam("shopId") String id,@PathParam("date") String date) {
		AvailableItems available = new AvailableItems();
		JSONObject retrunJSON = null;
		try {
			retrunJSON = available.doJSONResponse();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return retrunJSON;
    }

	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces(MediaType.APPLICATION_JSON)
	@Path("getAvailabeItems")
	public String getAvailabeItems(AvailableItems req) {
		req.getAvailableIdList();
		System.out.println(req);
		return null;

	}

	/*@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces(MediaType.APPLICATION_JSON)
	@Path("getAvailabeItems")
	public String getAvailabeItems(AvailableItems req) {
		req.getAvailableIdList();
		System.out.println(req);
		return null;

	}*/

}