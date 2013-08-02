package org.apodhrad.switchyard.example.bean_soap_simple;

import org.switchyard.component.bean.Service;

@Service(Hello.class)
public class HelloBean implements Hello {

	@Override
	public String sayHi(String name) {
		return "Hi " + name;
	}

}
