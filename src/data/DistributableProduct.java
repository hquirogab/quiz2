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
public class DistributableProduct extends ManufacturedProduct{
    protected DistributionCenter distributedBy;

    public DistributableProduct(DistributionCenter distributedBy, Manufacturer manufacturedIn, String name, Farmer originFarm) {
        super(manufacturedIn, name, originFarm);
        this.distributedBy = distributedBy;
    }
    
}
