/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Keskiarvo;

import java.util.ArrayList;

/**
 *
 * @author antti
 */
public class Keskiarvo {

    public double laske(ArrayList<Integer> arvosanat) {
        double ka;
        int summa = 0;
        
        for (int arvosana : arvosanat) {
            summa += arvosana;
        }
        
        ka = summa / (double) arvosanat.size();
        
        return ka;
    }
    
}
