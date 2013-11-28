package com.example.switchyard.bpmn_example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.switchyard.Message;
import org.switchyard.Property;
import org.switchyard.component.test.mixins.cdi.CDIMixIn;
import org.switchyard.component.test.mixins.http.HTTPMixIn;
import org.switchyard.test.Invoker;
import org.switchyard.test.ServiceOperation;
import org.switchyard.test.SwitchYardRunner;
import org.switchyard.test.SwitchYardTestCaseConfig;

@RunWith(SwitchYardRunner.class)
@SwitchYardTestCaseConfig(config = SwitchYardTestCaseConfig.SWITCHYARD_XML, mixins = {CDIMixIn.class, HTTPMixIn.class})
public class HelloTest {

	@ServiceOperation("MyService")
	private Invoker service;
	
	private HTTPMixIn httpMixIn;

	@Test
	public void testSayHello() throws Exception {
		Message msg = service.operation("start").sendInOut("World");
		System.out.println("message.content = " + msg.getContent());
		
		System.out.println("** SIGNAL ***");
		msg = service.operation("signal").property("{urn:switchyard-component-bpm:bpm:1.0}processInstanceId", "1").sendInOut("aaa");
	}
	
	@Test
	public void testHttpService() {
		String result = httpMixIn.postString("http://localhost:8080/start", "andrej");
		System.out.println(result);
	}
	
	public static void debug(Message msg) {
		System.out.println("*** DEBUG ***");
		for(Property p: msg.getContext().getProperties()) {
			System.out.println(p.getName() + " = " + p.getValue());
		}
	}
	

}
