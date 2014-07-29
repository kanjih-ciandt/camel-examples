package com.kanjih.camel.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.beans.factory.annotation.Autowired;

import com.kanjih.camel.business.BusinessMerchant;
import com.kanjih.camel.canonical.v1.Merchant;

public class MerchantProcessor implements Processor {
	
	@Autowired
	private BusinessMerchant businessMerchant; 

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
		merchant.setName("Hello "+request.getName());
		
		businessMerchant.put(merchant);
		exchange.getOut().setBody(merchant);
	}
	
	private void get(Exchange exchange) {
		Long request = exchange.getIn().getBody(Long.class);
		
		Merchant merchant = businessMerchant.get(request);		
		exchange.getOut().setBody(merchant);
	}

}
