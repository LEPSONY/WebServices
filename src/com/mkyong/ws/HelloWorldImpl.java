package com.mkyong.ws;
 
import javax.jws.WebService;
 
//Service Implementation
@WebService(endpointInterface = "com.mkyong.ws.HelloWorld")
public class HelloWorldImpl implements HelloWorld{
 
	@Override
	public String getHelloWorldAsString(String name) {
		name = "Michał";
		return "Hello World JAX-WS zXZXZZX" + name;
	}

	@Override
	public int getHelloNumberCount(String name) {
		int numCount = name.length();
		return numCount;
	}

}