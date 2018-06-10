package com.genesislab.webservice.handle;

import java.io.IOException;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.genesislab.smart.utility.JSONHandler;
import com.genesislab.webserivce.model.AvailableItems;
import com.genesislab.webserivce.model.SubmitOrder;
import com.genesislab.webserivce.model.UpdateItemStatus;
import com.genesislab.webserivce.model.UpdateOrderStatus;

@Path("smartshopping")
public class WSRequestMapper {

	@GET
	@Path("getAvailabeItems/{shopId}/{date}")
	public String getAvailabeItems(@PathParam("shopId") String id, @PathParam("date") String date) {
		JSONHandler jsonhandle = new JSONHandler();
		AvailableItems available = new AvailableItems();
		String retrunJSON = null;
		try {
			retrunJSON = jsonhandle.objectTostrJSON(available);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return retrunJSON;
	}
	
	@GET
	@Path("getOrderList/{shopId}/{empId}")
	public String getOrderList(@PathParam("shopId") String id, @PathParam("empId") String date) {
		JSONHandler jsonhandle = new JSONHandler();
		AvailableItems available = new AvailableItems();
		String retrunJSON = null;
		try {
			retrunJSON = jsonhandle.objectTostrJSON(available);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return retrunJSON;
	}

	@Path("/submitOrder")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public String submitOrder(String req) {
		JSONHandler jsonhandle = new JSONHandler();
		String decodeJSON = jsonhandle.decodeRequest(req);
		try {
			Object objrequest = jsonhandle.strJSONToObject(decodeJSON, SubmitOrder.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.err.println(decodeJSON);
		return null;

	}
	

	@Path("/updateItemStatus")
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	public String updateItemStatus(String req) {
		JSONHandler jsonhandle = new JSONHandler();
		String decodeJSON = jsonhandle.decodeRequest(req);
		try {
			Object objrequest = jsonhandle.strJSONToObject(decodeJSON, UpdateItemStatus.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.err.println(decodeJSON);
		return null;

	}

	@Path("/updateOrderStatus")
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	public String UpdateOrderStatus(String req) {
		JSONHandler jsonhandle = new JSONHandler();
		String decodeJSON = jsonhandle.decodeRequest(req);
		try {
			Object objrequest = jsonhandle.strJSONToObject(decodeJSON, UpdateOrderStatus.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.err.println(decodeJSON);
		return null;

	}

	
	/*
	 * @POST
	 * 
	 * @Consumes({MediaType.APPLICATION_JSON})
	 * 
	 * @Produces(MediaType.APPLICATION_JSON)
	 * 
	 * @Path("getAvailabeItems") public String getAvailabeItems(AvailableItems
	 * req) { req.getAvailableIdList(); System.out.println(req); return null;
	 * 
	 * }
	 */

}