package com.example.switchyard.rest_example;

import org.jboss.resteasy.client.core.BaseClientResponse;
import org.switchyard.annotations.Transformer;

public final class Transformers {

	@Transformer
	public Person transformResponseToPerson(BaseClientResponse<Person> from) {
		Person body = (Person) from.getEntity(Person.class);
		return body;
	}

}
