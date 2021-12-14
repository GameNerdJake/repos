/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraydemo;

/**
 *
 * @author jevans
 */
public class ArrayDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Grape", "Orange", "Lemon", "Pear", "Tomato", "Mango"};
        
        for(int i =0; i < fruits.length; i++){
            fruits[i] = "unknown";
        }
        
        for(String fruit : fruits)
        {
            System.out.println(fruit);
        }
        
    }
    
}
