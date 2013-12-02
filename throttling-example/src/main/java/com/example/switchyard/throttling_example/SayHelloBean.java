package com.example.switchyard.throttling_example;

import org.switchyard.component.bean.Service;

@Service(SayHello.class)
public class SayHelloBean implements SayHello {

	@Override
	public String sayHello(String name) {
		return "Hello " + name;
	}

}
