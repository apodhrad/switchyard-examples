package com.example.switchyard.rest_example;

import javax.inject.Inject;

import org.switchyard.component.bean.Reference;
import org.switchyard.component.bean.Service;

@Service(Hello.class)
public class HelloBean implements Hello {

	@Inject
	@Reference("GitHub")
	private GitHub github;

	@Override
	public String sayHello(String name) {
		return "Hello " + github.getPerson(name).getName();
	}

}
