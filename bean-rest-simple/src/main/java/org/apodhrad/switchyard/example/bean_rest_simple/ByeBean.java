package org.apodhrad.switchyard.example.bean_rest_simple;

import org.switchyard.component.bean.Service;

@Service(Bye.class)
public class ByeBean implements Bye {

	@Override
	public String sayBye(String name) {
		return "Bye " + name;
	}

}
