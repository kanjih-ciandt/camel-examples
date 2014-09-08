package com.kanjih.camel.rest;

import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

/**
 * # abrir jogo {idJogo}- {Status}
 * # listar jogos {dataInicioBusca,dataFimBusca} - {lista de jogos}
 * # resultado jogo {idJogo} {jogo}
 * # apostar {idSessionJogador, idJogo, valorAposta, numeroBichoApostado}
 * # fechar aposta {idJogo}-{status:fechado, list[jogadores]}
 * # numeroSortiado
 * # animaisJogo {}-{listajogos}
 * @author kanjih
 *
 */
public class JogoBichoRestServer {
	
	@GET
	@Path("/abrirJogo")
	@Produces("application/json")
	public String abrirJogo(@QueryParam("idJogo") String idJogo){
		return null;
	}
	
	@GET
	@Path("/listarJogos")
	@Produces("application/json")
	public String listarJogos(@QueryParam("dataInicioBusca") Date dataInicioBusca, @QueryParam("dataFim") Date dataFimBusca ){
		return null;
	}
	
	@GET
	@Path("/resultadoJogo")
	@Produces("application/json")
	public String resultadoJogo(){
		return null;
	}
	
	@GET
	@Path("/apostar")
	@Produces("application/json")
	public String apostar(){
		return null;
	}
	
	@GET
	@Path("/fecharAposta")
	@Produces("application/json")
	public String fecharAposta(){
		return null;
	}
	
	@GET
	@Path("/informarNumerosSortiados")
	@Produces("application/json")
	public String informarNumerosSortiados(){
		return null;
	}
	
	@GET
	@Path("/animaisDoJogo")
	@Produces("application/json")
	public String animaisJogo(){
		return null;
	}
	
	@GET
	@Path("/procurarPorAnimal")
	@Produces("application/json")
	public String procurarPorAnimal(@QueryParam("nomeAnimal") String nomeAnimal){
		return null;
	}
	
	

}
