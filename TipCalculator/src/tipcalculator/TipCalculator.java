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
public class TipCalculator {
    
    private final double TAX_RATE = .05;
    private final double TIP_RATE = .15;
    
    public double calculateTotal(double foodTotal)       
    {
        double total = foodTotal*(1 + TAX_RATE + TIP_RATE);
        return total;
    }
}
