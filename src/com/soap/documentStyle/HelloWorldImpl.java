package com.soap.documentStyle;

import javax.jws.WebService;

//Service Implementation
@WebService(endpointInterface = "com.soap.documentStyle.HelloWorld")
public class HelloWorldImpl implements HelloWorld{
//wsgen -keep -cp . com.soap.documentStyle.HelloWorldImpl
	@Override
	public String getHelloWorldAsString(String name) {
		return "Hello World JAX-WS " + name;
	}

}