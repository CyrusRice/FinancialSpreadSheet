/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg5;

/**
 *
 * @author Cyrus
 */
public class Card extends Account{
    public Card() {
        super();
    }
    
    @Override
    public void identify() {
        System.out.println("This is your Card Account");
    }
}