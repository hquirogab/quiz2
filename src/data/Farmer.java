/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author hquiroga
 */
public class Farmer extends Process {
    private String productionType;

    public Farmer(String productionType, String name, String description, int latitude, int longitude) {
        super(name, description, latitude, longitude);
        this.productionType = productionType;
    }
    
    public FarmProduct produce( Farmer origin){
        FarmProduct farmProduct;
        farmProduct = new FarmProduct(productionType, origin);
        return farmProduct;
    }

    public String getProductionType() {
        return productionType;
    }

    public void setProductionType(String productionType) {
        this.productionType = productionType;
    }
}
