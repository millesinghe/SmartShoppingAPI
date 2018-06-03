package com.genesislab.smart.utility;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("smartshopping")
public class WSRequestMapper {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String get() {
		return "\n This is Crunchify REST API via HTTPServer";
	}

}