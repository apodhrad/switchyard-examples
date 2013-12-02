package com.example.switchyard.throttling_example;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.switchyard.component.test.mixins.cdi.CDIMixIn;
import org.switchyard.component.test.mixins.http.HTTPMixIn;
import org.switchyard.test.Invoker;
import org.switchyard.test.ServiceOperation;
import org.switchyard.test.SwitchYardRunner;
import org.switchyard.test.SwitchYardTestCaseConfig;

@RunWith(SwitchYardRunner.class)
@SwitchYardTestCaseConfig(config = SwitchYardTestCaseConfig.SWITCHYARD_XML, mixins = {
		CDIMixIn.class, HTTPMixIn.class })
public class SayHelloServiceTest {

	public static final String URL = "http://localhost:8080/hello";

	private HTTPMixIn httpMixIn;
	@ServiceOperation("SayHelloService")
	private Invoker service;

	@Test
	public void testSayHello() throws Exception {
		System.out.println(new Date() + "\t#1");
		assertEquals("Hello apodhrad", httpMixIn.postString(URL, "apodhrad"));
		System.out.println(new Date() + "\t#2");
		assertEquals("Hello apodhrad", httpMixIn.postString(URL, "apodhrad"));
		System.out.println(new Date() + "\t#3");
		assertEquals("Hello apodhrad", httpMixIn.postString(URL, "apodhrad"));
		System.out.println(new Date() + "\t#4");
		assertEquals("Hello apodhrad", httpMixIn.postString(URL, "apodhrad"));
	}
}
