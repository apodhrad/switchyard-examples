package org.apodhrad.switchyard.example.bean_http_composer;

import org.switchyard.Exchange;
import org.switchyard.Message;
import org.switchyard.component.http.composer.HttpBindingData;
import org.switchyard.component.http.composer.HttpMessageComposer;

public class HttpPersonComposer extends HttpMessageComposer {
	@Override
	public Message compose(HttpBindingData source, Exchange exchange) throws Exception {
		final Message message = exchange.createMessage();

		getContextMapper().mapFrom(source, exchange.getContext(message));

		String body = source.getBodyAsString();
		
		String[] value = body.split(" ");
		Person person = new Person(value[0], Integer.valueOf(value[1]));

		message.setContent(person);
		
		return message;
	}

}
