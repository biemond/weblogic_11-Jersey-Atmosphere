package nl.amis.rest.product.applications;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import nl.amis.rest.product.services.Product;

public class ProductApplication extends Application {
    public ProductApplication() {
        super();
    }


    @Override
    public Set<Class<?>> getClasses() {
        
        final Set<Class<?>> classes = new HashSet<Class<?>>();
        // register root resource
        classes.add(Product.class);
        return classes;
    }

}
