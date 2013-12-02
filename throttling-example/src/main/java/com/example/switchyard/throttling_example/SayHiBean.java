package com.example.switchyard.throttling_example;

import org.switchyard.component.bean.Service;

@Service(SayHi.class)
public class SayHiBean implements SayHi {

	@Override
	public String sayHi(String name) {
		return "Hi " + name;
	}

}
