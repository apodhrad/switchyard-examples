package org.apodhrad.switchyard.example.bean_http_composer;

import org.switchyard.component.bean.Service;

@Service(Hello.class)
public class HelloBean implements Hello {

	@Override
	public String sayHello(Person person) {
		return "Hello " + person.getName() + "; you age is " + person.getAge();
	}

}
