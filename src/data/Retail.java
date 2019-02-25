/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.HashMap;

/**
 *
 * @author hquiroga
 */
public class Retail extends Process {
    private HashMap<Product, Integer> productsOnSale;

    public Retail(HashMap<Product, Integer> productsOnSale, String name, String description, int latitude, int longitude) {
        super(name, description, latitude, longitude);
        this.productsOnSale = productsOnSale;
    }

    public HashMap<Product, Integer> getProductsOnSale() {
        return productsOnSale;
    }

    public void setProductsOnSale(HashMap<Product, Integer> productsOnSale) {
        this.productsOnSale = productsOnSale;
    }
    
    
}
