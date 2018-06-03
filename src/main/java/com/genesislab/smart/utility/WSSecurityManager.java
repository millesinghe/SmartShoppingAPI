package com.genesislab.smart.utility;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;

public class WSSecurityManager implements ContainerResponseFilter {

	public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext) throws IOException {
	
		if(responseContext.getHeaders().get("Allow-Control-Allow-Origin") == null) {
			responseContext.getHeaders().add("Allow-Control-Allow-Origin", "*");
		}
		if(responseContext.getHeaders().get("Allow-Control-Allow-Method") == null) {
			responseContext.getHeaders().add("Allow-Control-Allow-Method", "POST,GET,PUT");
		}
		if(responseContext.getHeaders().get("Allow-Control-Allow-Headers") == null) {
			responseContext.getHeaders().add("Allow-Control-Allow-Headers", "accept, content-type");
		}
	}
	
	

}