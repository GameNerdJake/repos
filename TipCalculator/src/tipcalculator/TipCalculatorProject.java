/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipcalculator;

/**
 *
 * @author jevans
 */
public class TipCalculatorProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TipCalculator tipCalculator = new TipCalculator();
        
        double person1 = 10.00;
        double person2 = 12.00;
        double person3 = 15.25;
        double person4 = 9.00;
        double person5 = 27.00;
        
        System.out.println("Person 1's total is: " + tipCalculator.calculateTotal(person1));
        System.out.println("Person 2's total is: " + tipCalculator.calculateTotal(person2));
        System.out.println("Person 3's total is: " + tipCalculator.calculateTotal(person3));
        System.out.println("Person 4's total is: " + tipCalculator.calculateTotal(person4));
        System.out.println("Person 5's total is: " + tipCalculator.calculateTotal(person5));
        
    }
    
}
