package com.kanjih.camel.canonical.v1;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * EC - Estabelecimento Comercial
 * 
 * @author kanjih
 *
 */
@XmlAccessorType (XmlAccessType.FIELD)
public class Merchant implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8423685456760596144L;

	@XmlElement(required=true)
	private Long number;
	
	//Merchant Category Codes Segmento de Mercado
	private Long mcc;
	
	private String name;

	/**
	 * @return the number
	 */
	public Long getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(Long number) {
		this.number = number;
	}

	/**
	 * @return the mcc
	 */
	public Long getMcc() {
		return mcc;
	}

	/**
	 * @param mcc the mcc to set
	 */
	public void setMcc(Long mcc) {
		this.mcc = mcc;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}	
	
	
	

}
