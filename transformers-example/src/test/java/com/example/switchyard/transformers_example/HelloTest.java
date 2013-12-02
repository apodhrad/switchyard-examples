package com.example.switchyard.transformers_example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.switchyard.component.test.mixins.cdi.CDIMixIn;
import org.switchyard.component.test.mixins.http.HTTPMixIn;
import org.switchyard.test.Invoker;
import org.switchyard.test.ServiceOperation;
import org.switchyard.test.SwitchYardRunner;
import org.switchyard.test.SwitchYardTestCaseConfig;

@RunWith(SwitchYardRunner.class)
@SwitchYardTestCaseConfig(config = SwitchYardTestCaseConfig.SWITCHYARD_XML, exclude = "soap", mixins = {
		CDIMixIn.class, HTTPMixIn.class })
public class HelloTest {

	private HTTPMixIn httpMixIn;
	@ServiceOperation("Hello")
	private Invoker service;

	@Test
	public void testSayHello() throws Exception {
		Person person = new Person();
		person.setName("Andrej");
		Result result = new Result();
		result.setGreeting("Hello Andrej!");
		assertEquals(result, service.operation("sayHello").sendInOut(person)
				.getContent(Result.class));
	}

}
