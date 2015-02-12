package com.example.switchyard.xml_validation;

import org.switchyard.annotations.Transformer;

public final class HelloTransformers {

	@Transformer(to = "person")
	public String transformStringToPerson(String from) {
		return from;
	}

}
