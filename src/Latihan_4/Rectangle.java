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
public class Rectangle extends Shape{
    private int length;
    private int width;
    
    public Rectangle(String color,int length,int witdh){
        super(color);
        this.length= length;
        this.width = witdh;
    }
  public String toString(){
      return "Rectangle[length ="+length+",witdh="+","+super.toString()+"]";
  }
  public double getArea(){
      return length*width;
  }
}
