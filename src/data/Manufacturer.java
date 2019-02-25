/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.ArrayList;

/**
 *
 * @author hquiroga
 */
public class Manufacturer extends Process{
    private ArrayList<Product> productsUsed;

    public Manufacturer(String name, String description, int latitude, int longitude) {
        super(name, description, latitude, longitude);
    }

    public ArrayList<Product> getProductsUsed() {
        return productsUsed;
    }

    public void setProductsUsed(ArrayList<Product> productsUsed) {
        this.productsUsed = productsUsed;
    }
    
}
