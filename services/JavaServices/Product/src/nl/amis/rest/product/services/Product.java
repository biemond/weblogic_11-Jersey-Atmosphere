package nl.amis.rest.product.services;


import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/products")
public class Product {
    public Product() {
    }

    @GET
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public Response getProducts() {
        try {
          List<nl.amis.rest.product.entities.Product> products = new ArrayList(); 
          nl.amis.rest.product.entities.Product xbox = new nl.amis.rest.product.entities.Product();
          xbox.setName("xbox");
          xbox.setDescription("Xbox one");  
          xbox.setOnStock(100);  
          products.add(xbox);
          nl.amis.rest.product.entities.Product playstation = new nl.amis.rest.product.entities.Product();
          playstation.setName("playstation"); 
          playstation.setDescription("Sony Playstation 4"); 
          playstation.setOnStock(50);  
          products.add(playstation);
                   
          return  Response.ok( products.toArray( new nl.amis.rest.product.entities.Product[products.size()])).build();
        }  catch (Throwable t) {
            t.printStackTrace();
          return Response.status(Response.Status.NOT_ACCEPTABLE).build();   
        }

    }

    @GET
    @Path("/{product}")
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public Response getProduct( @PathParam("product")  String name) {
        try {
            
          nl.amis.rest.product.entities.Product product = new nl.amis.rest.product.entities.Product();
          if ( "xbox".equalsIgnoreCase(name)) {
            product.setName("xbox");
            product.setDescription("Xbox one");  
            product.setOnStock(100);  

          }  else if ("playstation".equalsIgnoreCase(name)) {
            product.setName("playstation");    
            product.setDescription("Sony Playstation 4"); 
            product.setOnStock(50);  

          } else {
              return Response.status(Response.Status.NOT_ACCEPTABLE).build(); 
          }
                   
          return  Response.ok( product ).build();
        }  catch (Throwable t) {
            t.printStackTrace();
          return Response.status(Response.Status.NOT_ACCEPTABLE).build();   
        }

    }


}
