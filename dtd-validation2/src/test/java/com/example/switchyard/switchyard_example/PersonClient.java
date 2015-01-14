package com.example.switchyard.switchyard_example;

import org.switchyard.component.test.mixins.http.HTTPMixIn;

public class PersonClient {

	public static void main(String[] args) {
		HTTPMixIn httpMixIn = new HTTPMixIn();
		httpMixIn.initialize();
		
		String result = httpMixIn.postFile("http://localhost:8080/print", "src/test/resources/message_valid.xml");
		System.out.println(result);
	}
}
