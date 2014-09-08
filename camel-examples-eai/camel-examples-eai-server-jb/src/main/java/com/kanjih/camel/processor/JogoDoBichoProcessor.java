package com.kanjih.camel.processor;

import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.beans.factory.annotation.Autowired;

import com.kanjih.camel.bs.JogoBichoBusinessService;
import com.kanjih.camel.to.Animais;
import com.kanjih.camel.to.JogoBicho;

public class JogoDoBichoProcessor implements Processor {
	
	@Autowired
	private JogoBichoBusinessService jogoBichoBusinessService; 

	@Override
	public void process(Exchange exchange) throws Exception {

		if (exchange.getIn().getHeader("operationName").equals("abrirJogo")) {
			this.abrirJogo(exchange);
		} else if (exchange.getIn().getHeader("operationName")
				.equals("listarJogos")) {
			this.listarJogos(exchange);
		} else if (exchange.getIn().getHeader("operationName")
				.equals("resultadoJogo")) {
			this.resultadoJogo(exchange);
		} else if (exchange.getIn().getHeader("operationName")
				.equals("apostar")) {
			this.apostar(exchange);
		} else if (exchange.getIn().getHeader("operationName")
				.equals("fecharAposta")) {
			this.fecharAposta(exchange);
		} else if (exchange.getIn().getHeader("operationName")
				.equals("informarNumerosSortiados")) {
			this.informarNumerosSortiados(exchange);
		} else if (exchange.getIn().getHeader("operationName")
				.equals("animaisJogo")) {
			this.animaisDoJogo(exchange);
		} else if (exchange.getIn().getHeader("operationName")
				.equals("procurarPorAnimal")) {
			this.procurarPorAnimal(exchange);
			
		} else {
			throw new Exception();
		}

	}

	private void abrirJogo(Exchange exchange) {

	}

	private void listarJogos(Exchange exchange) {

	}

	private void resultadoJogo(Exchange exchange) {

	}

	private void apostar(Exchange exchange) {

	}

	private void fecharAposta(Exchange exchange) {

	}

	private void informarNumerosSortiados(Exchange exchange) {

	}

	private void animaisDoJogo(Exchange exchange) {
		List<Animais> list = jogoBichoBusinessService.listarJogos();
		JogoBicho jogoBicho = new JogoBicho();
		jogoBicho.setAnimaisJogo(list);				 
		exchange.getOut().setBody(jogoBicho);		

	}
	
	private void procurarPorAnimal(Exchange exchange) {
		String nomeAnimal =  exchange.getIn().getBody(String.class);
		 
		Animais animais =  jogoBichoBusinessService.acharAnimal(nomeAnimal);
		exchange.getOut().setBody(animais);

	}

}
