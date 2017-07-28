package com.openintl.api.ois;


import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.model.wadl.Description;

import com.openintl.api.ois.entities.JsonBean;
import com.openintl.api.ois.entities.WebService;

@Path("/consumers/soap")
public interface IServiceSoapClient {

    @GET
    @Path("/")
    @Produces({"application/xml", "application/json"})
    @Description("Descripción: obtener objetos ...")
    public List<WebService> getAllSoapClients();
	
   
    @GET
    @Path("/{id}")
    @Produces({"application/json"})
    @Description("Descripción: obtener objetos ...")
    public WebService getSoapClientById(@PathParam("id") String id);
    
    
    @POST
    @Produces("application/json")
    @Consumes("application/json")
    @Path("/")
    public Response generateNewSoapClient(JsonBean input);
}
