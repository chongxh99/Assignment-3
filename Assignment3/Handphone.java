/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import java.io.*;
/**
 *
 * @author Admin
 */
public class Handphone implements Serializable {
    private String hp;
    private double hpCost;
    private double hpPrice;
    
    public boolean equals(Handphone h){
        return (this.hp.equals(h.hp) && this.hpCost == h.hpCost && 
                this.hpPrice == h.hpPrice );
    }
    
    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public double getHpCost() {
        return hpCost;
    }

    public void setHpCost(double hpCost) {
        this.hpCost = hpCost;
    }

    public double getHpPrice() {
        return hpPrice;
    }

    public void setHpPrice(double hpPrice) {
        this.hpPrice = hpPrice;
    }

    public Handphone(String hp, double hpCost, double hpPrice) {
        this.hp = hp;
        this.hpCost = hpCost;
        this.hpPrice = hpPrice;
    }
    
}
