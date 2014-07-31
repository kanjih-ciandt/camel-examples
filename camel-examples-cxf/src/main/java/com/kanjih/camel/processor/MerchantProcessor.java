package com.kanjih.camel.processor;

import java.util.UUID;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.kanjih.camel.canonical.v1.Merchant;

public class MerchantProcessor implements Processor {
	
	

	@Override
	public void process(Exchange exchange) throws Exception {
		
		if(exchange.getIn().getHeader("operationName").equals("create")){
			create(exchange);
		}else{
			get(exchange);
		}
		
		
		
		
	}

	private void create(Exchange exchange) {
		Merchant request = exchange.getIn().getBody(Merchant.class);
		System.out.println(request);
		Merchant merchant = new Merchant();
		merchant.setMcc((long) (Math.random() * 200));
		
		merchant.setNumber((long) (Math.random() * 100));
		merchant.setName(UUID.randomUUID().toString());
		
		
		exchange.getOut().setBody(merchant);
	}
	
	private void get(Exchange exchange) {
		Long request = exchange.getIn().getBody(Long.class);
		
				
		exchange.getOut().setBody(request);
	}

}
