package com.openintl.api.ois;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.model.wadl.Description;

import com.open.serviciorest_jaxrs.JsonBean;

@Path("/consumers/soap")
public class ServiceSoapClient {

    @GET
    @Path("/{_id}")
    @Produces({"application/json"})
    @Description("Descripción: obtener objetos ...")
    public String getSoapClientById(@PathParam("_id") String _id) {    	
        return "Regards " + _id+ "!!!";
    }
    
    @GET
    @Path("/")
    @Produces({"application/xml", "application/json"})
    @Description("Descripción: obtener objetos ...")
    public List<String> getAllSoapClients() {
    	
    	List<String> lista =  new ArrayList<String>();
    	lista.add("Objeto 1");
    	lista.add("Objeto 2");
    	lista.add("Objeto 3");
    	lista.add("Objeto 4");
    	lista.add("Objeto 5");
        return lista;
    }

    @POST
    @Produces("application/json")
    @Consumes("application/json")
    @Path("/")
    public Response generateNewSoapClient(JsonBean input) {
        input.setVal2(input.getVal1());
        return Response.ok().entity(input).build();
    }
}

