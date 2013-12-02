package com.example.switchyard.transformers_example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.switchyard.component.test.mixins.cdi.CDIMixIn;
import org.switchyard.component.test.mixins.http.HTTPMixIn;
import org.switchyard.test.SwitchYardRunner;
import org.switchyard.test.SwitchYardTestCaseConfig;

@RunWith(SwitchYardRunner.class)
@SwitchYardTestCaseConfig(config = SwitchYardTestCaseConfig.SWITCHYARD_XML, mixins = {
		CDIMixIn.class, HTTPMixIn.class }, exclude = "soap")
public class HttpTest {

	private HTTPMixIn httpMixIn;

	@Test
	public void testHttpBinding() {
		String result = httpMixIn.postString("http://localhost:8080/hello",
				"{\"name\": \"Andrej\", \"age\": \"28\"}");
		assertEquals("{\"greeting\":\"Hello Andrej!\"}", result);
	}

}
