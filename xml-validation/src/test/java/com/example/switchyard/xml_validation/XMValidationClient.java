package com.example.switchyard.xml_validation;

import org.switchyard.component.test.mixins.http.HTTPMixIn;

public class XMValidationClient {
	
	public static final String URL = "http://localhost:8080/hello";
	public static final String WITH_DTD = "src/test/resources/person_correct_with_dtd.xml";
	public static final String WITHOUT_DTD = "src/test/resources/person_correct.xml";

	public static void main(String[] args) {
		HTTPMixIn httpMixIn = new HTTPMixIn();
		httpMixIn.initialize();

		try {
			String response1 = httpMixIn.postFile(URL, WITH_DTD);
			System.out.println("*** With DTD ***");
			System.out.println(response1);
			System.out.println();
			String response2 = httpMixIn.postFile(URL, WITHOUT_DTD);
			System.out.println("*** Without DTD ***");
			System.out.println(response2);
		} finally {
			httpMixIn.uninitialize();
		}
	}
}
