package com.example.switchyard.composer_example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.switchyard.component.test.mixins.cdi.CDIMixIn;
import org.switchyard.component.test.mixins.http.HTTPMixIn;
import org.switchyard.test.Invoker;
import org.switchyard.test.ServiceOperation;
import org.switchyard.test.SwitchYardRunner;
import org.switchyard.test.SwitchYardTestCaseConfig;
import org.switchyard.test.SwitchYardTestKit;

@RunWith(SwitchYardRunner.class)
@SwitchYardTestCaseConfig(config = SwitchYardTestCaseConfig.SWITCHYARD_XML, mixins = {
		CDIMixIn.class, HTTPMixIn.class })
public class HelloTest {

	private SwitchYardTestKit testKit;
	private CDIMixIn cdiMixIn;
	private HTTPMixIn httpMixIn;
	@ServiceOperation("Hello")
	private Invoker service;

	@Test
	public void testSayHello() throws Exception {
		String result = service.operation("sayHello").sendInOut("World")
				.getContent(String.class);

		// validate the results
		Assert.assertEquals("Hello World", result);
	}

	@Test
	public void testHttpBinding() {
		Assert.assertEquals("Hello sayHello",
				httpMixIn.postString("http://localhost:8080/hello", "sayHello"));
		Assert.assertEquals("Hi sayHi",
				httpMixIn.postString("http://localhost:8080/hello", "sayHi"));
		Assert.assertEquals("Hey sayHey",
				httpMixIn.postString("http://localhost:8080/hello", "sayHey"));
	}

}
