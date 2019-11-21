/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elementos.eléctricos;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class ElementosEléctricos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Resistencia> fibradecarbon = new ArrayList <>();
        
        Resistencia r1 = new Resistencia("Metal Film",22,1/4,1);
        Resistencia r2 = new Resistencia("Metal Film",15,1/4,1);
        Resistencia r3 = new Resistencia("Fibra de carbón",22,1/4,5);
        Resistencia r4 = new Resistencia("SMD 1210",27,1/4,5);
        Resistencia r5 = new Resistencia("SMD 0805",27,1/10,5);
        Resistencia r6 = new Resistencia("Fibra de carbón",22,1/4,5);
        Resistencia r7 = new Resistencia("Fibra de carbón",33,1/4,5);
        
        if(r1.equals(r2))
            System.out.println("Son iguales.");
        else
            System.out.println("No son iguales.");
    }
}