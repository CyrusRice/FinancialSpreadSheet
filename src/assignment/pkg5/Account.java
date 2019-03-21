/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg5;
import java.util.*;
/**
 *
 * @author Cyrus
 */
public abstract class Account {
    private Map<Item, Float> sheet;
    private File output;
    private float balance;
    public Account() {
        sheet = new LinkedHashMap<Item, Float>();
        output = new File();
        balance = 0;
    }
    public void add(int num, String description, float amount) {
        Item toAdd = new Item(num, description);
        sheet.put(toAdd, amount);
        balance += amount;
    };
    public void remove(String description) {
        Set<Map.Entry<Item, Float>> sheetSet = sheet.entrySet();
        for(Map.Entry<Item, Float> s: sheetSet) {
            if(s.getKey().getDescription().equals(description)) {
                balance -= s.getValue();
                sheet.remove(s.getKey());           
                return;
            }
        }
    };
    public void search(String description) {
        output.openFile();
        output.addHeader();
        Set<Map.Entry<Item, Float>> sheetSet = sheet.entrySet();        
        for(Map.Entry<Item, Float> s: sheetSet) {            
            if(s.getKey().getDescription().equals(description)) {
                if(s.getValue() < 0) {
                    output.addDebit(s.getKey().getNum(), s.getKey().getDescription(), s.getValue());
                } else {
                    output.addCredit(s.getKey().getNum(), s.getKey().getDescription(), s.getValue());
                }
            }
        }
        output.closeFile();    
        System.out.println("The file sheet.txt has been created showing the requested item in the requested account");
    };
    
    public void print() {
        output.openFile();
        output.addHeader();
        Set<Map.Entry<Item, Float>> sheetSet = sheet.entrySet();
        for(Map.Entry<Item, Float> s: sheetSet) {
            if(s.getValue() < 0) {
                output.addDebit(s.getKey().getNum(), s.getKey().getDescription(), s.getValue());
            } else {
                output.addCredit(s.getKey().getNum(), s.getKey().getDescription(), s.getValue());
            }
        }
        output.addBalance(balance);
        output.closeFile();
        System.out.println("The file sheet.txt has been created showing this account's charges");
    };
    public void identify() {
        System.out.println("This is your Account");
    }
}
