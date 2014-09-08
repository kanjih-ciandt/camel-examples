package com.kanjih.camel.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.kanjih.camel.ws.Animais;

public class PosCleanProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		System.out.println(exchange);
		
	}

}
