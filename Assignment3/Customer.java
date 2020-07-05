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
public class Customer implements Serializable{
    private String name; 
    private double number;
    private Handphone hp;
    private double price;

    public Customer(String name, double number, Handphone  hp) {
        this.name = name;
        this.number = number;
        this.hp = hp;
    }
    
    public boolean equals(Customer cus){
        return (this.name.equals(cus.name) && this.number == cus.number && 
                this.hp.equals(cus.hp) && this.price == cus.price);
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }


    public Handphone getHp() {
        return hp;
    }

    public void setHp(Handphone hp) {
        this.hp = hp;
    }
    
}