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
public abstract class Vehicle {
    public void function(){
        System.out.println("Trasnportation Tools");
    }
        public void fuel(){
            
            System.out.println("Fuels");
        }
        public abstract void walk();
}
