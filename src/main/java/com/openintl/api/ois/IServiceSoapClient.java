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

public interface IServiceSoapClient {

	@GET
    @Path("/{_id}")
    @Produces({"application/json"})
    @Description("Descripción: obtener objetos ...")
    public String getSoapClientById(@PathParam("_id") String _id);
    
    @GET
    @Path("/")
    @Produces({"application/xml", "application/json"})
    @Description("Descripción: obtener objetos ...")
    public List<String> getAllSoapClients();

    
    @POST
    @Produces("application/json")
    @Consumes("application/json")
    @Path("/")
    public Response generateNewSoapClient(JsonBean input);
}
