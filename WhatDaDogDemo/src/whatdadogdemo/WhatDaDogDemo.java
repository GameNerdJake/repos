/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whatdadogdemo;

/**
 *
 * @author jevans
 */
public class WhatDaDogDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DogSpa spa = new DogSpa();
        
        DaDog DaDog1 = new DaDog("DaDog", 3);
        DaDog DaDog2 = new DaDog("DaDog II: The Sequel", 4);
        
        System.out.println(DaDog1.isGroomed());
        System.out.println(DaDog2.isGroomed());
        
        spa.groom(DaDog1);
        spa.groom(DaDog2);
        
        System.out.println(DaDog1.isGroomed());
        System.out.println(DaDog2.isGroomed());
    }
    
}
