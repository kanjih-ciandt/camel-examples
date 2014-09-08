package com.kanjih.camel.ws;

import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.xml.bind.annotation.XmlElement;

import com.kanjih.camel.to.Animais;
import com.kanjih.camel.to.JogoBicho;

@WebService
public interface JogoBichoEndpoint {	
	
    
	@WebMethod
	public String abrirJogo(@XmlElement(required=true) @WebParam(name="idJogo") String idJogo);
	
	@WebMethod
	public String listarJogos(@QueryParam("dataInicioBusca") Date dataInicioBusca, @QueryParam("dataFim") Date dataFimBusca );
	
	@WebMethod
	public String resultadoJogo();
	
	@WebMethod
	public String apostar();
	
	@WebMethod
	public String fecharAposta();
	
	@WebMethod
	public String informarNumerosSortiados();
	
	@WebMethod
	public JogoBicho animaisJogo();
	
	@WebMethod
	public Animais procurarPorAnimal(String nomeAnimal);

}
