/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import javax.inject.Inject;
import newQualifies.OnlineServiceQuery;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author Mobile Apps
 */
@Named
@RequestScoped
public class ProductService {

    //@OnlineServiceQuery
    @Inject
    
    private ProductImpl productOnline;

    public List<String> getAllProduct() {

        productOnline.addProduct("Sugar");
        productOnline.addProduct("Bread");
        productOnline.addProduct("Tea");

        return productOnline.getProducts();
    }
}
