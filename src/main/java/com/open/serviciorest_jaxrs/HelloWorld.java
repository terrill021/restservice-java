package com.open.serviciorest_jaxrs;
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

@Path("/hello")
public class HelloWorld {

    @GET
    @Path("/regard/{input}")
    @Produces({"application/xml", "application/json"})
    @Description("Descripción: obtener objetos ...")
    public String ping(@PathParam("input") String input) {    	
        return "Regards " + input + "!!!";
    }
    
    @GET
    @Path("/objects")
    @Produces({"application/xml", "application/json"})
    @Description("Descripción: obtener objetos ...")
    public List<String> objects() {
    	
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
    @Path("/jsonBean")
    public Response modifyJson(JsonBean input) {
        input.setVal2(input.getVal1());
        return Response.ok().entity(input).build();
    }
}

