package com.openintl.api.ois.impl;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import com.openintl.api.ois.IServiceSoapClient;
import com.openintl.api.ois.entities.JsonBean;

@Path("/consumers/soap")
public class ServiceSoapClient implements IServiceSoapClient{

 
    public String getSoapClientById(@PathParam("_id") String _id) {    	
        return "Regards " + _id+ "!!!";
    }
    
   
    public List<String> getAllSoapClients() {
    	
    	List<String> lista =  new ArrayList<String>();
    	lista.add("Objeto 1");
    	lista.add("Objeto 2");
    	lista.add("Objeto 3");
    	lista.add("Objeto 4");
    	lista.add("Objeto 5");
        return lista;
    }

    
    public Response generateNewSoapClient(JsonBean input) {
        input.setVal2(input.getVal1());
        return Response.ok().entity(input).build();
    }
}

