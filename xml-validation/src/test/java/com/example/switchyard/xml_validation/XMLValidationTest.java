package com.example.switchyard.xml_validation;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.switchyard.component.test.mixins.cdi.CDIMixIn;
import org.switchyard.component.test.mixins.http.HTTPMixIn;
import org.switchyard.test.SwitchYardRunner;
import org.switchyard.test.SwitchYardTestCaseConfig;

@RunWith(SwitchYardRunner.class)
@SwitchYardTestCaseConfig(config = SwitchYardTestCaseConfig.SWITCHYARD_XML, mixins = { CDIMixIn.class, HTTPMixIn.class })
public class XMLValidationTest {

	private HTTPMixIn httpMixIn;

	@Test
	public void correctTest() throws Exception {
		String response = httpMixIn.postResource("http://localhost:8080/hello", "person_correct.xml");
		assertEquals("Hello Andrej", response);
	}

	@Test
	public void incorrectTest() throws Exception {
		String response = httpMixIn.postResource("http://localhost:8080/hello", "person_incorrect.xml");
		Assert.assertTrue("Unexpected response: " + response, response.contains("validation error"));
	}

}
