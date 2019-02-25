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
public class FarmProduct extends Product {

    protected Farmer originFarm;
    
    public FarmProduct(String name, Farmer originFarm) {
        super(name);
        this.originFarm = originFarm;
    }
}
