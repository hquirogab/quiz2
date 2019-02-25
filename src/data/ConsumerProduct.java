/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author jucardenasg
 */
public class ConsumerProduct extends DistributableProduct{
    private Retail soldBy;

    public ConsumerProduct(Retail soldBy, DistributionCenter distributedBy, Manufacturer manufacturedIn, String name, Farmer originFarm) {
        super(distributedBy, manufacturedIn, name, originFarm);
        this.soldBy = soldBy;
    }

    public Retail getSoldBy() {
        return soldBy;
    }

    public void setSoldBy(Retail soldBy) {
        this.soldBy = soldBy;
    }
}
