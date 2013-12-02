package com.example.switchyard.composer_example;

import javax.xml.namespace.QName;

import org.switchyard.component.http.composer.HttpBindingData;
import org.switchyard.component.http.selector.HttpOperationSelector;
import org.switchyard.config.model.selector.OperationSelectorModel;


public class MySelector extends HttpOperationSelector {

	public MySelector(OperationSelectorModel model) {
		super(model);
	}

	@Override
	public QName selectOperation(HttpBindingData content) throws Exception {
		System.out.println(content.getBodyAsString());
		QName qName = new QName("urn:com.example.switchyard:composer-example:1.0", "sayHi");
		return qName;	
	}
	
}
