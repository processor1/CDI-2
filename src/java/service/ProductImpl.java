/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import interfaces.Product;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Mobile Apps
 */
public class ProductImpl implements Product {

    List<String> products = new ArrayList<>();

    @Override
    public void addProduct(String product) {

        products.add(product);
    }

    @Override
    public List getProducts() {

        return this.products;
    }

}
