package com.kanjih.camel.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.kanjih.camel.ws.Animais;

public class AposProcuraNomeProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		 
		Animais object = exchange.getIn().getBody(Animais.class);
		
		if(object.getNomeAnimal().equals("Cobra")){
			exchange.getOut().setHeader("ACTION", "call_again");
			exchange.getOut().setBody("Burro");
		}
		
		
		System.out.print(object);
		
	}

}
