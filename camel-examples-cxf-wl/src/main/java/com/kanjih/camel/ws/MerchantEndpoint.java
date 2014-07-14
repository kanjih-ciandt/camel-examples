package com.kanjih.camel.ws;

import javax.jws.WebService;

import com.kanjih.camel.canonical.v1.Merchant;

@WebService
public interface MerchantEndpoint {
    Merchant create(Merchant merchant);
    
    Merchant get(Long longNumber);

}
