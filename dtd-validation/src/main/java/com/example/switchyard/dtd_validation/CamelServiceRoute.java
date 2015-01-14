package com.example.switchyard.dtd_validation;

import org.apache.camel.builder.RouteBuilder;

public class CamelServiceRoute extends RouteBuilder {

	/**
	 * The Camel route is configured via this method.  The from endpoint is required to be a SwitchYard service.
	 */
	public void configure() {
		// TODO Auto-generated method stub
		from("switchyard://HelloService").log(
				"Received message for 'HelloService' : ${body}").setBody(simple("Hello ${body.name} ${body.surname}!"));
	}

}
