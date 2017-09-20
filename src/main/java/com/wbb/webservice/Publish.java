package com.wbb.webservice;

import javax.xml.ws.Endpoint;

public class Publish {

	public static void main(String[] args) {
		String address="http://localhost:8080/WS_Server/Webservice";
		Endpoint.publish(address, new WebServiceImpl());
		System.out.println("≤‚ ‘∑¢≤º");
	}
}
