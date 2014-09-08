package com.kanjih.camel.to;

import java.io.Serializable;

public class Animais implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7314954627370783675L;
	private Integer numero;
	private String nomeAnimal;
	private Integer primeiraDezena;
	private Integer segundaDezena;
	private Integer terceiraDezena;
	private Integer quartaDezena;

	public Animais() {

	}

	public Animais(int numero, String nomeAnimal, int primeiraDezena,
			int segundaDezena, int terceiraDezena, int quartaDezena) {
		super();
		this.numero = numero;
		this.nomeAnimal = nomeAnimal;
		this.primeiraDezena = primeiraDezena;
		this.segundaDezena = segundaDezena;
		this.terceiraDezena = terceiraDezena;
		this.quartaDezena = quartaDezena;
	}

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param numero
	 *            the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * @return the nomeAnimal
	 */
	public String getNomeAnimal() {
		return nomeAnimal;
	}

	/**
	 * @param nomeAnimal
	 *            the nomeAnimal to set
	 */
	public void setNomeAnimal(String nomeAnimal) {
		this.nomeAnimal = nomeAnimal;
	}

	/**
	 * @return the primeiraDezena
	 */
	public int getPrimeiraDezena() {
		return primeiraDezena;
	}

	/**
	 * @param primeiraDezena
	 *            the primeiraDezena to set
	 */
	public void setPrimeiraDezena(int primeiraDezena) {
		this.primeiraDezena = primeiraDezena;
	}

	/**
	 * @return the segundaDezena
	 */
	public int getSegundaDezena() {
		return segundaDezena;
	}

	/**
	 * @param segundaDezena
	 *            the segundaDezena to set
	 */
	public void setSegundaDezena(int segundaDezena) {
		this.segundaDezena = segundaDezena;
	}

	/**
	 * @return the terceiraDezena
	 */
	public int getTerceiraDezena() {
		return terceiraDezena;
	}

	/**
	 * @param terceiraDezena
	 *            the terceiraDezena to set
	 */
	public void setTerceiraDezena(int terceiraDezena) {
		this.terceiraDezena = terceiraDezena;
	}

	/**
	 * @return the quartaDezena
	 */
	public int getQuartaDezena() {
		return quartaDezena;
	}

	/**
	 * @param quartaDezena
	 *            the quartaDezena to set
	 */
	public void setQuartaDezena(int quartaDezena) {
		this.quartaDezena = quartaDezena;
	}

}
