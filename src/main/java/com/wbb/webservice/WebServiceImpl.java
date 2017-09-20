package com.wbb.webservice;

import javax.jws.WebService;

@WebService
public class WebServiceImpl implements MyWebService {

	public String sayHello() {
		System.out.println("≤‚ ‘WebService");
		return "≤‚ ‘WebService";
	}

}
