package com.kanjih.camel.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;

import com.kanjih.camel.canonical.v1.Merchant;

@WebService
public interface MerchantEndpoint {
	
	@WebMethod
    Merchant create(@XmlElement(required=true) @WebParam(name="Merchant") Merchant merchant);
    
    Merchant get(Long longNumber);

}
