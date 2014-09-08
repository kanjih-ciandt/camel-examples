package com.kanjih.camel.to;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Sorteio {
	
	private String id;
	private Date dataInicio;
	private Date dataFim;
	private int dezenaGanhadora;
	private Animais animalGanhador;
	private List<Aposta> apostas;
	
	private int status;
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the dataInicio
	 */
	public Date getDataInicio() {
		return dataInicio;
	}
	/**
	 * @param dataInicio the dataInicio to set
	 */
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	/**
	 * @return the dataFim
	 */
	public Date getDataFim() {
		return dataFim;
	}
	/**
	 * @param dataFim the dataFim to set
	 */
	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}
	/**
	 * @return the dezenaGanhadora
	 */
	public int getDezenaGanhadora() {
		return dezenaGanhadora;
	}
	/**
	 * @param dezenaGanhadora the dezenaGanhadora to set
	 */
	public void setDezenaGanhadora(int dezenaGanhadora) {
		this.dezenaGanhadora = dezenaGanhadora;
	}
	/**
	 * @return the animalGanhador
	 */
	public Animais getAnimalGanhador() {
		return animalGanhador;
	}
	/**
	 * @param animalGanhador the animalGanhador to set
	 */
	public void setAnimalGanhador(Animais animalGanhador) {
		this.animalGanhador = animalGanhador;
	}
	/**
	 * @return the status
	 */
	public int getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(int status) {
		this.status = status;
	}
	/**
	 * @return the apostas
	 */
	public List<Aposta> getApostas() {
		return apostas;
	}
	/**
	 * @param apostas the apostas to set
	 */
	public void setApostas(List<Aposta> apostas) {
		this.apostas = apostas;
	}
	
	public void addAposta(Aposta aposta){
		List<Aposta> apostas = this.getApostas();
		if(apostas == null) {
			apostas = new ArrayList<Aposta>();
		}
		
		apostas.add(aposta);
	}
	
	
}
