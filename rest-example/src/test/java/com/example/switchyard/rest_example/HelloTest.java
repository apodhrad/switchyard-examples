package com.example.switchyard.rest_example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.switchyard.component.bean.config.model.BeanSwitchYardScanner;
import org.switchyard.component.test.mixins.cdi.CDIMixIn;
import org.switchyard.test.Invoker;
import org.switchyard.test.ServiceOperation;
import org.switchyard.test.SwitchYardRunner;
import org.switchyard.test.SwitchYardTestCaseConfig;
import org.switchyard.test.SwitchYardTestKit;
import org.switchyard.transform.config.model.TransformSwitchYardScanner;

@RunWith(SwitchYardRunner.class)
@SwitchYardTestCaseConfig(config = SwitchYardTestCaseConfig.SWITCHYARD_XML, mixins = { CDIMixIn.class }, scanners = { BeanSwitchYardScanner.class, TransformSwitchYardScanner.class })
public class HelloTest {

	private SwitchYardTestKit testKit;
	private CDIMixIn cdiMixIn;
	@ServiceOperation("Hello")
	private Invoker service;

	@Test
	public void testSayHello() throws Exception {
		// TODO Auto-generated method stub
		// initialize your test message
		String name = "apodhrad";
		String result = service.operation("sayHello").sendInOut(name)
				.getContent(String.class);

		// validate the results
		Assert.assertEquals("Hello Andrej Podhradsky", result);
	}

}
