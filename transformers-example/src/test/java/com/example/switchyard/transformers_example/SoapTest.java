package com.example.switchyard.transformers_example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.switchyard.component.test.mixins.cdi.CDIMixIn;
import org.switchyard.component.test.mixins.http.HTTPMixIn;
import org.switchyard.test.SwitchYardRunner;
import org.switchyard.test.SwitchYardTestCaseConfig;

@RunWith(SwitchYardRunner.class)
@SwitchYardTestCaseConfig(config = SwitchYardTestCaseConfig.SWITCHYARD_XML, mixins = {
		CDIMixIn.class, HTTPMixIn.class }, exclude = "http")
public class SoapTest {

	private HTTPMixIn httpMixIn;

	@Test
	public void testSoapBinding() {
		httpMixIn.postResourceAndTestXML("http://localhost:8080/foo/Hello",
				"xml/soap-request.xml", "xml/soap-response.xml");
	}

}
