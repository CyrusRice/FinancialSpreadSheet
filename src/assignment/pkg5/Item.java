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
public class Item {
    private final int num;
    private final String description;
    public Item(int num, String description) {
        this.num = num;
        this.description = description;
    }
    public int getNum() {
        return this.num;
    }
    public String getDescription() {
        return this.description;
    }
}
