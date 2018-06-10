package com.genesislab.smart.main;

import java.io.IOException;
import java.net.InetAddress;
import java.net.URI;
import java.net.UnknownHostException;

import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.jdkhttp.JdkHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import com.genesislab.webservice.handle.WSRequestMapper;
import com.genesislab.webservice.handle.WSSecurityManager;
import com.sun.net.httpserver.HttpServer;

public class ServerlLauncher {

	HttpServer httpserver;

	public void launch() throws IOException {
		System.out.println("Starting Smart Shopping Embedded Jersey HTTPServer...\n");
		HttpServer smartShoppingServer = createHttpServer();
		//crunchifyHTTPServer.start();
		System.out.println(
				String.format("\nJersey Application Server started with WADL available at " + "%sapi",
						baseURL()));
		System.out.println("Started Smart Shopping Embedded Jersey HTTPServer Successfully !!!");

	}

	private HttpServer createHttpServer() {
		ResourceConfig resourceConfig = new ResourceConfig(WSRequestMapper.class);
		resourceConfig.register(WSSecurityManager.class);
		return JdkHttpServerFactory.createHttpServer(baseURL(), resourceConfig);
	}

	 private static URI baseURL() {
	        return UriBuilder.fromUri("http://" + crunchifyGetHostName() + "/").port(8085).build();
	    }
	 
	    private static String crunchifyGetHostName() {
	        String hostName = "localhost";
	        try {
	            hostName = InetAddress.getLocalHost().getCanonicalHostName();
	        } catch (UnknownHostException e) {
	            e.printStackTrace();
	        }
	        return hostName;
	    }
}
