package com.example.switchyard.composer_example;

import org.switchyard.component.bean.Service;

@Service(Hello.class)
public class HelloBean implements Hello {

	@Override
	public String sayHello(String name) {
		return "Hello " + name;
	}

	@Override
	public String sayHi(String name) {
		return "Hi " + name;
	}

	@Override
	public String sayHey(String name) {
		return "Hey " + name;
	}

}
