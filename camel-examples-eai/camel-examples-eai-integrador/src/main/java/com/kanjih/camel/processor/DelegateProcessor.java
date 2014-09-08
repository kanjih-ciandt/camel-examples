package com.kanjih.camel.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class DelegateProcessor implements Processor  {

	@Override
	public void process(Exchange exchange) throws Exception {
		String animal =  exchange.getIn().getBody(String.class);
		
		if(null == animal){
			throw new Exception("Animal precisa ser passado");
		}
		
		
	}

}
