/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan_4;

/**
 *
 * @author H4NS
 */
public class Shape {
    private String color;
    
    public Shape(String Color){
     this.color= Color;
    }
    public String toString(){
        return "Sahpe[color="+ color + "]";
    }
    public double getArea(){
        System.err.println("Shape Unknown! Cannt Compute Area");
        return 0;
    }
}
