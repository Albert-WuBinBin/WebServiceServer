package com.wbb.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface MyWebService {
	
	@WebMethod
	String sayHello();
}
