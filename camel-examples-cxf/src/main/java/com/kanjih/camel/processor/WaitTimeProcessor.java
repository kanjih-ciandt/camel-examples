package com.kanjih.camel.processor;

import java.util.UUID;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.kanjih.camel.canonical.v1.Merchant;

public class WaitTimeProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		
		Merchant request = exchange.getIn().getBody(Merchant.class);
		System.out.println(request);
		Merchant merchant = new Merchant();
		merchant.setMcc((long) (Math.random() * 200));
		
		merchant.setNumber((long) (Math.random() * 100));
		merchant.setName("WAIT TIME");
		exchange.getOut().setBody(merchant);
		
	}

}
