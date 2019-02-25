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
public class ManufacturedProduct extends FarmProduct{
    
    protected Manufacturer manufacturedIn;

    public ManufacturedProduct(Manufacturer manufacturedIn, String name, Farmer originFarm) {
        super(name, originFarm);
        this.manufacturedIn = manufacturedIn;
    }
    
    
}
