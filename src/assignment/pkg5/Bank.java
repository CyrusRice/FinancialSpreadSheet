/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg5;

import java.util.Map;
import java.util.Set;

/**
 *
 * @author Cyrus
 */
public class Bank extends Account{
    private Map<Item, Float> sheet;
    private File output;
    public Bank() {
        super();
    }
    
   @Override
    public void identify() {
        System.out.println("This is your Bank Account");
    }       
}
