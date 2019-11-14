/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphisme;

/**
 *
 * @author H4NS
 */
public class AeroPlane extends Vehicle{
    public void walk(){
        System.out.println("AeroPlane is Flying");
    }
    public static void main(String[] args) {
        AeroPlane garuda = new AeroPlane();
        garuda.function();
        garuda.fuel();
        garuda.walk();
    }
}
