package com.openintl.api.ois.impl;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.model.wadl.Description;
import org.springframework.beans.factory.annotation.Autowired;


import com.openintl.api.ois.IServiceSoapClient;
import com.openintl.api.ois.entities.JsonBean;
import com.openintl.api.ois.entities.WebService;
import com.openintl.repository.crudinterface.ICrudRepository;


public class ServiceSoapClient implements IServiceSoapClient {

	@Autowired
	ICrudRepository repository;
	
	/**
	 * 
	 */	
    public WebService getSoapClientById(@PathParam("_id") String _id) {    	
    	ICrudRepository<WebService, String> webServiceRepository= repository;    	
    	return webServiceRepository.findOne(_id, WebService.class);    
	}    
   
    /**
     * 
     */
    public List<WebService> getAllSoapClients() {
   	  
      ICrudRepository<WebService, String>WebServiceRepository = repository;
   	  return WebServiceRepository.getAllObjects(WebService.class);
    }
    
    /**
     * 
     */
    public Response generateNewSoapClient(JsonBean input) {
        input.setVal2(input.getVal1());
        return Response.ok().entity(input).build();
    }
  
}

