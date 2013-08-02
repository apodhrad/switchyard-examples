package org.apodhrad.switchyard.example.bean_soap_simple;

import org.switchyard.annotations.Transformer;
import org.w3c.dom.Element;

public final class HelloTransformer {

	@Transformer(to = "{urn:org.apodhrad.switchyard.example:bean-soap-simple:1.0}sayHiResponse")
	public String transformStringToSayHelloResponse(String from) {
		return "<sayHelloResponse xmlns=\"urn:org.apodhrad.switchyard.example:bean-soap:1.0\"><string>"
				+ from + "</string></sayHelloResponse>";
	}

	@Transformer(from = "{urn:org.apodhrad.switchyard.example:bean-soap-simple:1.0}sayHi")
	public String transformSayHelloToString(Element from) {
		return from.getTextContent().trim();
	}
}
