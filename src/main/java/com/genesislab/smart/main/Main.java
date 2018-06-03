package com.genesislab.smart.main;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerlLauncher server = new ServerlLauncher();
		try {
			server.launch();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("aaa");
	}

}
