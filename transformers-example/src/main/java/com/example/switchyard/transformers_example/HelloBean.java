package com.example.switchyard.transformers_example;

import org.switchyard.component.bean.Service;

@Service(Hello.class)
public class HelloBean implements Hello {

	@Override
	public Result sayHello(Person person) {
		Result result = new Result();
		result.setGreeting("Hello " + person.getName() + "!");
		return result;
	}

}
