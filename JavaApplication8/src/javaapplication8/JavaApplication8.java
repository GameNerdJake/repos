/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.util.Scanner;

/**
 *
 * @author jevans
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your grade");
        int grade = sc.nextInt();
        
        switch(grade){
            case 9:
                System.out.println("Freshman");
                break;
                
            case 10:
                System.out.println("Sophomore");
                break;
                
            case 11:
                System.out.println("Junior");
                break; 
                
            case 12:
                System.out.println("Senior");
                break; 
                
            default:
                System.out.println("Bad data entered");
        }
    }
}
                
    
