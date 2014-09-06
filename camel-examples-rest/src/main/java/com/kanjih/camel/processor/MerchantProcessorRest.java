package com.kanjih.camel.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.beans.factory.annotation.Autowired;

import com.kanjih.camel.business.BusinessMerchantRest;
import com.kanjih.camel.canonical.v1.Merchant;

public class MerchantProcessorRest implements Processor {
	
	@Autowired
	private BusinessMerchantRest businessMerchant; 

	@Override
	public void process(Exchange exchange) throws Exception {
		
		System.out.println("body in " + exchange.getIn().getBody());
		System.out.println("body out " + exchange.getOut().getBody());
		
		System.out.println("header in " + exchange.getIn().getHeaders());
		System.out.println("header out " + exchange.getOut().getHeaders());

		Merchant merchant = new Merchant();
		merchant.setMcc(1L);
		merchant.setName("Teste");
		merchant.setNumber(1L);
		exchange.getOut().setBody(merchant);
		
//		if(exchange.getIn().getHeader("operationName").equals("create")){
//			create(exchange);
//		}else{
//			get(exchange);
//		}
		
		
		
		
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
